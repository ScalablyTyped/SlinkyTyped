package typingsSlinky.postmark

import typingsSlinky.postmark.webhookMod.Webhook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhooksMod {
  
  @js.native
  trait Webhooks extends StObject {
    
    var Webhooks: js.Array[Webhook] = js.native
  }
  object Webhooks {
    
    @scala.inline
    def apply(Webhooks: js.Array[Webhook]): Webhooks = {
      val __obj = js.Dynamic.literal(Webhooks = Webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Webhooks]
    }
    
    @scala.inline
    implicit class WebhooksMutableBuilder[Self <: Webhooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWebhooks(value: js.Array[Webhook]): Self = StObject.set(x, "Webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "Webhooks", js.Array(value :_*))
    }
  }
}
