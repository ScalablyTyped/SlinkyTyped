package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.DataIdEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveChannelMetadataEvent
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, js.Any] {
  
  @JSName("message")
  var message_RemoveChannelMetadataEvent: DataIdEvent = js.native
}
object RemoveChannelMetadataEvent {
  
  @scala.inline
  def apply(channel: String, message: DataIdEvent, timetoken: Double): RemoveChannelMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveChannelMetadataEvent]
  }
  
  @scala.inline
  implicit class RemoveChannelMetadataEventMutableBuilder[Self <: RemoveChannelMetadataEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: DataIdEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
