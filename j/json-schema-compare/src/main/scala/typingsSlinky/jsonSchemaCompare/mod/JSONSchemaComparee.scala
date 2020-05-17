package typingsSlinky.jsonSchemaCompare.mod

import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema6Definition
import typingsSlinky.jsonSchema.mod.JSONSchema7Definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchema.mod.JSONSchema4
  - typingsSlinky.jsonSchema.mod.JSONSchema6Definition
  - typingsSlinky.jsonSchema.mod.JSONSchema7Definition
  - js.UndefOr[scala.Nothing]
*/
trait JSONSchemaComparee extends js.Object

object JSONSchemaComparee {
  @scala.inline
  implicit def apply(value: JSONSchema4): JSONSchemaComparee = value.asInstanceOf[JSONSchemaComparee]
  @scala.inline
  implicit def apply(value: JSONSchema6Definition): JSONSchemaComparee = value.asInstanceOf[JSONSchemaComparee]
  @scala.inline
  implicit def apply(value: JSONSchema7Definition): JSONSchemaComparee = value.asInstanceOf[JSONSchemaComparee]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => JSONSchemaComparee): JSONSchemaComparee = value.asInstanceOf[JSONSchemaComparee]
}

