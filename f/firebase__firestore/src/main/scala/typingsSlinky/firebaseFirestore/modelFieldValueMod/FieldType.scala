package typingsSlinky.firebaseFirestore.modelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - js.Object
*/
trait FieldType extends js.Object

object FieldType {
  @scala.inline
  implicit def apply(value: Boolean): FieldType = value.asInstanceOf[FieldType]
  @scala.inline
  implicit def apply(value: Double): FieldType = value.asInstanceOf[FieldType]
  @scala.inline
  implicit def apply(value: Null): FieldType = value.asInstanceOf[FieldType]
  @scala.inline
  implicit def apply(value: js.Object): FieldType = value.asInstanceOf[FieldType]
  @scala.inline
  implicit def apply(value: String): FieldType = value.asInstanceOf[FieldType]
}

