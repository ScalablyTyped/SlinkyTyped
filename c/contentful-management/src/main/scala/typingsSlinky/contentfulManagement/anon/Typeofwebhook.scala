package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.webhookMod.WebHooks
import typingsSlinky.contentfulManagement.webhookMod.WebhookProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwebhook extends StObject {
  
  def wrapWebhook(http: AxiosInstance, data: WebhookProps): WebHooks = js.native
  
  def wrapWebhookCollection(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps] = js.native
}
object Typeofwebhook {
  
  @scala.inline
  def apply(
    wrapWebhook: (AxiosInstance, WebhookProps) => WebHooks,
    wrapWebhookCollection: (AxiosInstance, CollectionProp[WebhookProps]) => Collection[WebHooks, WebhookProps]
  ): Typeofwebhook = {
    val __obj = js.Dynamic.literal(wrapWebhook = js.Any.fromFunction2(wrapWebhook), wrapWebhookCollection = js.Any.fromFunction2(wrapWebhookCollection))
    __obj.asInstanceOf[Typeofwebhook]
  }
  
  @scala.inline
  implicit class TypeofwebhookMutableBuilder[Self <: Typeofwebhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapWebhook(value: (AxiosInstance, WebhookProps) => WebHooks): Self = StObject.set(x, "wrapWebhook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapWebhookCollection(value: (AxiosInstance, CollectionProp[WebhookProps]) => Collection[WebHooks, WebhookProps]): Self = StObject.set(x, "wrapWebhookCollection", js.Any.fromFunction2(value))
  }
}
