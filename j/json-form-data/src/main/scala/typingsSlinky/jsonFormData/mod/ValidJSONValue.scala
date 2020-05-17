package typingsSlinky.jsonFormData.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.File
  - typingsSlinky.std.Blob
  - typingsSlinky.std.Date
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ValidJSONValue extends js.Object

object ValidJSONValue {
  @scala.inline
  implicit def apply(value: Blob): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: Boolean): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: js.Date): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: Double): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: File): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: Null): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def apply(value: String): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ValidJSONValue): ValidJSONValue = value.asInstanceOf[ValidJSONValue]
}

