package typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration

import typingsSlinky.mangopay2NodejsSdk.mod.card.CardStatus
import typingsSlinky.mangopay2NodejsSdk.mod.card.CardType
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CardRegistrationDataOps[Self <: CardRegistrationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardRegistrationURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardRegistrationURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: CardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreregistrationData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreregistrationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: CardStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

