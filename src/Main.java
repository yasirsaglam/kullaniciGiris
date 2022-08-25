import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password1, password = "123java", password2, sorgu;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password1 = input.nextLine();
        if (userName.equals("patika") && password1.equals(password)) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Yanlış bilgi girdiniz. Şifrenizi sıfırlamak ister misiniz : (Evet/Hayır)");
            sorgu = input.nextLine();
            if (sorgu.equals("Evet")) {
                System.out.println("Yeni şifrenizi giriniz !");
                password2 = input.nextLine();
                if (password2.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, yeniden deneyiniz.");
                } else {
                    System.out.println("Şifre başarıyla değiştirildi.");
                }
            } else if (sorgu.equals("Hayır"))
                System.out.println("Bilgilerinizi kontrol ederek yeniden deneyiniz !");
        }
    }
}

