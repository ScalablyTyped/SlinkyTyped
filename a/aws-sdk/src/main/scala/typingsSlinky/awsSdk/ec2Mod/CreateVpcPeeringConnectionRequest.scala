package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The AWS account ID of the owner of the accepter VPC. Default: Your AWS account ID
    */
  var PeerOwnerId: js.UndefOr[String] = js.native
  /**
    * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request. Default: The Region in which you make the request.
    */
  var PeerRegion: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
    */
  var PeerVpcId: js.UndefOr[String] = js.native
  /**
    * The ID of the requester VPC. You must specify this parameter in the request.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcId] = js.native
}

object CreateVpcPeeringConnectionRequest {
  @scala.inline
  def apply(): CreateVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionRequest]
  }
  @scala.inline
  implicit class CreateVpcPeeringConnectionRequestOps[Self <: CreateVpcPeeringConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPeerOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
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

