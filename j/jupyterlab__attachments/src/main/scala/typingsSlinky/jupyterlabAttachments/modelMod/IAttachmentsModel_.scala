package typingsSlinky.jupyterlabAttachments.modelMod

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IAttachments
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttachmentsModel_ extends IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: ISignal[IAttachmentsModel, ChangedArgs] = js.native
  /**
    * The attachment content factory used by the model.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The keys of the attachments in the model.
    */
  val keys: js.Array[String] = js.native
  /**
    * The length of the items in the model.
    */
  val length: Double = js.native
  /**
    * Remove the attachment whose name is the specified key.
    * Note that this is optional only until Jupyterlab 2.0 release.
    */
  var remove: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: ISignal[IAttachmentsModel, Unit] = js.native
  /**
    * Clear all of the attachments.
    */
  def clear(): Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: IAttachments): Unit = js.native
  /**
    * Get an item for the specified key.
    */
  def get(key: String): IAttachmentModel = js.native
  /**
    * Whether the specified key is set.
    */
  def has(key: String): Boolean = js.native
  /**
    * Set the value of the specified key.
    */
  def set(key: String, attachment: IMimeBundle): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IAttachments = js.native
}

object IAttachmentsModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentsModel, ChangedArgs],
    clear: () => Unit,
    contentFactory: IContentFactory,
    dispose: () => Unit,
    fromJSON: IAttachments => Unit,
    get: String => IAttachmentModel,
    has: String => Boolean,
    isDisposed: Boolean,
    keys: js.Array[String],
    length: Double,
    set: (String, IMimeBundle) => Unit,
    stateChanged: ISignal[IAttachmentsModel, Unit],
    toJSON: () => IAttachments
  ): IAttachmentsModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contentFactory = contentFactory.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[IAttachmentsModel_]
  }
  @scala.inline
  implicit class IAttachmentsModel_Ops[Self <: IAttachmentsModel_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: ISignal[IAttachmentsModel, ChangedArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromJSON(value: IAttachments => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => IAttachmentModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (String, IMimeBundle) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStateChanged(value: ISignal[IAttachmentsModel, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => IAttachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

