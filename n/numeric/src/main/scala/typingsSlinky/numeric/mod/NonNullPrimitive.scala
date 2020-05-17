package typingsSlinky.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
*/
trait NonNullPrimitive extends js.Object

object NonNullPrimitive {
  @scala.inline
  implicit def apply(value: Boolean): NonNullPrimitive = value.asInstanceOf[NonNullPrimitive]
  @scala.inline
  implicit def apply(value: Double): NonNullPrimitive = value.asInstanceOf[NonNullPrimitive]
  @scala.inline
  implicit def apply(value: String): NonNullPrimitive = value.asInstanceOf[NonNullPrimitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => NonNullPrimitive): NonNullPrimitive = value.asInstanceOf[NonNullPrimitive]
}

