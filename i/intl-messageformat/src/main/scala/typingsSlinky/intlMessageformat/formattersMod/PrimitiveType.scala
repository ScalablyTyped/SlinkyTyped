package typingsSlinky.intlMessageformat.formattersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.std.Date
*/
trait PrimitiveType extends js.Object

object PrimitiveType {
  @scala.inline
  implicit def apply(value: Boolean): PrimitiveType = value.asInstanceOf[PrimitiveType]
  @scala.inline
  implicit def apply(value: js.Date): PrimitiveType = value.asInstanceOf[PrimitiveType]
  @scala.inline
  implicit def apply(value: Double): PrimitiveType = value.asInstanceOf[PrimitiveType]
  @scala.inline
  implicit def apply(value: Null): PrimitiveType = value.asInstanceOf[PrimitiveType]
  @scala.inline
  implicit def apply(value: String): PrimitiveType = value.asInstanceOf[PrimitiveType]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PrimitiveType): PrimitiveType = value.asInstanceOf[PrimitiveType]
}

