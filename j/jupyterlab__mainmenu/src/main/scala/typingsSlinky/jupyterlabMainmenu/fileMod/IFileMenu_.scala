package typingsSlinky.jupyterlabMainmenu.fileMod

import typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
