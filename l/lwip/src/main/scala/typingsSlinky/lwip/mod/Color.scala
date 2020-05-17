package typingsSlinky.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - typingsSlinky.lwip.mod.ColorObject
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: ColorObject): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: js.Tuple4[Double, Double, Double, Double]): Color = value.asInstanceOf[Color]
}

