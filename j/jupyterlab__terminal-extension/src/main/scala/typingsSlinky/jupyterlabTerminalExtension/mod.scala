package typingsSlinky.jupyterlabTerminalExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabApputils.mod.MainAreaWidget
import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminalTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: PartialIOptions
  ): Unit = js.native
}

