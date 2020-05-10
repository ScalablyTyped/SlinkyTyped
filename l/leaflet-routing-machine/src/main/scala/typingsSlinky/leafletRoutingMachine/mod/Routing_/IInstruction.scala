package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.DestinationReached
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.EnterAgainstAllowedDirection
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.LeaveAgainstAllowedDirection
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.Left
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.Right
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.Roundabout
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.SharpLeft
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.SharpRight
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.SlightLeft
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.SlightRight
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.StartAt
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.Straight
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.TurnAround
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.WaypointReached
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IInstruction extends js.Object {
  var direction: js.UndefOr[String] = js.native
  var distance: Double = js.native
  var exit: js.UndefOr[Double] = js.native
  var road: js.UndefOr[String] = js.native
  var text: js.UndefOr[Double] = js.native
  var time: Double = js.native
  var `type`: js.UndefOr[
    Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
  ] = js.native
}

object IInstruction {
  @scala.inline
  def apply(distance: Double, time: Double): IInstruction = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstruction]
  }
  @scala.inline
  implicit class IInstructionOps[Self <: IInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withRoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

