package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionHoldEvent extends StObject {
  
  var originator: String = js.native
}
object SessionHoldEvent {
  
  @scala.inline
  def apply(originator: String): SessionHoldEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionHoldEvent]
  }
  
  @scala.inline
  implicit class SessionHoldEventMutableBuilder[Self <: SessionHoldEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
