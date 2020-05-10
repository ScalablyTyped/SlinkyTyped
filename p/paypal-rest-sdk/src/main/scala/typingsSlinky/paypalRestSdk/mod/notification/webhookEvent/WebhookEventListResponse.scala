package typingsSlinky.paypalRestSdk.mod.notification.webhookEvent

import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookEventListResponse extends Response {
  var events: js.Array[WebhookEvent] = js.native
}

object WebhookEventListResponse {
  @scala.inline
  def apply(events: js.Array[WebhookEvent], httpStatusCode: Double): WebhookEventListResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookEventListResponse]
  }
  @scala.inline
  implicit class WebhookEventListResponseOps[Self <: WebhookEventListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[WebhookEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

