package typingsSlinky.jupyterlabMainmenu.runMod

import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typingsSlinky.phosphorWidgets.mod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunMenu_ extends IJupyterLabMenu {
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: Set[ICodeRunner[Widget]] = js.native
}

