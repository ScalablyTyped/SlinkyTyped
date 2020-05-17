package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.Point
  - js.Tuple2[scala.Double, scala.Double]
*/
trait PointLike extends js.Object

object PointLike {
  @scala.inline
  implicit def apply(value: Point): PointLike = value.asInstanceOf[PointLike]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): PointLike = value.asInstanceOf[PointLike]
}

