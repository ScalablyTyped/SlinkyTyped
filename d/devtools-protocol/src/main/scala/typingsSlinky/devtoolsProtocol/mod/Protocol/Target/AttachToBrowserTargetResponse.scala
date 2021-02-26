package typingsSlinky.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachToBrowserTargetResponse extends StObject {
  
  /**
    * Id assigned to the session.
    */
  var sessionId: SessionID = js.native
}
object AttachToBrowserTargetResponse {
  
  @scala.inline
  def apply(sessionId: SessionID): AttachToBrowserTargetResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToBrowserTargetResponse]
  }
  
  @scala.inline
  implicit class AttachToBrowserTargetResponseMutableBuilder[Self <: AttachToBrowserTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
