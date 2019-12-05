package typingsSlinky.blessed.blessedMod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blessed.blessedStrings.mousedown
  - typings.blessed.blessedStrings.mouseup
  - typings.blessed.blessedStrings.mousemove
*/
trait TMouseAction extends js.Object

object TMouseAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mousedown: typingsSlinky.blessed.blessedStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mousemove: typingsSlinky.blessed.blessedStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def mouseup: typingsSlinky.blessed.blessedStrings.mouseup = this.cast("mouseup")
}

