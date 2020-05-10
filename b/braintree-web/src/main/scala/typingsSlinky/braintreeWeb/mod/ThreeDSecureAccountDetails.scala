package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The new payment method nonce produced by the 3D Secure lookup. The original nonce passed into {@link ThreeDSecure#verifyCard|verifyCard} was consumed. This new nonce should be used to transact on your server.
  * @property {object} details Additional account details.
  * @property {string} details.cardType Type of card, ex: Visa, MasterCard.
  * @property {string} details.lastTwo Last two digits of card number.
  * @property {string} description A human-readable description.
  * @property {boolean} liabilityShiftPossible Indicates whether the card was eligible for 3D Secure.
  * @property {boolean} liabilityShifted Indicates whether the liability for fraud has been shifted away from the merchant.
  */
@js.native
trait ThreeDSecureAccountDetails extends js.Object {
  var cardType: String = js.native
  var lastTwo: String = js.native
}

object ThreeDSecureAccountDetails {
  @scala.inline
  def apply(cardType: String, lastTwo: String): ThreeDSecureAccountDetails = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDSecureAccountDetails]
  }
  @scala.inline
  implicit class ThreeDSecureAccountDetailsOps[Self <: ThreeDSecureAccountDetails] (val x: Self) extends AnyVal {
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
    def withLastTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTwo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

