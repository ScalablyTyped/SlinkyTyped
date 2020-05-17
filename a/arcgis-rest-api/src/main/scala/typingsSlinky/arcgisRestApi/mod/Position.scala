package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisRestApi.mod.Position2D
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
*/
trait Position extends js.Object

object Position {
  @scala.inline
  implicit def apply(value: Position2D): Position = value.asInstanceOf[Position]
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): Position = value.asInstanceOf[Position]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): Position = value.asInstanceOf[Position]
}

