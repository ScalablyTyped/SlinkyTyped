package typingsSlinky.postmark

import typingsSlinky.postmark.webhookMod.BounceWebhookTrigger
import typingsSlinky.postmark.webhookMod.OpenWebhookTrigger
import typingsSlinky.postmark.webhookMod.SpamWebhookTrigger
import typingsSlinky.postmark.webhookMod.WebhookTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBounce extends js.Object {
  var Bounce: BounceWebhookTrigger = js.native
  var Click: WebhookTrigger = js.native
  var Delivery: WebhookTrigger = js.native
  var Open: OpenWebhookTrigger = js.native
  var SpamComplaint: SpamWebhookTrigger = js.native
}

object AnonBounce {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger
  ): AnonBounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Delivery = Delivery.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBounce]
  }
  @scala.inline
  implicit class AnonBounceOps[Self <: AnonBounce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: BounceWebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: WebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelivery(value: WebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: OpenWebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpamComplaint(value: SpamWebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

