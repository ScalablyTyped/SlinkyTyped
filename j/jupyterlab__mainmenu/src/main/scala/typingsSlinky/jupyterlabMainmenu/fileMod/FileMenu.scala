package typingsSlinky.jupyterlabMainmenu.fileMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/file", "FileMenu")
@js.native
class FileMenu protected ()
  extends JupyterLabMenu
     with IFileMenu {
  def this(options: IOptions) = this()
  /**
    * The New submenu.
    */
  @JSName("newMenu")
  val newMenu_FileMenu: JupyterLabMenu = js.native
}

