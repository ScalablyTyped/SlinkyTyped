package typingsSlinky.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.deg
  - typingsSlinky.convertUnits.convertUnitsStrings.rad
  - typingsSlinky.convertUnits.convertUnitsStrings.grad
  - typingsSlinky.convertUnits.convertUnitsStrings.arcmin
  - typingsSlinky.convertUnits.convertUnitsStrings.arcsec
*/
trait uAngle extends js.Object

object uAngle {
  @scala.inline
  def arcmin: typingsSlinky.convertUnits.convertUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typingsSlinky.convertUnits.convertUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deg: typingsSlinky.convertUnits.convertUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def grad: typingsSlinky.convertUnits.convertUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def rad: typingsSlinky.convertUnits.convertUnitsStrings.rad = this.cast("rad")
}

