package typingsSlinky.jupyterlabMainmenu.editMod

import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditMenu_ extends IJupyterLabMenu {
  
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
