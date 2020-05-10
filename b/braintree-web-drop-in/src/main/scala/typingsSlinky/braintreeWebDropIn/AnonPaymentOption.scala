package typingsSlinky.braintreeWebDropIn

import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.card
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaymentOption extends js.Object {
  var paymentOption: card | paypal | paypalCredit = js.native
}

object AnonPaymentOption {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): AnonPaymentOption = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaymentOption]
  }
  @scala.inline
  implicit class AnonPaymentOptionOps[Self <: AnonPaymentOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentOption(value: card | paypal | paypalCredit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

