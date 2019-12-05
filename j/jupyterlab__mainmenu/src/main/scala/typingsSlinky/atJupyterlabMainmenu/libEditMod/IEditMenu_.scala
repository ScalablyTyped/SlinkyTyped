package typingsSlinky.atJupyterlabMainmenu.libEditMod

import typingsSlinky.atJupyterlabMainmenu.libEditMod.IEditMenu.IClearer
import typingsSlinky.atJupyterlabMainmenu.libEditMod.IEditMenu.IGoToLiner
import typingsSlinky.atJupyterlabMainmenu.libEditMod.IEditMenu.IUndoer
import typingsSlinky.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IEditMenu")
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

