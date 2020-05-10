package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetPortSettingsInput extends js.Object {
  /**
    * A unique identifier for a fleet to retrieve port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
}

object DescribeFleetPortSettingsInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
  @scala.inline
  implicit class DescribeFleetPortSettingsInputOps[Self <: DescribeFleetPortSettingsInput] (val x: Self) extends AnyVal {
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
  }
  
}

