package typingsSlinky.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleMaps.atGoogleMapsStrings.geocode
  - typings.atGoogleMaps.atGoogleMapsStrings.address
  - typings.atGoogleMaps.atGoogleMapsStrings.establishment
  - typings.atGoogleMaps.atGoogleMapsStrings.`(regions)`
  - typings.atGoogleMaps.atGoogleMapsStrings.`(cities)`
*/
trait PlaceAutocompleteType extends js.Object

object PlaceAutocompleteType {
  @scala.inline
  def `(cities)`: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.`(cities)` = this.cast("(cities)")
  @scala.inline
  def `(regions)`: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.`(regions)` = this.cast("(regions)")
  @scala.inline
  def address: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typingsSlinky.atGoogleMaps.atGoogleMapsStrings.geocode = this.cast("geocode")
}

