package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {string} type Always <code>CreditCard</code>.
  * @property {object} details Additional account details:
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} description A human-readable description.
  */
@js.native
trait UnionPayAccountDetails extends js.Object {
  var cardType: String = js.native
  var description: String = js.native
  var lastTwo: String = js.native
}

object UnionPayAccountDetails {
  @scala.inline
  def apply(cardType: String, description: String, lastTwo: String): UnionPayAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayAccountDetails]
  }
  @scala.inline
  implicit class UnionPayAccountDetailsOps[Self <: UnionPayAccountDetails] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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

