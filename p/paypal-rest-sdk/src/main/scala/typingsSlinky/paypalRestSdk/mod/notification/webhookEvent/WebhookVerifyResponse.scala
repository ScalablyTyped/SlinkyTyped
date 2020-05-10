package typingsSlinky.paypalRestSdk.mod.notification.webhookEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookVerifyResponse extends js.Object {
  var verification_status: String = js.native
}

object WebhookVerifyResponse {
  @scala.inline
  def apply(verification_status: String): WebhookVerifyResponse = {
    val __obj = js.Dynamic.literal(verification_status = verification_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookVerifyResponse]
  }
  @scala.inline
  implicit class WebhookVerifyResponseOps[Self <: WebhookVerifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerification_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification_status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

