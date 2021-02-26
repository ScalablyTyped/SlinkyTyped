package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelHandshakeRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the handshake that you want to cancel. You can get the ID from the ListHandshakesForOrganization operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typingsSlinky.awsSdk.organizationsMod.HandshakeId = js.native
}
object CancelHandshakeRequest {
  
  @scala.inline
  def apply(HandshakeId: HandshakeId): CancelHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelHandshakeRequest]
  }
  
  @scala.inline
  implicit class CancelHandshakeRequestMutableBuilder[Self <: CancelHandshakeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshakeId(value: HandshakeId): Self = StObject.set(x, "HandshakeId", value.asInstanceOf[js.Any])
  }
}
