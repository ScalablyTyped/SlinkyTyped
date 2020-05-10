package typingsSlinky.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaymentmethod extends js.Object {
  var payment_method: String = js.native
}

object AnonPaymentmethod {
  @scala.inline
  def apply(payment_method: String): AnonPaymentmethod = {
    val __obj = js.Dynamic.literal(payment_method = payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaymentmethod]
  }
  @scala.inline
  implicit class AnonPaymentmethodOps[Self <: AnonPaymentmethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

