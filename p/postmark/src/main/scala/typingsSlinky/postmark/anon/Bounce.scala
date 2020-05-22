package typingsSlinky.postmark.anon

import typingsSlinky.postmark.webhookMod.BounceWebhookTrigger
import typingsSlinky.postmark.webhookMod.OpenWebhookTrigger
import typingsSlinky.postmark.webhookMod.SpamWebhookTrigger
import typingsSlinky.postmark.webhookMod.WebhookTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounce extends js.Object {
  var Bounce: BounceWebhookTrigger
  var Click: WebhookTrigger
  var Delivery: WebhookTrigger
  var Open: OpenWebhookTrigger
  var SpamComplaint: SpamWebhookTrigger
}

object Bounce {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger
  ): Bounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Delivery = Delivery.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
}

