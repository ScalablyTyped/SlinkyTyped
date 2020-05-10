package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.code
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeCellModel extends ICellModel {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: ExecutionCount = js.native
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel = js.native
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: code = js.native
}

object ICodeCellModel {
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
    outputs: IOutputAreaModel,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: code,
    value: IObservableString
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellModel]
  }
  @scala.inline
  implicit class ICodeCellModelOps[Self <: ICodeCellModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputs(value: IOutputAreaModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
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

