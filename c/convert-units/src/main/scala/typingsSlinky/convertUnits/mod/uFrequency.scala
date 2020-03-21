package typingsSlinky.convertUnits.mod

import typingsSlinky.convertUnits.convertUnitsStrings.mHz_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.Hz
  - typingsSlinky.convertUnits.convertUnitsStrings.mHz_
  - typingsSlinky.convertUnits.convertUnitsStrings.kHz
  - typingsSlinky.convertUnits.convertUnitsStrings.MHz
  - typingsSlinky.convertUnits.convertUnitsStrings.GHz
  - typingsSlinky.convertUnits.convertUnitsStrings.THz
  - typingsSlinky.convertUnits.convertUnitsStrings.rpm
  - typingsSlinky.convertUnits.convertUnitsStrings.degSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.radSlashs
*/
trait uFrequency extends js.Object

object uFrequency {
  @scala.inline
  def GHz: typingsSlinky.convertUnits.convertUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def Hz: typingsSlinky.convertUnits.convertUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def MHz: typingsSlinky.convertUnits.convertUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def THz: typingsSlinky.convertUnits.convertUnitsStrings.THz = this.cast("THz")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degSlashs: typingsSlinky.convertUnits.convertUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def kHz: typingsSlinky.convertUnits.convertUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def radSlashs: typingsSlinky.convertUnits.convertUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typingsSlinky.convertUnits.convertUnitsStrings.rpm = this.cast("rpm")
}

