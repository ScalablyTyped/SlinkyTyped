package typingsSlinky.reactPointable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactPointable.reactPointableStrings.auto
  - typingsSlinky.reactPointable.reactPointableStrings.none
  - typingsSlinky.reactPointable.reactPointableStrings.`pan-x`
  - typingsSlinky.reactPointable.reactPointableStrings.`pan-y`
  - typingsSlinky.reactPointable.reactPointableStrings.manipulation
*/
trait TouchAction extends js.Object

object TouchAction {
  @scala.inline
  def auto: typingsSlinky.reactPointable.reactPointableStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manipulation: typingsSlinky.reactPointable.reactPointableStrings.manipulation = this.cast("manipulation")
  @scala.inline
  def none: typingsSlinky.reactPointable.reactPointableStrings.none = this.cast("none")
  @scala.inline
  def `pan-x`: typingsSlinky.reactPointable.reactPointableStrings.`pan-x` = this.cast("pan-x")
  @scala.inline
  def `pan-y`: typingsSlinky.reactPointable.reactPointableStrings.`pan-y` = this.cast("pan-y")
}

