package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpnConnectionRouteRequest extends js.Object {
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
  implicit class DeleteVpnConnectionRouteRequestOps[Self <: DeleteVpnConnectionRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnConnectionId(value: VpnConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

