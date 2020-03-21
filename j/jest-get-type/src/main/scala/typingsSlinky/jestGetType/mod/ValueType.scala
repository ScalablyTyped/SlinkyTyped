package typingsSlinky.jestGetType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestGetType.jestGetTypeStrings.array
  - typingsSlinky.jestGetType.jestGetTypeStrings.boolean
  - typingsSlinky.jestGetType.jestGetTypeStrings.function
  - typingsSlinky.jestGetType.jestGetTypeStrings.`null`
  - typingsSlinky.jestGetType.jestGetTypeStrings.number
  - typingsSlinky.jestGetType.jestGetTypeStrings.`object`
  - typingsSlinky.jestGetType.jestGetTypeStrings.regexp
  - typingsSlinky.jestGetType.jestGetTypeStrings.map
  - typingsSlinky.jestGetType.jestGetTypeStrings.set
  - typingsSlinky.jestGetType.jestGetTypeStrings.date
  - typingsSlinky.jestGetType.jestGetTypeStrings.string
  - typingsSlinky.jestGetType.jestGetTypeStrings.symbol
  - typingsSlinky.jestGetType.jestGetTypeStrings.undefined
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  def array: typingsSlinky.jestGetType.jestGetTypeStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.jestGetType.jestGetTypeStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.jestGetType.jestGetTypeStrings.date = this.cast("date")
  @scala.inline
  def function: typingsSlinky.jestGetType.jestGetTypeStrings.function = this.cast("function")
  @scala.inline
  def map: typingsSlinky.jestGetType.jestGetTypeStrings.map = this.cast("map")
  @scala.inline
  def `null`: typingsSlinky.jestGetType.jestGetTypeStrings.`null` = this.cast("null")
  @scala.inline
  def number: typingsSlinky.jestGetType.jestGetTypeStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.jestGetType.jestGetTypeStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typingsSlinky.jestGetType.jestGetTypeStrings.regexp = this.cast("regexp")
  @scala.inline
  def set: typingsSlinky.jestGetType.jestGetTypeStrings.set = this.cast("set")
  @scala.inline
  def string: typingsSlinky.jestGetType.jestGetTypeStrings.string = this.cast("string")
  @scala.inline
  def symbol: typingsSlinky.jestGetType.jestGetTypeStrings.symbol = this.cast("symbol")
  @scala.inline
  def undefined: typingsSlinky.jestGetType.jestGetTypeStrings.undefined = this.cast("undefined")
}

