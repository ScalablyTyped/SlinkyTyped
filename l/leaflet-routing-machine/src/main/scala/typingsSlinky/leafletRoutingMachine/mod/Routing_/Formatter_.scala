package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-left`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-right`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`enter-roundabout`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-left`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-right`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-left`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-right`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.`u-turn`
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.arrive
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.continue
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.depart
import typingsSlinky.leafletRoutingMachine.leafletRoutingMachineStrings.via
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Formatter")
@js.native
class Formatter_ () extends StObject {
  def this(options: FormatterOptions) = this()
  
  def capitalize(s: String): String = js.native
  
  def formatDistance(d: Double): String = js.native
  def formatDistance(d: Double, precision: Double): String = js.native
  
  def formatInstruction(instruction: IInstruction): String = js.native
  
  def formatTime(t: Double): String = js.native
  
  def getIconName(instruction: IInstruction, index: Double): depart | via | `enter-roundabout` | arrive | continue | `bear-right` | `turn-right` | `sharp-right` | `u-turn` | `sharp-left` | `turn-left` | `bear-left` = js.native
}
