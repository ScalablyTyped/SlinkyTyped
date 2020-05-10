package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook = js.native
}

object CreateWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): CreateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookResult]
  }
  @scala.inline
  implicit class CreateWebhookResultOps[Self <: CreateWebhookResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebhook(value: Webhook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

