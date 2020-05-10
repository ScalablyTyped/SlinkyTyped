package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typingsSlinky.awsSdk.ec2Mod.VpcPeeringConnectionId = js.native
}

object ModifyVpcPeeringConnectionOptionsRequest {
  @scala.inline
  def apply(VpcPeeringConnectionId: VpcPeeringConnectionId): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsRequestOps[Self <: ModifyVpcPeeringConnectionOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccepterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterPeeringConnectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepterPeeringConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterPeeringConnectionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPeeringConnectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPeeringConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPeeringConnectionOptions")(js.undefined)
        ret
    }
  }
  
}

