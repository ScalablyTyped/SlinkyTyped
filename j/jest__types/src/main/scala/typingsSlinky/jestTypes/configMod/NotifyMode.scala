package typingsSlinky.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.jestTypesStrings.always
  - typingsSlinky.jestTypes.jestTypesStrings.failure
  - typingsSlinky.jestTypes.jestTypesStrings.success
  - typingsSlinky.jestTypes.jestTypesStrings.change
  - typingsSlinky.jestTypes.jestTypesStrings.`success-change`
  - typingsSlinky.jestTypes.jestTypesStrings.`failure-change`
*/
trait NotifyMode extends js.Object

object NotifyMode {
  @scala.inline
  def always: typingsSlinky.jestTypes.jestTypesStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.jestTypes.jestTypesStrings.change = this.cast("change")
  @scala.inline
  def failure: typingsSlinky.jestTypes.jestTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `failure-change`: typingsSlinky.jestTypes.jestTypesStrings.`failure-change` = this.cast("failure-change")
  @scala.inline
  def success: typingsSlinky.jestTypes.jestTypesStrings.success = this.cast("success")
  @scala.inline
  def `success-change`: typingsSlinky.jestTypes.jestTypesStrings.`success-change` = this.cast("success-change")
}

