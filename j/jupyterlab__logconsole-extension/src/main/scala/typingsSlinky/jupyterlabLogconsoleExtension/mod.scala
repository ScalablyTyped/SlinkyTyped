package typingsSlinky.jupyterlabLogconsoleExtension

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import typingsSlinky.jupyterlabLogconsole.mod.LogConsolePanel
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/logconsole-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = js.native
  
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
}
