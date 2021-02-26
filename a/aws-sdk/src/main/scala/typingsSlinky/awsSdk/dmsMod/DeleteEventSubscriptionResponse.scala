package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventSubscriptionResponse extends StObject {
  
  /**
    * The event subscription that was deleted.
    */
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.dmsMod.EventSubscription] = js.native
}
object DeleteEventSubscriptionResponse {
  
  @scala.inline
  def apply(): DeleteEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEventSubscriptionResponse]
  }
  
  @scala.inline
  implicit class DeleteEventSubscriptionResponseMutableBuilder[Self <: DeleteEventSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = StObject.set(x, "EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionUndefined: Self = StObject.set(x, "EventSubscription", js.undefined)
  }
}
