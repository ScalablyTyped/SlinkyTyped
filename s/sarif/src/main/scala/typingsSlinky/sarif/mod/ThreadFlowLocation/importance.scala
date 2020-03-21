package typingsSlinky.sarif.mod.ThreadFlowLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sarif.sarifStrings.important
  - typingsSlinky.sarif.sarifStrings.essential
  - typingsSlinky.sarif.sarifStrings.unimportant
*/
trait importance extends js.Object

object importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def essential: typingsSlinky.sarif.sarifStrings.essential = this.cast("essential")
  @scala.inline
  def important: typingsSlinky.sarif.sarifStrings.important = this.cast("important")
  @scala.inline
  def unimportant: typingsSlinky.sarif.sarifStrings.unimportant = this.cast("unimportant")
}

