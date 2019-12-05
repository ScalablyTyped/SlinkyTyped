package typingsSlinky.atJupyterlabLogconsoleDashExtension

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typingsSlinky.atJupyterlabLogconsole.atJupyterlabLogconsoleMod.LogConsolePanel
import typingsSlinky.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typingsSlinky.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole-extension", JSImport.Namespace)
@js.native
object atJupyterlabLogconsoleDashExtensionMod extends js.Object {
  @js.native
  class LogLevelSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: LogConsolePanel) = this()
    var _id: js.Any = js.native
    var _logConsole: js.Any = js.native
    var _updateSource: js.Any = js.native
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: SyntheticKeyboardEvent[Element]): Unit = js.native
  }
  
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ILoggerRegistry | Unit]] = js.native
}

