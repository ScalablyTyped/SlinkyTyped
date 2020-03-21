package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.tolls
  - typingsSlinky.googleMaps.googleMapsStrings.highways
  - typingsSlinky.googleMaps.googleMapsStrings.ferries
  - typingsSlinky.googleMaps.googleMapsStrings.indoor
*/
trait TravelRestriction extends js.Object

object TravelRestriction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferries: typingsSlinky.googleMaps.googleMapsStrings.ferries = this.cast("ferries")
  @scala.inline
  def highways: typingsSlinky.googleMaps.googleMapsStrings.highways = this.cast("highways")
  @scala.inline
  def indoor: typingsSlinky.googleMaps.googleMapsStrings.indoor = this.cast("indoor")
  @scala.inline
  def tolls: typingsSlinky.googleMaps.googleMapsStrings.tolls = this.cast("tolls")
}

