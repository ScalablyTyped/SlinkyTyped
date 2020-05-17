package typingsSlinky.googleProtobuf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.googleProtobuf.mod.FieldValueArray
  - js.UndefOr[scala.Nothing]
*/
trait FieldValue extends js.Object

object FieldValue {
  @scala.inline
  implicit def apply(value: Boolean): FieldValue = value.asInstanceOf[FieldValue]
  @scala.inline
  implicit def apply(value: Double): FieldValue = value.asInstanceOf[FieldValue]
  @scala.inline
  implicit def apply(value: FieldValueArray): FieldValue = value.asInstanceOf[FieldValue]
  @scala.inline
  implicit def apply(value: String): FieldValue = value.asInstanceOf[FieldValue]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): FieldValue = value.asInstanceOf[FieldValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => FieldValue): FieldValue = value.asInstanceOf[FieldValue]
}

