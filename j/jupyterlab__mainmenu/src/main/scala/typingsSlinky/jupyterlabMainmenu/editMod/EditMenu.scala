package typingsSlinky.jupyterlabMainmenu.editMod

import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
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
- typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu because var conflicts: isDisposed. Inlined undoers, clearers, goToLiners */ @JSImport("@jupyterlab/mainmenu/lib/edit", "EditMenu")
@js.native
class EditMenu protected () extends JupyterLabMenu {
  /**
    * Construct the edit menu.
    */
  def this(options: IOptions) = this()
  
  /**
    * A set storing IClearers for the Edit menu.
    */
  val clearers: Set[IClearer[Widget]] = js.native
  
  /**
    * A set storing IGoToLiners for the Edit menu.
    */
  val goToLiners: Set[IGoToLiner[Widget]] = js.native
  
  /**
    * A set storing IUndoers for the Edit menu.
    */
  val undoers: Set[IUndoer[Widget]] = js.native
}
