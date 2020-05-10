package typingsSlinky.jupyterlabLogconsole.tokensMod

import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogger extends IDisposable {
  /**
    * A signal emitted when the log model changes.
    */
  val contentChanged: ISignal[this.type, IContentChange] = js.native
  /**
    * Number of outputs logged.
    */
  val length: Double = js.native
  /**
    * Log level.
    */
  var level: LogLevel = js.native
  /**
    * Max number of messages.
    */
  var maxLength: Double = js.native
  /**
    * Output Area Model used to manage log storage in memory.
    */
  val outputAreaModel: ILoggerOutputAreaModel = js.native
  /**
    * Rendermime to use when rendering outputs logged.
    */
  var rendermime: IRenderMimeRegistry = js.native
  /**
    * The name of the log source.
    */
  val source: String = js.native
  /**
    * A signal emitted when the rendermime changes.
    */
  val stateChanged: ISignal[this.type, IStateChange] = js.native
  /**
    * The cumulative number of messages the log has stored.
    */
  val version: Double = js.native
  /**
    * Add a checkpoint in the log.
    */
  def checkpoint(): Unit = js.native
  /**
    * Clear all outputs logged.
    */
  def clear(): Unit = js.native
  /**
    * Log an output to logger.
    *
    * @param log - The output to be logged.
    */
  def log(log: ILogPayload): Unit = js.native
}

object ILogger {
  @scala.inline
  def apply(
    checkpoint: () => Unit,
    clear: () => Unit,
    contentChanged: ISignal[ILogger, IContentChange],
    dispose: () => Unit,
    isDisposed: Boolean,
    length: Double,
    level: LogLevel,
    log: ILogPayload => Unit,
    maxLength: Double,
    outputAreaModel: ILoggerOutputAreaModel,
    rendermime: IRenderMimeRegistry,
    source: String,
    stateChanged: ISignal[ILogger, IStateChange],
    version: Double
  ): ILogger = {
    val __obj = js.Dynamic.literal(checkpoint = js.Any.fromFunction0(checkpoint), clear = js.Any.fromFunction0(clear), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), maxLength = maxLength.asInstanceOf[js.Any], outputAreaModel = outputAreaModel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogger]
  }
  @scala.inline
  implicit class ILoggerOps[Self <: ILogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckpoint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentChanged(value: ISignal[ILogger, IContentChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: ILogPayload => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputAreaModel(value: ILoggerOutputAreaModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAreaModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChanged(value: ISignal[ILogger, IStateChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

