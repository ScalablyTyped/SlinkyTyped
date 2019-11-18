package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxOptions extends js.Object {
  var bounds: LatLngBounds | LatLngBoundsLiteral
}

object SearchBoxOptions {
  @scala.inline
  def apply(bounds: LatLngBounds | LatLngBoundsLiteral): SearchBoxOptions = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchBoxOptions]
  }
}

