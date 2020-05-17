package typingsSlinky.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - js.Array[js.Object]
*/
trait FieldValueType extends js.Object

object FieldValueType {
  @scala.inline
  implicit def apply(value: js.Array[js.Object]): FieldValueType = value.asInstanceOf[FieldValueType]
  @scala.inline
  implicit def apply(value: js.Object): FieldValueType = value.asInstanceOf[FieldValueType]
  @scala.inline
  implicit def apply(value: String): FieldValueType = value.asInstanceOf[FieldValueType]
}

