package typingsSlinky.jsonSchemaTyped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.array
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.boolean
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.integer
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.`null`
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.number
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.`object`
  - typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.string
*/
trait JSONSchemaTypeName extends _JSONSchemaTypeValue

object JSONSchemaTypeName {
  @scala.inline
  def array: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.jsonSchemaTyped.jsonSchemaTypedStrings.string = this.cast("string")
}

