package typingsSlinky.menubar.mod

import typingsSlinky.electron.mod.Tray
import typingsSlinky.menubar.getWindowPositionMod.WindowPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("menubar", "getWindowPosition")
@js.native
object getWindowPosition extends js.Object {
  
  def apply(tray: Tray): WindowPosition = js.native
}
