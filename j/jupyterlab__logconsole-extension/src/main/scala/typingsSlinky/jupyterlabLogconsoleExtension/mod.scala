package typingsSlinky.jupyterlabLogconsoleExtension

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApputils.mod.ReactWidget
import typingsSlinky.jupyterlabLogconsole.mod.LogConsolePanel
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/logconsole-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = js.native
  
  @JSImport("@jupyterlab/logconsole-extension", "LogLevelSwitcher")
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
  
  type _To = js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = default
}
