package typingsSlinky.jupyterlabRendermime.outputmodelMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputModel_ extends IMimeModel {
  /**
    * A signal emitted when the output model changes.
    */
  val changed: ISignal[this.type, Unit] = js.native
  /**
    * The execution count of the model.
    */
  val executionCount: ExecutionCount = js.native
  /**
    * The output type.
    */
  val `type`: String = js.native
  /**
    * Dispose of the resources used by the output model.
    */
  def dispose(): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IOutput = js.native
}

object IOutputModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IOutputModel_, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String
  ): IOutputModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputModel_]
  }
  @scala.inline
  implicit class IOutputModel_Ops[Self <: IOutputModel_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: ISignal[IOutputModel_, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => IOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionCount(value: ExecutionCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCount")(null)
        ret
    }
  }
  
}

