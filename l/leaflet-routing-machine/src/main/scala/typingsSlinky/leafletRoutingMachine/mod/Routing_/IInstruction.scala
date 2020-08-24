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
  var text: js.UndefOr[String] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setExit(value: Double): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setRoad(value: String): Self = this.set("road", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoad: Self = this.set("road", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(
      value: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

