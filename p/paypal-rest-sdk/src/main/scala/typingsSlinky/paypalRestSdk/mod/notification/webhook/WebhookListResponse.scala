package typingsSlinky.paypalRestSdk.mod.notification.webhook

import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookListResponse extends Response {
  val webhooks: js.Array[Webhook] = js.native
}

object WebhookListResponse {
  @scala.inline
  def apply(httpStatusCode: Double, webhooks: js.Array[Webhook]): WebhookListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookListResponse]
  }
  @scala.inline
  implicit class WebhookListResponseOps[Self <: WebhookListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhooks(value: js.Array[Webhook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhooks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

