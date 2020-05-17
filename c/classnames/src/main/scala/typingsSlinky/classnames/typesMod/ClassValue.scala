package typingsSlinky.classnames.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.classnames.typesMod.ClassDictionary
  - typingsSlinky.classnames.typesMod.ClassArray
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - scala.Boolean
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

