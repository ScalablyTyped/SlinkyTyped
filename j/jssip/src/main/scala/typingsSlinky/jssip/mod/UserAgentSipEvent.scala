package typingsSlinky.jssip.mod

import typingsSlinky.jssip.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentSipEvent extends StObject {
  
  var event: Event = js.native
  
  var request: IncomingRequest = js.native
}
object UserAgentSipEvent {
  
  @scala.inline
  def apply(event: Event, request: IncomingRequest): UserAgentSipEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentSipEvent]
  }
  
  @scala.inline
  implicit class UserAgentSipEventMutableBuilder[Self <: UserAgentSipEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
