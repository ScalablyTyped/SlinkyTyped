package typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing

import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.DestinationReached
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.EnterAgainstAllowedDirection
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.LeaveAgainstAllowedDirection
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Left
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Right
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Roundabout
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SharpLeft
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SharpRight
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SlightLeft
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SlightRight
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.StartAt
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Straight
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.TurnAround
import typingsSlinky.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.WaypointReached
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IInstruction extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var distance: Double
  var exit: js.UndefOr[Double] = js.undefined
  var road: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[Double] = js.undefined
  var time: Double
  var `type`: js.UndefOr[
    Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
  ] = js.undefined
}

object IInstruction {
  @scala.inline
  def apply(
    distance: Double,
    time: Double,
    direction: String = null,
    exit: Int | Double = null,
    road: String = null,
    text: Int | Double = null,
    `type`: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection = null
  ): IInstruction = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (road != null) __obj.updateDynamic("road")(road.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstruction]
  }
}

