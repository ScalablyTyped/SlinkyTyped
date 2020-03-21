package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.metric
  - typingsSlinky.googleMaps.googleMapsStrings.imperial
*/
trait UnitSystem extends js.Object

object UnitSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsSlinky.googleMaps.googleMapsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsSlinky.googleMaps.googleMapsStrings.metric = this.cast("metric")
}

