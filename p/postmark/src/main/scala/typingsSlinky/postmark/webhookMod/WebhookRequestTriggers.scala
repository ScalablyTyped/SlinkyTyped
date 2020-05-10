package typingsSlinky.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookRequestTriggers extends js.Object {
  var Bounce: js.UndefOr[BounceWebhookTrigger] = js.native
  var Click: js.UndefOr[WebhookTrigger] = js.native
  var Delivery: js.UndefOr[WebhookTrigger] = js.native
  var Open: js.UndefOr[OpenWebhookTrigger] = js.native
  var SpamComplaint: js.UndefOr[SpamWebhookTrigger] = js.native
}

object WebhookRequestTriggers {
  @scala.inline
  def apply(): WebhookRequestTriggers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookRequestTriggers]
  }
  @scala.inline
  implicit class WebhookRequestTriggersOps[Self <: WebhookRequestTriggers] (val x: Self) extends AnyVal {
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
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: WebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.undefined)
        ret
    }
    @scala.inline
    def withDelivery(value: WebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelivery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delivery")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: OpenWebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Open")(js.undefined)
        ret
    }
    @scala.inline
    def withSpamComplaint(value: SpamWebhookTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpamComplaint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaint")(js.undefined)
        ret
    }
  }
  
}

