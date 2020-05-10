package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to manage selections by selection owners.
  *
  * #### Definitions
  * - a user code that has an associated uuid is called a selection owner, see `CodeEditor.ISelectionOwner`
  * - a selection belongs to a selection owner only if it is associated with the owner by an uuid, see `CodeEditor.ITextSelection`
  *
  * #### Read access
  * - any user code can observe any selection
  *
  * #### Write access
  * - if a user code is a selection owner then:
  *   - it can change selections belonging to it
  *   - but it must not change selections belonging to other selection owners
  * - otherwise it must not change any selection
  */
/**
  * An editor model.
  */
@js.native
trait IModel extends IDisposable {
  /**
    * A mime type of the model.
    *
    * #### Notes
    * It is never `null`, the default mime type is `text/plain`.
    */
  var mimeType: String = js.native
  /**
    * A signal emitted when a property changes.
    */
  var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]] = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  val modelDB: IModelDB = js.native
  /**
    * The currently selected code.
    */
  val selections: IObservableMap[js.Array[ITextSelection]] = js.native
  /**
    * The text stored in the model.
    */
  val value: IObservableString = js.native
}

object IModel {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    value: IObservableString
  ): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypeChanged(value: ISignal[IModel, IChangedArgs[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelDB(value: IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelections(value: IObservableMap[js.Array[ITextSelection]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: IObservableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

