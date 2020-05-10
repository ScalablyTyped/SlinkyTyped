package typingsSlinky.jupyterlabMainmenu.kernelMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
@js.native
class KernelMenu protected ()
  extends JupyterLabMenu
     with IKernelMenu {
  /**
    * Construct the kernel menu.
    */
  def this(options: IOptions) = this()
}

