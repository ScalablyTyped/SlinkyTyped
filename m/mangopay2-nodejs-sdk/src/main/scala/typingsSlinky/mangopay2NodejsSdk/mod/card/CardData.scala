package typingsSlinky.mangopay2NodejsSdk.mod.card

import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardData extends EntityBaseData {
  /**
    * Whether the card is active or not
    */
  var Active: Boolean = js.native
  /**
    * A partially obfuscated version of the credit card number
    */
  var Alias: String = js.native
  /**
    * The bank code
    */
  var BankCode: String = js.native
  /**
    * The provider of the card
    */
  var CardProvider: String = js.native
  /**
    * The type of card
    */
  var CardType: typingsSlinky.mangopay2NodejsSdk.mod.card.CardType = js.native
  /**
    * The Country of the Address
    */
  var Country: String = js.native
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO = js.native
  /**
    * The expiry date of the card - must be in format MMYY
    */
  var ExpirationDate: String = js.native
  /**
    * A unique representation of a 16-digits card number
    */
  var Fingerprint: String = js.native
  /**
    * The card product type - more info
    */
  var Product: String = js.native
  /**
    * Whether the card is valid or not. Once they process (or attempt to process) a payment with the card we are able to indicate if it is "valid" or "invalid".
    * If they didn’t process a payment yet the "Validity" stay at "unknown".
    */
  var Validity: CardValidity = js.native
}

object CardData {
  @scala.inline
  def apply(
    Active: Boolean,
    Alias: String,
    BankCode: String,
    CardProvider: String,
    CardType: CardType,
    Country: String,
    CreationDate: Double,
    Currency: CurrencyISO,
    ExpirationDate: String,
    Fingerprint: String,
    Id: String,
    Product: String,
    Tag: String,
    Validity: CardValidity
  ): CardData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Alias = Alias.asInstanceOf[js.Any], BankCode = BankCode.asInstanceOf[js.Any], CardProvider = CardProvider.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Fingerprint = Fingerprint.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardData]
  }
  @scala.inline
  implicit class CardDataOps[Self <: CardData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: CardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: CardValidity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

