package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnection extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet resource for this connection. 
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * A unique identifier for a fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * A unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed by Amazon GameLift and does not appear in your AWS account. 
    */
  var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created. 
    */
  var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The status information about the connection. Status indicates if a connection is pending, successful, or failed.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStatus] = js.native
  /**
    * A unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering connection events, and is used when deleting a connection with DeleteVpcPeeringConnection. 
    */
  var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.native
}

object VpcPeeringConnection {
  @scala.inline
  def apply(): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnection]
  }
  @scala.inline
  implicit class VpcPeeringConnectionOps[Self <: VpcPeeringConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: ArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withGameLiftVpcId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameLiftVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameLiftVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameLiftVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpV4CidrBlock(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpV4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpV4CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcId(value: NonZeroAndMaxString): Self = {
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
    def withStatus(value: VpcPeeringConnectionStatus): Self = {
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
    def withVpcPeeringConnectionId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

