package typingsSlinky.pulumiAws.vpnGatewayAttachmentMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayAttachmentArgs extends js.Object {
  /**
    * The ID of the VPC.
    */
  val vpcId: Input[String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: Input[String] = js.native
}

object VpnGatewayAttachmentArgs {
  @scala.inline
  def apply(vpcId: Input[String], vpnGatewayId: Input[String]): VpnGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayAttachmentArgs]
  }
  @scala.inline
  implicit class VpnGatewayAttachmentArgsOps[Self <: VpnGatewayAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

