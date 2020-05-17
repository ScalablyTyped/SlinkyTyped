package typingsSlinky.schemaUtils.validationErrorMod

import typingsSlinky.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchema.mod.JSONSchema4
  - typingsSlinky.jsonSchema.mod.JSONSchema6
  - typingsSlinky.jsonSchema.mod.JSONSchema7
*/
trait Schema extends js.Object

object Schema {
  @scala.inline
  implicit def apply(value: JSONSchema4): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: typingsSlinky.jsonSchema.mod.JSONSchema6): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: typingsSlinky.jsonSchema.mod.JSONSchema7): Schema = value.asInstanceOf[Schema]
}

