package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellModel extends IModel {
  /**
    * A signal emitted when the content of the model changes.
    */
  val contentChanged: ISignal[ICellModel, Unit] = js.native
  /**
    * A unique identifier for the cell.
    */
  val id: String = js.native
  /**
    * The metadata associated with the cell.
    */
  val metadata: IObservableJSON = js.native
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: ISignal[ICellModel, IChangedArgs[_, String]] = js.native
  /**
    * Whether the cell is trusted.
    */
  var trusted: Boolean = js.native
  /**
    * The type of the cell.
    */
  val `type`: CellType = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell = js.native
}

object ICellModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICellModel, Unit],
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: CellType,
    value: IObservableString
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellModel]
  }
  @scala.inline
  implicit class ICellModelOps[Self <: ICellModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentChanged(value: ISignal[ICellModel, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IObservableJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChanged(value: ISignal[ICellModel, IChangedArgs[_, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => ICell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CellType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

