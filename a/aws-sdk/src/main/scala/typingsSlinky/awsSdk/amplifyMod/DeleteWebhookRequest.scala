package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWebhookRequest extends StObject {
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId = js.native
}
object DeleteWebhookRequest {
  
  @scala.inline
  def apply(webhookId: WebhookId): DeleteWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookRequest]
  }
  
  @scala.inline
  implicit class DeleteWebhookRequestMutableBuilder[Self <: DeleteWebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
