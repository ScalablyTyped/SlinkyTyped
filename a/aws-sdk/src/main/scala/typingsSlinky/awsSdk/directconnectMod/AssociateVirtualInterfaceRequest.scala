package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateVirtualInterfaceRequest extends js.Object {
  
  /**
    * The ID of the LAG or connection.
    */
  var connectionId: ConnectionId = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}
object AssociateVirtualInterfaceRequest {
  
  @scala.inline
  def apply(connectionId: ConnectionId, virtualInterfaceId: VirtualInterfaceId): AssociateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class AssociateVirtualInterfaceRequestOps[Self <: AssociateVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
