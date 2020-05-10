package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetCapacityInput extends js.Object {
  /**
    * Number of EC2 instances you want this fleet to host.
    */
  var DesiredInstances: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet to update capacity for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * The maximum value allowed for the fleet's instance count. Default if not set is 1.
    */
  var MaxSize: js.UndefOr[WholeNumber] = js.native
  /**
    * The minimum value allowed for the fleet's instance count. Default if not set is 0.
    */
  var MinSize: js.UndefOr[WholeNumber] = js.native
}

object UpdateFleetCapacityInput {
  @scala.inline
  def apply(FleetId: FleetId): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
  @scala.inline
  implicit class UpdateFleetCapacityInputOps[Self <: UpdateFleetCapacityInput] (val x: Self) extends AnyVal {
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
    def withDesiredInstances(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSize")(js.undefined)
        ret
    }
  }
  
}

