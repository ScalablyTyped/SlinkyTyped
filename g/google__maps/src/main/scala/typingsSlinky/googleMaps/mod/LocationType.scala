package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.ROOFTOP
  - typingsSlinky.googleMaps.googleMapsStrings.RANGE_INTERPOLATED
  - typingsSlinky.googleMaps.googleMapsStrings.GEOMETRIC_CENTER
  - typingsSlinky.googleMaps.googleMapsStrings.APPROXIMATE
*/
trait LocationType extends js.Object

object LocationType {
  @scala.inline
  def APPROXIMATE: typingsSlinky.googleMaps.googleMapsStrings.APPROXIMATE = this.cast("APPROXIMATE")
  @scala.inline
  def GEOMETRIC_CENTER: typingsSlinky.googleMaps.googleMapsStrings.GEOMETRIC_CENTER = this.cast("GEOMETRIC_CENTER")
  @scala.inline
  def RANGE_INTERPOLATED: typingsSlinky.googleMaps.googleMapsStrings.RANGE_INTERPOLATED = this.cast("RANGE_INTERPOLATED")
  @scala.inline
  def ROOFTOP: typingsSlinky.googleMaps.googleMapsStrings.ROOFTOP = this.cast("ROOFTOP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

