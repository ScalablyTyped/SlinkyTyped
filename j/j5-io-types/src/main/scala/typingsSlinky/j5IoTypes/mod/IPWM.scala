package typingsSlinky.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPWM extends IPeripheral {
  
  val dutyCycle: Double = js.native
  
  val frequency: Double = js.native
  
  val range: Double = js.native
  
  def write(dutyCycle: Double): Unit = js.native
}
