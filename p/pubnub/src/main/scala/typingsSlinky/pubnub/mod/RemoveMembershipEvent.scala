package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataUuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveMembershipEvent
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, js.Any] {
  
  @JSName("message")
  var message_RemoveMembershipEvent: DataUuid = js.native
}
object RemoveMembershipEvent {
  
  @scala.inline
  def apply(channel: String, message: DataUuid, timetoken: Double): RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembershipEvent]
  }
  
  @scala.inline
  implicit class RemoveMembershipEventMutableBuilder[Self <: RemoveMembershipEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataUuid): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
