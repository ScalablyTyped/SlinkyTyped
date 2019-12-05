package typingsSlinky.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.driving
  - typings.atGoogleMaps.atGoogleMapsStrings.walking
  - typings.atGoogleMaps.atGoogleMapsStrings.bicycling
  - typings.atGoogleMaps.atGoogleMapsStrings.transit
*/
trait TravelMode extends js.Object

object TravelMode {
  @scala.inline
  def bicycling: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.bicycling = this.cast("bicycling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def driving: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.driving = this.cast("driving")
  @scala.inline
  def transit: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.transit = this.cast("transit")
  @scala.inline
  def walking: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.walking = this.cast("walking")
}

