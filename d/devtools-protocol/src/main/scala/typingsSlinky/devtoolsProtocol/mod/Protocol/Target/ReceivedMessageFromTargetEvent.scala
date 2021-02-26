package typingsSlinky.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedMessageFromTargetEvent extends StObject {
  
  var message: String = js.native
  
  /**
    * Identifier of a session which sends a message.
    */
  var sessionId: SessionID = js.native
  
  /**
    * Deprecated.
    */
  var targetId: js.UndefOr[TargetID] = js.native
}
object ReceivedMessageFromTargetEvent {
  
  @scala.inline
  def apply(message: String, sessionId: SessionID): ReceivedMessageFromTargetEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMessageFromTargetEvent]
  }
  
  @scala.inline
  implicit class ReceivedMessageFromTargetEventMutableBuilder[Self <: ReceivedMessageFromTargetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
