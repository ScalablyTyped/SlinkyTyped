package typingsSlinky.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait applePayCreateOptions extends js.Object {
  var applePaySessionVersion: js.UndefOr[Double] = js.native
  var buttonStyle: js.UndefOr[String] = js.native
  var displayName: String = js.native
  var paymentRequest: js.Any = js.native
}

object applePayCreateOptions {
  @scala.inline
  def apply(displayName: String, paymentRequest: js.Any): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayCreateOptions]
  }
  @scala.inline
  implicit class applePayCreateOptionsOps[Self <: applePayCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplePaySessionVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePaySessionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplePaySessionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePaySessionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(js.undefined)
        ret
    }
  }
  
}

