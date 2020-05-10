package typingsSlinky.jupyterlabLogconsole.loggerMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILogOutputModel extends IOutputModel {
  /**
    * Log level
    */
  val level: FullLogLevel = js.native
  /**
    * Date & time when output is logged.
    */
  val timestamp: js.Date = js.native
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
    `type`: String
  ): ILogOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOutputModel]
  }
  @scala.inline
  implicit class ILogOutputModelOps[Self <: ILogOutputModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: FullLogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

