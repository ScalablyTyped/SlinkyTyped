package typingsSlinky.postmark.mod.Models

import typingsSlinky.postmark.webhookMod.HttpAuth
import typingsSlinky.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateWebhookRequest")
@js.native
class CreateWebhookRequest ()
  extends typingsSlinky.postmark.modelsMod.CreateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(
    url: String,
    triggers: WebhookRequestTriggers,
    httpAuth: HttpAuth,
    httpHeaders: js.Array[typingsSlinky.postmark.messageSupportingTypesMod.Header]
  ) = this()
}

