package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - typingsSlinky.leaflet.mod.Point_
*/
trait Point extends js.Object

object Point {
  @scala.inline
  implicit def apply(value: Point_): Point = value.asInstanceOf[Point]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): Point = value.asInstanceOf[Point]
}

