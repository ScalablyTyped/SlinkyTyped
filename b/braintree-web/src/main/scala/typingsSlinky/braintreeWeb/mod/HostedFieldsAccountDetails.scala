package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {object} details Additional account details.
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} details.lastFour Last four digits of card number.
  * @property {string} description A human-readable description.
  * @property {string} type The payment method type, always `CreditCard`.
  */
@js.native
trait HostedFieldsAccountDetails extends js.Object {
  var cardType: String = js.native
  var lastFour: String = js.native
  var lastTwo: String = js.native
}

object HostedFieldsAccountDetails {
  @scala.inline
  def apply(cardType: String, lastFour: String, lastTwo: String): HostedFieldsAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsAccountDetails]
  }
  @scala.inline
  implicit class HostedFieldsAccountDetailsOps[Self <: HostedFieldsAccountDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTwo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

