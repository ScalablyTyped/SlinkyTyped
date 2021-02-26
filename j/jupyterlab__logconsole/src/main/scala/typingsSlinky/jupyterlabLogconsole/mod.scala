package typingsSlinky.jupyterlabLogconsole

import typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/logconsole", "ILoggerRegistry")
  @js.native
  val ILoggerRegistry: Token[typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry] = js.native
  
  @JSImport("@jupyterlab/logconsole", "LogConsolePanel")
  @js.native
  class LogConsolePanel protected ()
    extends typingsSlinky.jupyterlabLogconsole.widgetMod.LogConsolePanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "LogOutputModel")
  @js.native
  class LogOutputModel protected ()
    extends typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
  }
  /**
    * Log Output Model namespace that defines initialization options.
    */
  object LogOutputModel
  
  @JSImport("@jupyterlab/logconsole", "Logger")
  @js.native
  class Logger protected ()
    extends typingsSlinky.jupyterlabLogconsole.loggerMod.Logger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "LoggerOutputAreaModel")
  @js.native
  class LoggerOutputAreaModel protected ()
    extends typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel {
    def this(hasMaxLengthOptions: typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "LoggerRegistry")
  @js.native
  class LoggerRegistry protected ()
    extends typingsSlinky.jupyterlabLogconsole.registryMod.LoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: typingsSlinky.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/logconsole", "ScrollingWidget")
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected ()
    extends typingsSlinky.jupyterlabLogconsole.widgetMod.ScrollingWidget[T] {
    def this(hasContentOptions: typingsSlinky.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions[T]) = this()
  }
}
