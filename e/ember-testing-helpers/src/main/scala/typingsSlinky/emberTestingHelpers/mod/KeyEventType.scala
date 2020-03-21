package typingsSlinky.emberTestingHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keydown
  - typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keyup
  - typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keypress
*/
trait KeyEventType extends js.Object

object KeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsSlinky.emberTestingHelpers.emberTestingHelpersStrings.keyup = this.cast("keyup")
}

