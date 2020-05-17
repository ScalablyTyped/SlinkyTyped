package typingsSlinky.jsonSchemaRefParser.mod

import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchema.mod.JSONSchema4
  - typingsSlinky.jsonSchema.mod.JSONSchema6
*/
trait JSONSchema extends js.Object

object JSONSchema {
  @scala.inline
  implicit def apply(value: JSONSchema4): JSONSchema = value.asInstanceOf[JSONSchema]
  @scala.inline
  implicit def apply(value: JSONSchema6): JSONSchema = value.asInstanceOf[JSONSchema]
}

