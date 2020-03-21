package typingsSlinky.pluralsCldr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.zero
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.one
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.two
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.few
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.many
  - typingsSlinky.pluralsCldr.pluralsCldrStrings.other
*/
trait Form extends js.Object

object Form {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def few: typingsSlinky.pluralsCldr.pluralsCldrStrings.few = this.cast("few")
  @scala.inline
  def many: typingsSlinky.pluralsCldr.pluralsCldrStrings.many = this.cast("many")
  @scala.inline
  def one: typingsSlinky.pluralsCldr.pluralsCldrStrings.one = this.cast("one")
  @scala.inline
  def other: typingsSlinky.pluralsCldr.pluralsCldrStrings.other = this.cast("other")
  @scala.inline
  def two: typingsSlinky.pluralsCldr.pluralsCldrStrings.two = this.cast("two")
  @scala.inline
  def zero: typingsSlinky.pluralsCldr.pluralsCldrStrings.zero = this.cast("zero")
}

