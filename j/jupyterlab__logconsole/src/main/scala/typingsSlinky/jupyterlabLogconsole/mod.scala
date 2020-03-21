package typingsSlinky.jupyterlabLogconsole

import typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsSlinky.phosphorCoreutils.mod.Token
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  @js.native
  class LoggerOutputAreaModel protected ()
    extends typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel {
    def this(hasMaxLengthOptions: typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
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
  
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected ()
    extends typingsSlinky.jupyterlabLogconsole.widgetMod.ScrollingWidget[T] {
    def this(hasContentOptions: typingsSlinky.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions[T]) = this()
  }
  
  val ILoggerRegistry: Token[typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry] = js.native
  /**
    * Log Output Model namespace that defines initialization options.
    */
  @js.native
  object LogOutputModel extends js.Object
  
}

