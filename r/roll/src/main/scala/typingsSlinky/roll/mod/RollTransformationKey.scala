package typingsSlinky.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.roll.rollStrings.sum
  - typingsSlinky.roll.rollStrings.add
  - typingsSlinky.roll.rollStrings.subtract
  - typingsSlinky.roll.rollStrings.multiply
  - typingsSlinky.roll.rollStrings.divide
  - typingsSlinky.roll.rollStrings.`best-of`
  - typingsSlinky.roll.rollStrings.`worst-of`
*/
trait RollTransformationKey extends js.Object

object RollTransformationKey {
  @scala.inline
  def add: typingsSlinky.roll.rollStrings.add = this.cast("add")
  @scala.inline
  def `best-of`: typingsSlinky.roll.rollStrings.`best-of` = this.cast("best-of")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def divide: typingsSlinky.roll.rollStrings.divide = this.cast("divide")
  @scala.inline
  def multiply: typingsSlinky.roll.rollStrings.multiply = this.cast("multiply")
  @scala.inline
  def subtract: typingsSlinky.roll.rollStrings.subtract = this.cast("subtract")
  @scala.inline
  def sum: typingsSlinky.roll.rollStrings.sum = this.cast("sum")
  @scala.inline
  def `worst-of`: typingsSlinky.roll.rollStrings.`worst-of` = this.cast("worst-of")
}

