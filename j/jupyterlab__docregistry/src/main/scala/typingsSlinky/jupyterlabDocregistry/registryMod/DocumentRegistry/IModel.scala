package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a document model.
  */
@js.native
trait IModel extends IDisposable {
  /**
    * A signal emitted when the document content changes.
    */
  var contentChanged: ISignal[this.type, Unit] = js.native
  /**
    * The default kernel language of the document.
    */
  val defaultKernelLanguage: String = js.native
  /**
    * The default kernel name of the document.
    */
  val defaultKernelName: String = js.native
  /**
    * The dirty state of the model.
    *
    * #### Notes
    * This should be cleared when the document is loaded from
    * or saved to disk.
    */
  var dirty: Boolean = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  val modelDB: IModelDB = js.native
  /**
    * The read-only state of the model.
    */
  var readOnly: Boolean = js.native
  /**
    * A signal emitted when the model state changes.
    */
  var stateChanged: ISignal[this.type, typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, String]] = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: js.Any): Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: String): Unit = js.native
  /**
    * Initialize model state after initial data load.
    *
    * #### Notes
    * This function must be called after the initial data is loaded to set up
    * initial model state, such as an initial undo stack, etc.
    */
  def initialize(): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONValue = js.native
}

object IModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[IModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: js.Any => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    modelDB: IModelDB,
    readOnly: Boolean,
    stateChanged: ISignal[IModel, typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, String]],
    toJSON: () => JSONValue
  ): IModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentChanged(value: ISignal[IModel, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultKernelLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKernelLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultKernelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKernelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromJSON(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModelDB(value: IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChanged(value: ISignal[IModel, typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => JSONValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

