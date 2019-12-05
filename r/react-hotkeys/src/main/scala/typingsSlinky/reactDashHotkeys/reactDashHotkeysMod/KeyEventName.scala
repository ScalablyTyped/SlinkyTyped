package typingsSlinky.reactDashHotkeys.reactDashHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashHotkeys.reactDashHotkeysStrings.keyup
  - typings.reactDashHotkeys.reactDashHotkeysStrings.keydown
  - typings.reactDashHotkeys.reactDashHotkeysStrings.keypress
*/
trait KeyEventName extends js.Object

object KeyEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsSlinky.reactDashHotkeys.reactDashHotkeysStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsSlinky.reactDashHotkeys.reactDashHotkeysStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsSlinky.reactDashHotkeys.reactDashHotkeysStrings.keyup = this.cast("keyup")
}

