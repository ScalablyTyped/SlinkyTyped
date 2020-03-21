package typingsSlinky.carlo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.carlo.carloStrings.exit
  - typingsSlinky.carlo.carloStrings.window
*/
trait AppEvent extends js.Object

object AppEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exit: typingsSlinky.carlo.carloStrings.exit = this.cast("exit")
  @scala.inline
  def window: typingsSlinky.carlo.carloStrings.window = this.cast("window")
}

