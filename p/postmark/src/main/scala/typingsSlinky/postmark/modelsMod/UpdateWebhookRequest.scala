package typingsSlinky.postmark.modelsMod

import typingsSlinky.postmark.webhookMod.HttpAuth
import typingsSlinky.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "UpdateWebhookRequest")
@js.native
class UpdateWebhookRequest ()
  extends typingsSlinky.postmark.webhookMod.UpdateWebhookRequest {
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

