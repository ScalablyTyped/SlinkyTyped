package typingsSlinky.jupyterlabTerminalExtension

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabApputils.mod.MainAreaWidget
import typingsSlinky.jupyterlabApputils.mod.WidgetTracker
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typingsSlinky.jupyterlabTerminal.tokensMod.ITerminalTracker
import typingsSlinky.jupyterlabTerminalExtension.anon.PartialIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default terminal extension.
    */
  @JSImport("@jupyterlab/terminal-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  
  @JSImport("@jupyterlab/terminal-extension", "addCommands")
  @js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: PartialIOptions
  ): Unit = js.native
  
  type _To = JupyterFrontEndPlugin[ITerminalTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ITerminalTracker] = default
}
