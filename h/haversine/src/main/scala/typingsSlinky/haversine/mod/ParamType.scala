package typingsSlinky.haversine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The input & output types of haversine() both depend on the Options object.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.haversine.mod.Coordinate
  - typingsSlinky.haversine.mod.GeoJSON
  - typingsSlinky.haversine.mod.CoordinateLatLng
  - typingsSlinky.haversine.mod.CoordinateLonLat
  - js.Tuple2[scala.Double, scala.Double]
  - typingsSlinky.haversine.mod.CoordinateLongitudeLatitude
*/
trait ParamType[T /* <: js.UndefOr[Options] */] extends js.Object

object ParamType {
  @scala.inline
  implicit def apply[T](value: Coordinate): ParamType[T] = value.asInstanceOf[ParamType[T]]
  @scala.inline
  implicit def apply[T](value: CoordinateLatLng): ParamType[T] = value.asInstanceOf[ParamType[T]]
  @scala.inline
  implicit def apply[T](value: CoordinateLonLat): ParamType[T] = value.asInstanceOf[ParamType[T]]
  @scala.inline
  implicit def apply[T](value: CoordinateLongitudeLatitude): ParamType[T] = value.asInstanceOf[ParamType[T]]
  @scala.inline
  implicit def apply[T](value: GeoJSON): ParamType[T] = value.asInstanceOf[ParamType[T]]
  @scala.inline
  implicit def apply[T](value: js.Tuple2[Double, Double]): ParamType[T] = value.asInstanceOf[ParamType[T]]
}

