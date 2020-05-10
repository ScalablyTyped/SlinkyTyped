package typingsSlinky.jupyterlabRendermime.attachmentmodelMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttachmentModel_ extends IMimeModel {
  /**
    * A signal emitted when the attachment model changes.
    */
  val changed: ISignal[this.type, Unit] = js.native
  /**
    * Dispose of the resources used by the attachment model.
    */
  def dispose(): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IMimeBundle = js.native
}

object IAttachmentModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentModel_, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IMimeBundle,
    trusted: Boolean
  ): IAttachmentModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachmentModel_]
  }
  @scala.inline
  implicit class IAttachmentModel_Ops[Self <: IAttachmentModel_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: ISignal[IAttachmentModel_, Unit]): Self = {
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
    def withToJSON(value: () => IMimeBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

