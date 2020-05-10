package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcPeeringConnectionInput extends js.Object {
  /**
    * A unique identifier for a fleet. This fleet specified must match the fleet referenced in the VPC peering connection record. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A unique identifier for a VPC peering connection. This value is included in the VpcPeeringConnection object, which can be retrieved by calling DescribeVpcPeeringConnections.
    */
  var VpcPeeringConnectionId: NonZeroAndMaxString = js.native
}

object DeleteVpcPeeringConnectionInput {
  @scala.inline
  def apply(FleetId: FleetId, VpcPeeringConnectionId: NonZeroAndMaxString): DeleteVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcPeeringConnectionInput]
  }
  @scala.inline
  implicit class DeleteVpcPeeringConnectionInputOps[Self <: DeleteVpcPeeringConnectionInput] (val x: Self) extends AnyVal {
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
    def withVpcPeeringConnectionId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

