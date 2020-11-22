package typingsSlinky.jupyterlabMainmenu.helpMod

import typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
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
- typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
@js.native
class HelpMenu protected () extends JupyterLabMenu {
  /**
    * Construct the help menu.
    */
  def this(options: IOptions) = this()
  
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}
