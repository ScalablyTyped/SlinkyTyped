package typingsSlinky.atJupyterlabMainmenu.libViewMod

import typingsSlinky.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typingsSlinky.atJupyterlabMainmenu.libViewMod.IViewMenu.IEditorViewer
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IViewMenu")
@js.native
trait IViewMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

