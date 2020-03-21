package typingsSlinky.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.V
  - typingsSlinky.convertUnits.convertUnitsStrings.mV
  - typingsSlinky.convertUnits.convertUnitsStrings.kV
*/
trait uVoltage extends js.Object

object uVoltage {
  @scala.inline
  def V: typingsSlinky.convertUnits.convertUnitsStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def kV: typingsSlinky.convertUnits.convertUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def mV: typingsSlinky.convertUnits.convertUnitsStrings.mV = this.cast("mV")
}

