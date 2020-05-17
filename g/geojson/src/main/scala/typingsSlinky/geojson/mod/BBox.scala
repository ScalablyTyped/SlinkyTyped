package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
*/
trait BBox extends js.Object

object BBox {
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): BBox = value.asInstanceOf[BBox]
  @scala.inline
  implicit def apply(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): BBox = value.asInstanceOf[BBox]
}

