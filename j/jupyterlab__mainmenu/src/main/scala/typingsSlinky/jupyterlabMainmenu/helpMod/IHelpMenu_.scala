package typingsSlinky.jupyterlabMainmenu.helpMod

import typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.phosphorWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelpMenu_ extends IJupyterLabMenu {
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

