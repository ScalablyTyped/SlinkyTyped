package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebhookRequest extends js.Object {
  /**
    *  Unique Id for a webhook. 
    */
  var webhookId: WebhookId = js.native
}

object GetWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId): GetWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookRequest]
  }
  @scala.inline
  implicit class GetWebhookRequestOps[Self <: GetWebhookRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhookId(value: WebhookId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

