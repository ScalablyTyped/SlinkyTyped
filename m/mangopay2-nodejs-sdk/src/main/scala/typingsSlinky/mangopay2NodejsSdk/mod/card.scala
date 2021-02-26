package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object card {
  
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
    implicit class CardDataMutableBuilder[Self <: CardData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankCode(value: String): Self = StObject.set(x, "BankCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardProvider(value: String): Self = StObject.set(x, "CardProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidity(value: CardValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR
  */
  trait CardStatus extends StObject
  object CardStatus {
    
    @scala.inline
    def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
    
    @scala.inline
    def ERROR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR]
    
    @scala.inline
    def VALIDATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB
  */
  trait CardType extends StObject
  object CardType {
    
    @scala.inline
    def BCMC: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC = "BCMC".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BCMC]
    
    @scala.inline
    def CB_VISA_MASTERCARD: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD = "CB_VISA_MASTERCARD".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CB_VISA_MASTERCARD]
    
    @scala.inline
    def DINERS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS = "DINERS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DINERS]
    
    @scala.inline
    def IDEAL: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL = "IDEAL".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDEAL]
    
    @scala.inline
    def MAESTRO: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO = "MAESTRO".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAESTRO]
    
    @scala.inline
    def MASTERPASS: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS = "MASTERPASS".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MASTERPASS]
    
    @scala.inline
    def P24: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24 = "P24".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.P24]
    
    @scala.inline
    def PAYLIB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB = "PAYLIB".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYLIB]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
    - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
  */
  trait CardValidity extends StObject
  object CardValidity {
    
    @scala.inline
    def INVALID: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = "INVALID".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
    
    @scala.inline
    def VALID: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = "VALID".asInstanceOf[typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID]
  }
  
  @js.native
  trait UpdateCard extends StObject {
    
    var Active: js.UndefOr[`false`] = js.native
    
    var Id: String = js.native
  }
  object UpdateCard {
    
    @scala.inline
    def apply(Id: String): UpdateCard = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCard]
    }
    
    @scala.inline
    implicit class UpdateCardMutableBuilder[Self <: UpdateCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: `false`): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    }
  }
}
