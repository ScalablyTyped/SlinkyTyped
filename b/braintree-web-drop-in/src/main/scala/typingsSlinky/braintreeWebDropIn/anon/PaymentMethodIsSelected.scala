package typingsSlinky.braintreeWebDropIn.anon

import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodIsSelected extends js.Object {
  var paymentMethodIsSelected: Boolean = js.native
  var `type`: CreditCard | PayPalAccount = js.native
}

object PaymentMethodIsSelected {
  @scala.inline
  def apply(paymentMethodIsSelected: Boolean, `type`: CreditCard | PayPalAccount): PaymentMethodIsSelected = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodIsSelected]
  }
  @scala.inline
  implicit class PaymentMethodIsSelectedOps[Self <: PaymentMethodIsSelected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentMethodIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodIsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CreditCard | PayPalAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

