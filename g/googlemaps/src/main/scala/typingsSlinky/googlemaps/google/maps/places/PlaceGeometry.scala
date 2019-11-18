package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceGeometry extends js.Object {
  var location: LatLng
  var viewport: LatLngBounds
}

object PlaceGeometry {
  @scala.inline
  def apply(location: LatLng, viewport: LatLngBounds): PlaceGeometry = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceGeometry]
  }
}

