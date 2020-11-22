package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONValue
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a document model that represents code.
  */
@js.native
trait ICodeModel
  extends IModel
     with typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel {
  
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB = js.native
}
object ICodeModel {
  
  @scala.inline
  def apply(
    contentChanged: ISignal[ICodeModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: ReadonlyPartialJSONValue => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[
      typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel, 
      typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
    ],
    modelDB: IModelDB,
    readOnly: Boolean,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[
      ICodeModel, 
      typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
    ],
    toJSON: () => PartialJSONValue,
    value: IObservableString
  ): ICodeModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeModel]
  }
  
  @scala.inline
  implicit class ICodeModelOps[Self <: ICodeModel] (val x: Self) extends AnyVal {
    
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
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
  }
}
