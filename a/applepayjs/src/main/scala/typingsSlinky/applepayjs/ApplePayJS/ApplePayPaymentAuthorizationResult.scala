package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of payment authorization, including status and errors.
  */
@js.native
trait ApplePayPaymentAuthorizationResult extends js.Object {
  /**
    * A list of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.native
  /**
    * The status code for the authorization result.
    */
  var status: Double = js.native
}

object ApplePayPaymentAuthorizationResult {
  @scala.inline
  def apply(status: Double): ApplePayPaymentAuthorizationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentAuthorizationResult]
  }
  @scala.inline
  implicit class ApplePayPaymentAuthorizationResultOps[Self <: ApplePayPaymentAuthorizationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[ApplePayError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

