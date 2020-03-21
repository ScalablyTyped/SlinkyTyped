package typingsSlinky.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.asyncValidator.asyncValidatorStrings.string
  - typingsSlinky.asyncValidator.asyncValidatorStrings.number
  - typingsSlinky.asyncValidator.asyncValidatorStrings.boolean
  - typingsSlinky.asyncValidator.asyncValidatorStrings.method
  - typingsSlinky.asyncValidator.asyncValidatorStrings.regexp
  - typingsSlinky.asyncValidator.asyncValidatorStrings.integer
  - typingsSlinky.asyncValidator.asyncValidatorStrings.float
  - typingsSlinky.asyncValidator.asyncValidatorStrings.array
  - typingsSlinky.asyncValidator.asyncValidatorStrings.`object`
  - typingsSlinky.asyncValidator.asyncValidatorStrings.enum
  - typingsSlinky.asyncValidator.asyncValidatorStrings.date
  - typingsSlinky.asyncValidator.asyncValidatorStrings.url
  - typingsSlinky.asyncValidator.asyncValidatorStrings.hex
  - typingsSlinky.asyncValidator.asyncValidatorStrings.email
  - typingsSlinky.asyncValidator.asyncValidatorStrings.any
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  def any: typingsSlinky.asyncValidator.asyncValidatorStrings.any = this.cast("any")
  @scala.inline
  def array: typingsSlinky.asyncValidator.asyncValidatorStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.asyncValidator.asyncValidatorStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.asyncValidator.asyncValidatorStrings.date = this.cast("date")
  @scala.inline
  def email: typingsSlinky.asyncValidator.asyncValidatorStrings.email = this.cast("email")
  @scala.inline
  def enum: typingsSlinky.asyncValidator.asyncValidatorStrings.enum = this.cast("enum")
  @scala.inline
  def float: typingsSlinky.asyncValidator.asyncValidatorStrings.float = this.cast("float")
  @scala.inline
  def hex: typingsSlinky.asyncValidator.asyncValidatorStrings.hex = this.cast("hex")
  @scala.inline
  def integer: typingsSlinky.asyncValidator.asyncValidatorStrings.integer = this.cast("integer")
  @scala.inline
  def method: typingsSlinky.asyncValidator.asyncValidatorStrings.method = this.cast("method")
  @scala.inline
  def number: typingsSlinky.asyncValidator.asyncValidatorStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.asyncValidator.asyncValidatorStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typingsSlinky.asyncValidator.asyncValidatorStrings.regexp = this.cast("regexp")
  @scala.inline
  def string: typingsSlinky.asyncValidator.asyncValidatorStrings.string = this.cast("string")
  @scala.inline
  def url: typingsSlinky.asyncValidator.asyncValidatorStrings.url = this.cast("url")
}

