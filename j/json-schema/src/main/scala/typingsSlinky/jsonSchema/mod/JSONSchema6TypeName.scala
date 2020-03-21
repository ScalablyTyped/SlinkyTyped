package typingsSlinky.jsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchema.jsonSchemaStrings.string
  - typingsSlinky.jsonSchema.jsonSchemaStrings.number
  - typingsSlinky.jsonSchema.jsonSchemaStrings.integer
  - typingsSlinky.jsonSchema.jsonSchemaStrings.boolean
  - typingsSlinky.jsonSchema.jsonSchemaStrings.`object`
  - typingsSlinky.jsonSchema.jsonSchemaStrings.array
  - typingsSlinky.jsonSchema.jsonSchemaStrings.`null`
  - typingsSlinky.jsonSchema.jsonSchemaStrings.any
*/
trait JSONSchema6TypeName extends js.Object

object JSONSchema6TypeName {
  @scala.inline
  def any: typingsSlinky.jsonSchema.jsonSchemaStrings.any = this.cast("any")
  @scala.inline
  def array: typingsSlinky.jsonSchema.jsonSchemaStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.jsonSchema.jsonSchemaStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.jsonSchema.jsonSchemaStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typingsSlinky.jsonSchema.jsonSchemaStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.jsonSchema.jsonSchemaStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.jsonSchema.jsonSchemaStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.jsonSchema.jsonSchemaStrings.string = this.cast("string")
}

