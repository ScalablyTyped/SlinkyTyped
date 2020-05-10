package typingsSlinky.paypalCordovaPlugin.PayPalCordovaPlugin

import typingsSlinky.paypalCordovaPlugin.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuturePaymentResult extends BaseResult {
  var response: AnonCode = js.native
}

object FuturePaymentResult {
  @scala.inline
  def apply(client: Client, response: AnonCode, response_type: String): FuturePaymentResult = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuturePaymentResult]
  }
  @scala.inline
  implicit class FuturePaymentResultOps[Self <: FuturePaymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

