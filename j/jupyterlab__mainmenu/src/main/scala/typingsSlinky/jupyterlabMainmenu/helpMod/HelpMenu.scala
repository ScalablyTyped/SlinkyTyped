package typingsSlinky.jupyterlabMainmenu.helpMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
@js.native
class HelpMenu protected ()
  extends JupyterLabMenu
     with IHelpMenu {
  /**
    * Construct the help menu.
    */
  def this(options: IOptions) = this()
}

