package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.anon.Lat
import typingsSlinky.mapboxGl.anon.Lon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.LngLat
  - typingsSlinky.mapboxGl.anon.Lat
  - typingsSlinky.mapboxGl.anon.Lon
  - js.Tuple2[scala.Double, scala.Double]
*/
trait LngLatLike extends js.Object

object LngLatLike {
  @scala.inline
  implicit def apply(value: Lat): LngLatLike = value.asInstanceOf[LngLatLike]
  @scala.inline
  implicit def apply(value: LngLat): LngLatLike = value.asInstanceOf[LngLatLike]
  @scala.inline
  implicit def apply(value: Lon): LngLatLike = value.asInstanceOf[LngLatLike]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): LngLatLike = value.asInstanceOf[LngLatLike]
}

