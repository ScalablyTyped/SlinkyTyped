package typingsSlinky.menubar.libUtilGetWindowPositionMod

import typingsSlinky.electron.electronMod.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.menubar.menubarStrings.top
  - typings.menubar.menubarStrings.bottom
  - typings.menubar.menubarStrings.left
  - typings.menubar.menubarStrings.right
*/
trait TaskbarLocation extends js.Object

object TaskbarLocation {
  @scala.inline
  def bottom: typingsSlinky.menubar.menubarStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typingsSlinky.menubar.menubarStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.menubar.menubarStrings.right = this.cast("right")
  @scala.inline
  def top: typingsSlinky.menubar.menubarStrings.top = this.cast("top")
}

@JSImport("menubar/lib/util/getWindowPosition", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  def apply(tray: Tray): TaskbarLocation = js.native
}

