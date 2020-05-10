package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringConnectionInput extends js.Object {
  /**
    * A unique identifier for a fleet. You can use either the fleet ID or ARN value. This tells Amazon GameLift which GameLift VPC to peer with. 
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings.
    */
  var PeerVpcAwsAccountId: NonZeroAndMaxString = js.native
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: NonZeroAndMaxString = js.native
}

object CreateVpcPeeringConnectionInput {
  @scala.inline
  def apply(FleetId: FleetId, PeerVpcAwsAccountId: NonZeroAndMaxString, PeerVpcId: NonZeroAndMaxString): CreateVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], PeerVpcAwsAccountId = PeerVpcAwsAccountId.asInstanceOf[js.Any], PeerVpcId = PeerVpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcPeeringConnectionInput]
  }
  @scala.inline
  implicit class CreateVpcPeeringConnectionInputOps[Self <: CreateVpcPeeringConnectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcAwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerVpcId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

