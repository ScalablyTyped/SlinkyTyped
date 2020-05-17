package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.LngLatBounds
  - js.Tuple2[typingsSlinky.mapboxGl.mod.LngLatLike, typingsSlinky.mapboxGl.mod.LngLatLike]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
*/
trait LngLatBoundsLike extends js.Object

object LngLatBoundsLike {
  @scala.inline
  implicit def apply(value: LngLatBounds): LngLatBoundsLike = value.asInstanceOf[LngLatBoundsLike]
  @scala.inline
  implicit def apply(value: js.Tuple2[LngLatLike, LngLatLike]): LngLatBoundsLike = value.asInstanceOf[LngLatBoundsLike]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): LngLatBoundsLike = value.asInstanceOf[LngLatBoundsLike]
}

