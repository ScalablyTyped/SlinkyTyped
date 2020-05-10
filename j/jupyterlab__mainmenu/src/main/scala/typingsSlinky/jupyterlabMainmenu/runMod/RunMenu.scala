package typingsSlinky.jupyterlabMainmenu.runMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
@js.native
class RunMenu protected ()
  extends JupyterLabMenu
     with IRunMenu {
  /**
    * Construct the run menu.
    */
  def this(options: IOptions) = this()
}

