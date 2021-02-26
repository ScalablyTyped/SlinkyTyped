package typingsSlinky.postmark.anon

import typingsSlinky.postmark.webhookMod.BounceWebhookTrigger
import typingsSlinky.postmark.webhookMod.OpenWebhookTrigger
import typingsSlinky.postmark.webhookMod.SpamWebhookTrigger
import typingsSlinky.postmark.webhookMod.WebhookTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounce extends StObject {
  
  var Bounce: BounceWebhookTrigger = js.native
  
  var Click: WebhookTrigger = js.native
  
  var Delivery: WebhookTrigger = js.native
  
  var Open: OpenWebhookTrigger = js.native
  
  var SpamComplaint: SpamWebhookTrigger = js.native
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
  
  @scala.inline
  implicit class BounceMutableBuilder[Self <: Bounce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounce(value: BounceWebhookTrigger): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: WebhookTrigger): Self = StObject.set(x, "Click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelivery(value: WebhookTrigger): Self = StObject.set(x, "Delivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: OpenWebhookTrigger): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamComplaint(value: SpamWebhookTrigger): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
  }
}
