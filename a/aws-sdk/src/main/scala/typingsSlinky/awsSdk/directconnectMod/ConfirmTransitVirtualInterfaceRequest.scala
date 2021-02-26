package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmTransitVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}
object ConfirmTransitVirtualInterfaceRequest {
  
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId, virtualInterfaceId: VirtualInterfaceId): ConfirmTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmTransitVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class ConfirmTransitVirtualInterfaceRequestMutableBuilder[Self <: ConfirmTransitVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
