package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetNetwork extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint with which the target network is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The IDs of the security groups applied to the target network association.
    */
  var SecurityGroups: js.UndefOr[ValueStringList] = js.native
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.native
  /**
    * The ID of the subnet specified as the target network.
    */
  var TargetNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object TargetNetwork {
  @scala.inline
  def apply(): TargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetNetwork]
  }
  @scala.inline
  implicit class TargetNetworkOps[Self <: TargetNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVpnEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpnEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

