package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionProgressEvent extends StObject {
  
  var originator: String = js.native
  
  var response: js.UndefOr[IncomingResponse] = js.native
}
object SessionProgressEvent {
  
  @scala.inline
  def apply(originator: String): SessionProgressEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionProgressEvent]
  }
  
  @scala.inline
  implicit class SessionProgressEventMutableBuilder[Self <: SessionProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
