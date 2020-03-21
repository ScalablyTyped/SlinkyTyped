package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blessed.blessedStrings.adopt
  - typingsSlinky.blessed.blessedStrings.remove
  - typingsSlinky.blessed.blessedStrings.reparent
  - typingsSlinky.blessed.blessedStrings.attach
  - typingsSlinky.blessed.blessedStrings.detach
*/
trait NodeEventType extends js.Object

object NodeEventType {
  @scala.inline
  def adopt: typingsSlinky.blessed.blessedStrings.adopt = this.cast("adopt")
  @scala.inline
  def attach: typingsSlinky.blessed.blessedStrings.attach = this.cast("attach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def detach: typingsSlinky.blessed.blessedStrings.detach = this.cast("detach")
  @scala.inline
  def remove: typingsSlinky.blessed.blessedStrings.remove = this.cast("remove")
  @scala.inline
  def reparent: typingsSlinky.blessed.blessedStrings.reparent = this.cast("reparent")
}

