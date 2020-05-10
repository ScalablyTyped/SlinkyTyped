package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFleetActionsInput extends js.Object {
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList = js.native
  /**
    * A unique identifier for a fleet to start actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
}

object StartFleetActionsInput {
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetId): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetActionsInput]
  }
  @scala.inline
  implicit class StartFleetActionsInputOps[Self <: StartFleetActionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: FleetActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

