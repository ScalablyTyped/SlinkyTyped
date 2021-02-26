package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionFailedEvent extends StObject {
  
  var cause: String = js.native
  
  var message: js.UndefOr[IncomingResponse] = js.native
  
  var originator: String = js.native
}
object SessionFailedEvent {
  
  @scala.inline
  def apply(cause: String, originator: String): SessionFailedEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionFailedEvent]
  }
  
  @scala.inline
  implicit class SessionFailedEventMutableBuilder[Self <: SessionFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: IncomingResponse): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
