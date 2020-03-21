package typingsSlinky.lightpick.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lightpick.lightpickStrings.long
  - typingsSlinky.lightpick.lightpickStrings.short
  - typingsSlinky.lightpick.lightpickStrings.narrow
*/
trait WeekdayStyle extends js.Object

object WeekdayStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsSlinky.lightpick.lightpickStrings.long = this.cast("long")
  @scala.inline
  def narrow: typingsSlinky.lightpick.lightpickStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typingsSlinky.lightpick.lightpickStrings.short = this.cast("short")
}

