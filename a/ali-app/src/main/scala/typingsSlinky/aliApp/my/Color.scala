package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
  - scala.Double
  - typingsSlinky.aliApp.my.CanvasAction
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: CanvasAction): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: Double): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

