package typingsSlinky.devtoolsProtocol.mod.Protocol.Security

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleCertificateErrorRequest extends StObject {
  
  /**
    * The action to take on the certificate error.
    */
  var action: CertificateErrorAction = js.native
  
  /**
    * The ID of the event.
    */
  var eventId: integer = js.native
}
object HandleCertificateErrorRequest {
  
  @scala.inline
  def apply(action: CertificateErrorAction, eventId: integer): HandleCertificateErrorRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCertificateErrorRequest]
  }
  
  @scala.inline
  implicit class HandleCertificateErrorRequestMutableBuilder[Self <: HandleCertificateErrorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CertificateErrorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventId(value: integer): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
  }
}
