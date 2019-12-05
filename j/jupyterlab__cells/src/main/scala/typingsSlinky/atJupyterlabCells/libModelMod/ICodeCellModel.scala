package typingsSlinky.atJupyterlabCells.libModelMod

import typingsSlinky.atJupyterlabCells.atJupyterlabCellsStrings.code
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.ICell
import typingsSlinky.atJupyterlabObservables.libModeldbMod.IModelDB
import typingsSlinky.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typingsSlinky.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typingsSlinky.atJupyterlabObservables.libObservablestringMod.IObservableString
import typingsSlinky.atJupyterlabOutputarea.libModelMod.IOutputAreaModel
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeCellModel extends ICellModel {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: ExecutionCount
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: code
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
    value: IObservableString,
    executionCount: Int | Double = null
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellModel]
  }
}

