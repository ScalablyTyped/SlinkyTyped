package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelHandshakeRequest extends js.Object {
  
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
  implicit class CancelHandshakeRequestOps[Self <: CancelHandshakeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandshakeId(value: HandshakeId): Self = this.set("HandshakeId", value.asInstanceOf[js.Any])
  }
}
