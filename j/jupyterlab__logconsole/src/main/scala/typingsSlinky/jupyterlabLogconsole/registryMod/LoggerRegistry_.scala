package typingsSlinky.jupyterlabLogconsole.registryMod

import typingsSlinky.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/registry", "LoggerRegistry")
@js.native
class LoggerRegistry_ protected () extends ILoggerRegistry {
  /**
    * Construct a LoggerRegistry.
    *
    * @param defaultRendermime - Default rendermime to render outputs
    * with when logger is not supplied with one.
    */
  def this(options: IOptions) = this()
  var _defaultRendermime: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _loggers: js.Any = js.native
  var _maxLength: js.Any = js.native
  var _registryChanged: js.Any = js.native
  /**
    * The max length for loggers.
    */
  var maxLength: Double = js.native
}

