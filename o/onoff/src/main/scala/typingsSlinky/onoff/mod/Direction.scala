package typingsSlinky.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.onoff.onoffStrings.in
  - typingsSlinky.onoff.onoffStrings.out
  - typingsSlinky.onoff.onoffStrings.high
  - typingsSlinky.onoff.onoffStrings.low
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.onoff.onoffStrings.high = this.cast("high")
  @scala.inline
  def in: typingsSlinky.onoff.onoffStrings.in = this.cast("in")
  @scala.inline
  def low: typingsSlinky.onoff.onoffStrings.low = this.cast("low")
  @scala.inline
  def out: typingsSlinky.onoff.onoffStrings.out = this.cast("out")
}

