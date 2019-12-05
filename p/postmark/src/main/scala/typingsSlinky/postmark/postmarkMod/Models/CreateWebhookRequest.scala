package typingsSlinky.postmark.postmarkMod.Models

import typingsSlinky.postmark.distClientModelsWebhooksWebhookMod.HttpAuth
import typingsSlinky.postmark.distClientModelsWebhooksWebhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateWebhookRequest")
@js.native
class CreateWebhookRequest ()
  extends typingsSlinky.postmark.distClientModelsMod.CreateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(
    url: String,
    triggers: WebhookRequestTriggers,
    httpAuth: HttpAuth,
    httpHeaders: js.Array[typingsSlinky.postmark.distClientModelsMessageSupportingTypesMod.Header]
  ) = this()
}

