package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScalingPolicyInput extends js.Object {
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString = js.native
}

object DeleteScalingPolicyInput {
  @scala.inline
  def apply(FleetId: FleetId, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
  @scala.inline
  implicit class DeleteScalingPolicyInputOps[Self <: DeleteScalingPolicyInput] (val x: Self) extends AnyVal {
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
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

