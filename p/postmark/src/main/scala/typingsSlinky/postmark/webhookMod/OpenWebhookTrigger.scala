package typingsSlinky.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenWebhookTrigger extends WebhookTrigger {
  var PostFirstOpenOnly: js.UndefOr[Boolean] = js.native
}

object OpenWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean): OpenWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWebhookTrigger]
  }
  @scala.inline
  implicit class OpenWebhookTriggerOps[Self <: OpenWebhookTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostFirstOpenOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostFirstOpenOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostFirstOpenOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostFirstOpenOnly")(js.undefined)
        ret
    }
  }
  
}

