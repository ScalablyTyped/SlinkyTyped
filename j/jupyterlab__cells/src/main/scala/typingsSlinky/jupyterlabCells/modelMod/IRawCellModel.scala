package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.raw
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabNbformat.mod.ICell
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRawCellModel extends IAttachmentsCellModel {
  
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_IRawCellModel: raw = js.native
}
object IRawCellModel {
  
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
    contentChanged: ISignal[ICellModel, Unit],
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, _, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: raw,
    value: IObservableString
  ): IRawCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCellModel]
  }
  
  @scala.inline
  implicit class IRawCellModelOps[Self <: IRawCellModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: raw): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
