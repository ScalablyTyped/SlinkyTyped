package typingsSlinky.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.revalidator.revalidatorStrings.string
  - typings.revalidator.revalidatorStrings.number
  - typings.revalidator.revalidatorStrings.integer
  - typings.revalidator.revalidatorStrings.array
  - typings.revalidator.revalidatorStrings.boolean
  - typings.revalidator.revalidatorStrings.`object`
  - typings.revalidator.revalidatorStrings.`null`
  - typings.revalidator.revalidatorStrings.any
*/
trait Types extends js.Object

object Types {
  @scala.inline
  def any: typingsSlinky.revalidator.revalidatorStrings.any = this.cast("any")
  @scala.inline
  def array: typingsSlinky.revalidator.revalidatorStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.revalidator.revalidatorStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.revalidator.revalidatorStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typingsSlinky.revalidator.revalidatorStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.revalidator.revalidatorStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.revalidator.revalidatorStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.revalidator.revalidatorStrings.string = this.cast("string")
}

