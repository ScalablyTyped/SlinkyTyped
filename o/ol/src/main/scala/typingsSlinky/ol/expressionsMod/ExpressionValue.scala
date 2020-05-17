package typingsSlinky.ol.expressionsMod

import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[js.Any]
  - typingsSlinky.ol.colorMod.Color
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait ExpressionValue extends js.Object

object ExpressionValue {
  @scala.inline
  implicit def apply(value: js.Array[js.Any] | Color): ExpressionValue = value.asInstanceOf[ExpressionValue]
  @scala.inline
  implicit def apply(value: Boolean): ExpressionValue = value.asInstanceOf[ExpressionValue]
  @scala.inline
  implicit def apply(value: Double): ExpressionValue = value.asInstanceOf[ExpressionValue]
  @scala.inline
  implicit def apply(value: String): ExpressionValue = value.asInstanceOf[ExpressionValue]
}

