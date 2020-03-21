package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactHotkeys.reactHotkeysStrings.keyup
  - typingsSlinky.reactHotkeys.reactHotkeysStrings.keydown
  - typingsSlinky.reactHotkeys.reactHotkeysStrings.keypress
*/
trait KeyEventName extends js.Object

object KeyEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsSlinky.reactHotkeys.reactHotkeysStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsSlinky.reactHotkeys.reactHotkeysStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsSlinky.reactHotkeys.reactHotkeysStrings.keyup = this.cast("keyup")
}

