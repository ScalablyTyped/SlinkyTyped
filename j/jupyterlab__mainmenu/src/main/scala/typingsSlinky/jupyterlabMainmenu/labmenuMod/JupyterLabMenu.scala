package typingsSlinky.jupyterlabMainmenu.labmenuMod

import typingsSlinky.phosphorWidgets.menuMod.Menu.IOptions
import typingsSlinky.phosphorWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/labmenu", "JupyterLabMenu")
@js.native
class JupyterLabMenu protected () extends IJupyterLabMenu {
  /**
    * Construct a new menu.
    *
    * @param options - Options for the phosphor menu.
    *
    * @param includeSeparators - whether to include separators between the
    *   groups that are added to the menu.
    */
  def this(options: IOptions) = this()
  def this(options: IOptions, includeSeparators: Boolean) = this()
  var _groups: js.Any = js.native
  var _includeSeparators: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * The underlying Phosphor menu.
    */
  val menu: Menu = js.native
}

