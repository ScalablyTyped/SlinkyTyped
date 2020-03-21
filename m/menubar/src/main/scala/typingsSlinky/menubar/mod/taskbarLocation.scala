package typingsSlinky.menubar.mod

import typingsSlinky.electron.mod.Tray
import typingsSlinky.menubar.getWindowPositionMod.TaskbarLocation_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  def apply(tray: Tray): TaskbarLocation_ = js.native
}

