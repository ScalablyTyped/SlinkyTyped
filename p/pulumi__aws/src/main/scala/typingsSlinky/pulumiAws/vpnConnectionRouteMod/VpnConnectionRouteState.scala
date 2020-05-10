package typingsSlinky.pulumiAws.vpnConnectionRouteMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRouteState extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionRouteState {
  @scala.inline
  def apply(): VpnConnectionRouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionRouteState]
  }
  @scala.inline
  implicit class VpnConnectionRouteStateOps[Self <: VpnConnectionRouteState] (val x: Self) extends AnyVal {
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
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnectionId")(js.undefined)
        ret
    }
  }
  
}

