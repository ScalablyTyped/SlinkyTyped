package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.driving
  - typingsSlinky.googleMaps.googleMapsStrings.walking
  - typingsSlinky.googleMaps.googleMapsStrings.bicycling
  - typingsSlinky.googleMaps.googleMapsStrings.transit
*/
trait TravelMode extends js.Object

object TravelMode {
  @scala.inline
  def bicycling: typingsSlinky.googleMaps.googleMapsStrings.bicycling = this.cast("bicycling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def driving: typingsSlinky.googleMaps.googleMapsStrings.driving = this.cast("driving")
  @scala.inline
  def transit: typingsSlinky.googleMaps.googleMapsStrings.transit = this.cast("transit")
  @scala.inline
  def walking: typingsSlinky.googleMaps.googleMapsStrings.walking = this.cast("walking")
}

