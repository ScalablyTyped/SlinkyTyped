package typingsSlinky.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.sSlashm
  - typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm
  - typingsSlinky.convertUnits.convertUnitsStrings.sSlashft
*/
trait uPace extends js.Object

object uPace {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def minSlashkm: typingsSlinky.convertUnits.convertUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def sSlashft: typingsSlinky.convertUnits.convertUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typingsSlinky.convertUnits.convertUnitsStrings.sSlashm = this.cast("s/m")
}

