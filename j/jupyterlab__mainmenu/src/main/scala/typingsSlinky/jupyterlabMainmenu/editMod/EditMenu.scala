package typingsSlinky.jupyterlabMainmenu.editMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/edit", "EditMenu")
@js.native
class EditMenu protected ()
  extends JupyterLabMenu
     with IEditMenu {
  /**
    * Construct the edit menu.
    */
  def this(options: IOptions) = this()
}

