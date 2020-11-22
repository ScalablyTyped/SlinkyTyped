package typingsSlinky.jupyterlabMainmenu.kernelMod

import typingsSlinky.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
- typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typingsSlinky.jupyterlabMainmenu.kernelMod.IKernelMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
@js.native
class KernelMenu protected () extends JupyterLabMenu {
  /**
    * Construct the kernel menu.
    */
  def this(options: IOptions) = this()
  
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}
