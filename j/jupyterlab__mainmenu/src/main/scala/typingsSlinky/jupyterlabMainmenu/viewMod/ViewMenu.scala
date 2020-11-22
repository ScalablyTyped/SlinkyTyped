package typingsSlinky.jupyterlabMainmenu.viewMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
- typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu because var conflicts: isDisposed. Inlined editorViewers */ @JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
@js.native
class ViewMenu protected () extends JupyterLabMenu {
  /**
    * Construct the view menu.
    */
  def this(options: IOptions) = this()
  
  /**
    * A set storing IEditorViewers for the View menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}
