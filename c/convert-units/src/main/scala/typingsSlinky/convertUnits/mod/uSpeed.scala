package typingsSlinky.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.mSlashs
  - typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.mSlashh
  - typingsSlinky.convertUnits.convertUnitsStrings.knot
  - typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs
*/
trait uSpeed extends js.Object

object uSpeed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ftSlashs: typingsSlinky.convertUnits.convertUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def kmSlashh: typingsSlinky.convertUnits.convertUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typingsSlinky.convertUnits.convertUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def mSlashh: typingsSlinky.convertUnits.convertUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typingsSlinky.convertUnits.convertUnitsStrings.mSlashs = this.cast("m/s")
}

