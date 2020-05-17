package typingsSlinky.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.haversine.mod.CoordinateLongitudeLatitude
  - typingsSlinky.haversine.mod.CoordinateLonLat
  - typingsSlinky.haversine.mod.CoordinateLatLng
  - typingsSlinky.haversine.mod.LatLonTuple
  - typingsSlinky.haversine.mod.GeoJSON
*/
trait Coordinate
  extends ParamType[js.Any]

object Coordinate {
  @scala.inline
  implicit def apply(value: CoordinateLatLng): Coordinate = value.asInstanceOf[Coordinate]
  @scala.inline
  implicit def apply(value: CoordinateLonLat): Coordinate = value.asInstanceOf[Coordinate]
  @scala.inline
  implicit def apply(value: CoordinateLongitudeLatitude): Coordinate = value.asInstanceOf[Coordinate]
  @scala.inline
  implicit def apply(value: GeoJSON): Coordinate = value.asInstanceOf[Coordinate]
  @scala.inline
  implicit def apply(value: LatLonTuple): Coordinate = value.asInstanceOf[Coordinate]
}

