package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.card.CardStatus
import typingsSlinky.mangopay2NodejsSdk.mod.card.CardType
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardRegistration {
  
  @js.native
  trait CardRegistrationData extends EntityBaseData {
    
    /**
      * A special key to use when registering a card
      */
    var AccessKey: String = js.native
    
    /**
      * The ID of a card
      */
    var CardId: String = js.native
    
    /**
      * The URL to submit the card details form to
      */
    var CardRegistrationURL: String = js.native
    
    /**
      * The type of card
      */
    var CardType: typingsSlinky.mangopay2NodejsSdk.mod.card.CardType = js.native
    
    /**
      * The currency - should be ISO_4217 format
      */
    var Currency: CurrencyISO = js.native
    
    /**
      * A specific value to pass to the CardRegistrationURL
      */
    var PreregistrationData: String = js.native
    
    /**
      * Having registered a card, this confirmation hash needs to be updated to the card item
      */
    var RegistrationData: String = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * Status of the card registration
      */
    var Status: CardStatus = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
  }
  object CardRegistrationData {
    
    @scala.inline
    def apply(
      AccessKey: String,
      CardId: String,
      CardRegistrationURL: String,
      CardType: CardType,
      CreationDate: Double,
      Currency: CurrencyISO,
      Id: String,
      PreregistrationData: String,
      RegistrationData: String,
      ResultCode: String,
      ResultMessage: String,
      Status: CardStatus,
      Tag: String,
      UserId: String
    ): CardRegistrationData = {
      val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CardRegistrationURL = CardRegistrationURL.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PreregistrationData = PreregistrationData.asInstanceOf[js.Any], RegistrationData = RegistrationData.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardRegistrationData]
    }
    
    @scala.inline
    implicit class CardRegistrationDataMutableBuilder[Self <: CardRegistrationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardRegistrationURL(value: String): Self = StObject.set(x, "CardRegistrationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreregistrationData(value: String): Self = StObject.set(x, "PreregistrationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationData(value: String): Self = StObject.set(x, "RegistrationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: CardStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'CardType' | 'Tag', 'UserId' | 'Currency'> */
  @js.native
  trait CreateCardRegistration extends StObject {
    
    var CardType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.card.CardType] = js.native
    
    var Currency: CurrencyISO = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var UserId: String = js.native
  }
  object CreateCardRegistration {
    
    @scala.inline
    def apply(Currency: CurrencyISO, UserId: String): CreateCardRegistration = {
      val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardRegistration]
    }
    
    @scala.inline
    implicit class CreateCardRegistrationMutableBuilder[Self <: CreateCardRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardTypeUndefined: Self = StObject.set(x, "CardType", js.undefined)
      
      @scala.inline
      def setCurrency(value: CurrencyISO): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'Tag' | 'RegistrationData'> */
  @js.native
  trait UpdateCardRegistration extends StObject {
    
    var RegistrationData: js.UndefOr[String] = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object UpdateCardRegistration {
    
    @scala.inline
    def apply(): UpdateCardRegistration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCardRegistration]
    }
    
    @scala.inline
    implicit class UpdateCardRegistrationMutableBuilder[Self <: UpdateCardRegistration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistrationData(value: String): Self = StObject.set(x, "RegistrationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationDataUndefined: Self = StObject.set(x, "RegistrationData", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
