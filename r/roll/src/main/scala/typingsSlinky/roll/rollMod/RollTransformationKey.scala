package typingsSlinky.roll.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.roll.rollStrings.sum
  - typings.roll.rollStrings.add
  - typings.roll.rollStrings.subtract
  - typings.roll.rollStrings.multiply
  - typings.roll.rollStrings.divide
  - typings.roll.rollStrings.`best-of`
  - typings.roll.rollStrings.`worst-of`
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

