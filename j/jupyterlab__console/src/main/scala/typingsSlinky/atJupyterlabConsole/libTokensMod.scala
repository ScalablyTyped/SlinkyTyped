package typingsSlinky.atJupyterlabConsole

import typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typingsSlinky.atJupyterlabConsole.libPanelMod.ConsolePanel
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IConsoleTracker: Token[typingsSlinky.atJupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}

