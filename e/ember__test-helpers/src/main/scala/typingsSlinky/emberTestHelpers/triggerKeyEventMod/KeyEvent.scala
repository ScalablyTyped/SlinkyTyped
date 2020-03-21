package typingsSlinky.emberTestHelpers.triggerKeyEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keydown
  - typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keyup
  - typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keypress
*/
trait KeyEvent extends js.Object

object KeyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsSlinky.emberTestHelpers.emberTestHelpersStrings.keyup = this.cast("keyup")
}

