package typingsSlinky.clsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.clsx.mod.ClassArray
  - typingsSlinky.clsx.mod.ClassDictionary
  - java.lang.String
  - scala.Double
  - scala.Null
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
*/
trait ClassValue extends js.Object

object ClassValue {
  @scala.inline
  implicit def apply(value: Boolean): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def apply(value: ClassArray): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def apply(value: ClassDictionary): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def apply(value: Double): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def apply(value: Null): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def apply(value: String): ClassValue = value.asInstanceOf[ClassValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ClassValue): ClassValue = value.asInstanceOf[ClassValue]
}

