package typingsSlinky.blessed.mod.Widgets.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blessed.blessedStrings.left
  - typingsSlinky.blessed.blessedStrings.center
  - typingsSlinky.blessed.blessedStrings.right
*/
trait TAlign extends js.Object

object TAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.blessed.blessedStrings.center = this.cast("center")
  @scala.inline
  def left: typingsSlinky.blessed.blessedStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.blessed.blessedStrings.right = this.cast("right")
}

