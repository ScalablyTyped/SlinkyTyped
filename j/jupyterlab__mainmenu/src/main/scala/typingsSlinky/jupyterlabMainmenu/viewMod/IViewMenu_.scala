package typingsSlinky.jupyterlabMainmenu.viewMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typingsSlinky.phosphorWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

