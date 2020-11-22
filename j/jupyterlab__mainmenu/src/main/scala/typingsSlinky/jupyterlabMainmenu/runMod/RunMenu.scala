package typingsSlinky.jupyterlabMainmenu.runMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
- typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu because var conflicts: isDisposed. Inlined codeRunners */ @JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
@js.native
class RunMenu protected () extends JupyterLabMenu {
  /**
    * Construct the run menu.
    */
  def this(options: IOptions) = this()
  
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: Set[ICodeRunner[Widget]] = js.native
}
