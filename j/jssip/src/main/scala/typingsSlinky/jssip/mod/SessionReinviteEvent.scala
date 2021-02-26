package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReinviteEvent extends StObject {
  
  def callback(): Unit = js.native
  
  def reject(options: SessionRejectOptions): Unit = js.native
  
  var request: IncomingRequest = js.native
}
object SessionReinviteEvent {
  
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionReinviteEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReinviteEvent]
  }
  
  @scala.inline
  implicit class SessionReinviteEventMutableBuilder[Self <: SessionReinviteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReject(value: SessionRejectOptions => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
