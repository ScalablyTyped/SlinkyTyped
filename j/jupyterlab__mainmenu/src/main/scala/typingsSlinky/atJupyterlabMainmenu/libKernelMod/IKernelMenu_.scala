package typingsSlinky.atJupyterlabMainmenu.libKernelMod

import typingsSlinky.atJupyterlabMainmenu.libKernelMod.IKernelMenu.IKernelUser
import typingsSlinky.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IKernelMenu")
@js.native
trait IKernelMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

