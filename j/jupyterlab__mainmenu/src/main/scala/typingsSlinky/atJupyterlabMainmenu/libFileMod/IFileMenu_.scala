package typingsSlinky.atJupyterlabMainmenu.libFileMod

import typingsSlinky.atJupyterlabMainmenu.libFileMod.IFileMenu.ICloseAndCleaner
import typingsSlinky.atJupyterlabMainmenu.libFileMod.IFileMenu.IConsoleCreator
import typingsSlinky.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IFileMenu")
@js.native
trait IFileMenu_ extends IJupyterLabMenu {
  /**
    * The close and cleanup extension point.
    */
  val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
  /**
    * A set storing IConsoleCreators for the File menu.
    */
  val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
  /**
    * A submenu for creating new files/launching new activities.
    */
  val newMenu: IJupyterLabMenu = js.native
  /**
    * Option to add a `Quit` entry in the File menu
    */
  var quitEntry: Boolean = js.native
}

