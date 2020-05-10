package typingsSlinky.pulumiAws.vpnConnectionRouteMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRouteArgs extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: Input[String] = js.native
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: Input[String] = js.native
}

object VpnConnectionRouteArgs {
  @scala.inline
  def apply(destinationCidrBlock: Input[String], vpnConnectionId: Input[String]): VpnConnectionRouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRouteArgs]
  }
  @scala.inline
  implicit class VpnConnectionRouteArgsOps[Self <: VpnConnectionRouteArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

