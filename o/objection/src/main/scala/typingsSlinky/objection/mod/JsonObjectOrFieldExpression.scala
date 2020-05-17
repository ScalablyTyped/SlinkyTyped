package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.Array[js.Object]
  - typingsSlinky.objection.mod.FieldExpression
*/
trait JsonObjectOrFieldExpression extends js.Object

object JsonObjectOrFieldExpression {
  @scala.inline
  implicit def apply(value: js.Array[js.Object]): JsonObjectOrFieldExpression = value.asInstanceOf[JsonObjectOrFieldExpression]
  @scala.inline
  implicit def apply(value: FieldExpression): JsonObjectOrFieldExpression = value.asInstanceOf[JsonObjectOrFieldExpression]
  @scala.inline
  implicit def apply(value: js.Object): JsonObjectOrFieldExpression = value.asInstanceOf[JsonObjectOrFieldExpression]
}

