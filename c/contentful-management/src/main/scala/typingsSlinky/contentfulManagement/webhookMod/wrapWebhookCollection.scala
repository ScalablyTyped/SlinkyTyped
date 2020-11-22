package typingsSlinky.contentfulManagement.webhookMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/webhook", "wrapWebhookCollection")
@js.native
object wrapWebhookCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps] = js.native
}
