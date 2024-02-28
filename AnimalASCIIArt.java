//Hayden
import java.util.Scanner;

public class AnimalASCIIArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What animal would you like to see(cat or dog)?");
        String choice;
        choice = scan.next();

        if (choice.equals("cat")) {
            System.out.println("cat ASCII art");
        } else if (choice.equals("dog")) {
            System.out.println("dog ASCII art");
            scan.close();
        }


    }
}
