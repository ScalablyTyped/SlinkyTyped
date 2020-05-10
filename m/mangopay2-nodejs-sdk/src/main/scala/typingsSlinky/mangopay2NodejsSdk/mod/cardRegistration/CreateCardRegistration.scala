package typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration

import typingsSlinky.mangopay2NodejsSdk.mod.card.CardType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardRegistration.CardRegistrationData, 'CardType' | 'Tag', 'UserId' | 'Currency'> */
@js.native
trait CreateCardRegistration extends js.Object {
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
  implicit class CreateCardRegistrationOps[Self <: CreateCardRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: CardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardType")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

