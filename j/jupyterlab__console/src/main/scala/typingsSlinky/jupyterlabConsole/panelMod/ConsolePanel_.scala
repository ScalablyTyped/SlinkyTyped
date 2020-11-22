package typingsSlinky.jupyterlabConsole.panelMod

import typingsSlinky.jupyterlabApputils.mod.MainAreaWidget
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory
import typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel.IOptions
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole
import typingsSlinky.luminoWidgets.mod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
@js.native
class ConsolePanel_ protected () extends MainAreaWidget[Panel] {
  /**
    * Construct a console panel.
    */
  def this(options: IOptions) = this()
  
  var _connected: js.Any = js.native
  
  var _executed: js.Any = js.native
  
  /**
    * Handle a console execution.
    */
  var _onExecuted: js.Any = js.native
  
  var _sessionContext: js.Any = js.native
  
  /**
    * Update the console panel title.
    */
  var _updateTitlePanel: js.Any = js.native
  
  /**
    * The console widget used by the panel.
    */
  var console: CodeConsole = js.native
  
  /**
    * The content factory used by the console panel.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * The session used by the panel.
    */
  def sessionContext: ISessionContext = js.native
}
