package typingsSlinky.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.error
  - typings.blessed.blessedStrings.submit
  - typings.blessed.blessedStrings.cancel
  - typings.blessed.blessedStrings.action
*/
trait TextareaElementEventType extends js.Object

object TextareaElementEventType {
  @scala.inline
  def action: typingsSlinky.blessed.blessedStrings.action = this.cast("action")
  @scala.inline
  def cancel: typingsSlinky.blessed.blessedStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.blessed.blessedStrings.error = this.cast("error")
  @scala.inline
  def submit: typingsSlinky.blessed.blessedStrings.submit = this.cast("submit")
}

