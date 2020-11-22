package typingsSlinky.jupyterlabConsole

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  
  val IConsoleTracker: Token[typingsSlinky.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}
