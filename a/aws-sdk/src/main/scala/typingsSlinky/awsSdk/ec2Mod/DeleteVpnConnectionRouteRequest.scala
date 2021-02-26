package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVpnConnectionRouteRequest extends StObject {
  
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String = js.native
  
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typingsSlinky.awsSdk.ec2Mod.VpnConnectionId = js.native
}
object DeleteVpnConnectionRouteRequest {
  
  @scala.inline
  def apply(DestinationCidrBlock: String, VpnConnectionId: VpnConnectionId): DeleteVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpnConnectionRouteRequest]
  }
  
  @scala.inline
  implicit class DeleteVpnConnectionRouteRequestMutableBuilder[Self <: DeleteVpnConnectionRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
  }
}
