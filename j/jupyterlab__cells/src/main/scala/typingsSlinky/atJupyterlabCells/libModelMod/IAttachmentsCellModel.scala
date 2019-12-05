package typingsSlinky.atJupyterlabCells.libModelMod

import typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typingsSlinky.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.ICell
import typingsSlinky.atJupyterlabObservables.libModeldbMod.IModelDB
import typingsSlinky.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typingsSlinky.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typingsSlinky.atJupyterlabObservables.libObservablestringMod.IObservableString
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentsCellModel extends ICellModel {
  /**
    * The cell attachments
    */
  val attachments: IAttachmentsModel
}

object IAttachmentsCellModel {
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
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
  ): IAttachmentsCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachmentsCellModel]
  }
}

