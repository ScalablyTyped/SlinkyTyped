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
    exit: js.UndefOr[Double] = js.undefined,
    road: String = null,
    text: js.UndefOr[Double] = js.undefined,
    `type`: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection = null
  ): IInstruction = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.get.asInstanceOf[js.Any])
    if (road != null) __obj.updateDynamic("road")(road.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstruction]
  }
}

