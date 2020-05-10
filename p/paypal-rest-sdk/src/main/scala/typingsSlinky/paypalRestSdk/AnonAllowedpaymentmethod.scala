package typingsSlinky.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowedpaymentmethod extends js.Object {
  var allowed_payment_method: String = js.native
}

object AnonAllowedpaymentmethod {
  @scala.inline
  def apply(allowed_payment_method: String): AnonAllowedpaymentmethod = {
    val __obj = js.Dynamic.literal(allowed_payment_method = allowed_payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedpaymentmethod]
  }
  @scala.inline
  implicit class AnonAllowedpaymentmethodOps[Self <: AnonAllowedpaymentmethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_payment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_payment_method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

