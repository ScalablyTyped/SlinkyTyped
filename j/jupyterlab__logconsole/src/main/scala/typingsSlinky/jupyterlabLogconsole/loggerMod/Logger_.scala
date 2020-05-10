package typingsSlinky.jupyterlabLogconsole.loggerMod

import typingsSlinky.jupyterlabLogconsole.loggerMod.Logger.IOptions
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILogger
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/logger", "Logger")
@js.native
class Logger_ protected () extends ILogger {
  /**
    * Construct a Logger.
    *
    * @param source - The name of the log source.
    */
  def this(options: IOptions) = this()
  var _contentChanged: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _level: js.Any = js.native
  var _log: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _stateChanged: js.Any = js.native
  var _version: js.Any = js.native
  /**
    * The output area model used for the logger.
    *
    * #### Notes
    * This will usually not be accessed directly. It is a public attribute so
    * that the renderer can access it.
    */
  @JSName("outputAreaModel")
  val outputAreaModel_Logger_ : LoggerOutputAreaModel = js.native
  /**
    * Rendermime to use when rendering outputs logged.
    */
  @JSName("rendermime")
  var rendermime_Logger_ : IRenderMimeRegistry | Null = js.native
}

