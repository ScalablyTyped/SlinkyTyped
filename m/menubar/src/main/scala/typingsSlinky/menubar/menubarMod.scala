package typingsSlinky.menubar

import typingsSlinky.electron.Electron.App
import typingsSlinky.electron.electronMod.Tray
import typingsSlinky.menubar.libTypesMod.Options
import typingsSlinky.menubar.libUtilGetWindowPositionMod.TaskbarLocation
import typingsSlinky.menubar.libUtilGetWindowPositionMod.WindowPosition
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", JSImport.Namespace)
@js.native
object menubarMod extends js.Object {
  @js.native
  class Menubar protected ()
    extends typingsSlinky.menubar.libMenubarMod.Menubar {
    def this(app: App) = this()
    def this(app: App, options: Partial[Options]) = this()
  }
  
  def getWindowPosition(tray: Tray): WindowPosition = js.native
  def menubar(): typingsSlinky.menubar.libMenubarMod.Menubar = js.native
  def menubar(options: Partial[Options]): typingsSlinky.menubar.libMenubarMod.Menubar = js.native
  def taskbarLocation(tray: Tray): TaskbarLocation = js.native
}

