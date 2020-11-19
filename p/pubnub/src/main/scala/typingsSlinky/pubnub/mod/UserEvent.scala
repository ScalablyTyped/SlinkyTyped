package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * deprecated: For objects v2, use objects.the ObjectsEvent
  */
@js.native
trait UserEvent extends js.Object {
  
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
  implicit class UserEventOps[Self <: UserEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Data): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String): Self = this.set("timetoken", value.asInstanceOf[js.Any])
  }
}
