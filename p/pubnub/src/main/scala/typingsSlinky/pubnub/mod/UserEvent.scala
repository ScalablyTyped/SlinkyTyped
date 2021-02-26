package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * deprecated: For objects v2, use objects.the ObjectsEvent
  */
@js.native
trait UserEvent extends StObject {
  
  var channel: String = js.native
  
  var message: Data = js.native
  
  var publisher: String = js.native
  
  var subscription: String = js.native
  
  var timetoken: String = js.native
}
object UserEvent {
  
  @scala.inline
  def apply(channel: String, message: Data, publisher: String, subscription: String, timetoken: String): UserEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEvent]
  }
  
  @scala.inline
  implicit class UserEventMutableBuilder[Self <: UserEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Data): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
