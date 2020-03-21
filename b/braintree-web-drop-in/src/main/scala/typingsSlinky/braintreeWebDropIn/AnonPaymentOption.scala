package typingsSlinky.braintreeWebDropIn

import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.card
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaymentOption extends js.Object {
  var paymentOption: card | paypal | paypalCredit
}

object AnonPaymentOption {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): AnonPaymentOption = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaymentOption]
  }
}

