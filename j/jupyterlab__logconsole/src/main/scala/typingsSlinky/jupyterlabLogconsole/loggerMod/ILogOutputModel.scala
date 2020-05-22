package typingsSlinky.jupyterlabLogconsole.loggerMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogOutputModel extends IOutputModel {
  /**
    * Log level
    */
  val level: FullLogLevel
  /**
    * Date & time when output is logged.
    */
  val timestamp: js.Date
}

object ILogOutputModel {
  @scala.inline
  def apply(
    changed: ISignal[ILogOutputModel, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    level: FullLogLevel,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    timestamp: js.Date,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String,
    executionCount: ExecutionCount = null.asInstanceOf[ExecutionCount]
  ): ILogOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], executionCount = executionCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOutputModel]
  }
}

