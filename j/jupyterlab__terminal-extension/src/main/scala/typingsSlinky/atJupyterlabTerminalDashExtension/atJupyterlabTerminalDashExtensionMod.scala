package typingsSlinky.atJupyterlabTerminalDashExtension

import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminal.IOptions
import typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminal.ITerminal
import typingsSlinky.atJupyterlabTerminal.libTokensMod.ITerminalTracker
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object atJupyterlabTerminalDashExtensionMod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: Partial[IOptions]
  ): Unit = js.native
}

