package typingsSlinky.jupyterlabMainmenu.viewMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
@js.native
class ViewMenu protected ()
  extends JupyterLabMenu
     with IViewMenu {
  /**
    * Construct the view menu.
    */
  def this(options: IOptions) = this()
}

