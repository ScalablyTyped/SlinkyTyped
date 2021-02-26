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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IInstruction extends StObject {
  
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
  implicit class IInstructionMutableBuilder[Self <: IInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadUndefined: Self = StObject.set(x, "road", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
