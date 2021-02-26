package typingsSlinky.jupyterlabCells

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.code
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.markdown
import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.raw
import typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabCodeeditor.mod.CodeEditor.Model
import typingsSlinky.jupyterlabNbformat.mod.CellType
import typingsSlinky.jupyterlabNbformat.mod.ExecutionCount
import typingsSlinky.jupyterlabNbformat.mod.IBaseCell
import typingsSlinky.jupyterlabNbformat.mod.ICell
import typingsSlinky.jupyterlabObservables.mod.ObservableValue.IChangedArgs
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.modeldbMod.IObservableValue
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoSignaling.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel")
  @js.native
  class AttachmentsCellModel protected () extends CellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
    
    var _attachments: js.Any = js.native
    
    /**
      * Get the attachments of the model.
      */
    def attachments: IAttachmentsModel = js.native
  }
  object AttachmentsCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel.ContentFactory")
    @js.native
    class ContentFactory () extends IContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells/lib/model", "AttachmentsCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * A factory for creating code cell model content.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Create an output area.
        */
      def createAttachmentsModel(options: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions): IAttachmentsModel = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createAttachmentsModel: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createAttachmentsModel = js.Any.fromFunction1(createAttachmentsModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateAttachmentsModel(
          value: typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions => IAttachmentsModel
        ): Self = StObject.set(x, "createAttachmentsModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `AttachmentsCellModel`.
      */
    @js.native
    trait IOptions
      extends typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions {
      
      /**
        * The factory for attachment model creation.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
  - typingsSlinky.jupyterlabCells.modelMod.ICellModel because var conflicts: mimeType, mimeTypeChanged. Inlined `type`, id, contentChanged, stateChanged, trusted, metadata, toJSON */ @JSImport("@jupyterlab/cells/lib/model", "CellModel")
  @js.native
  class CellModel protected () extends Model {
    /**
      * Construct a cell model from optional cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) = this()
    
    /**
      * A signal emitted when the state of the model changes.
      */
    val contentChanged: (ISignal[ICellModel, Unit]) | (Signal[this.type, Unit]) = js.native
    
    /**
      * The id for the cell.
      */
    val id: String = js.native
    
    /**
      * The metadata associated with the cell.
      */
    def metadata: IObservableJSON = js.native
    /**
      * The metadata associated with the cell.
      */
    @JSName("metadata")
    val metadata_FCellModel: IObservableJSON = js.native
    
    /**
      * Handle a change to the observable value.
      */
    /* protected */ def onGenericChange(): Unit = js.native
    
    /**
      * Handle a change to the trusted state.
      *
      * The default implementation is a no-op.
      */
    def onTrustedChanged(trusted: IObservableValue, args: IChangedArgs): Unit = js.native
    
    /**
      * A signal emitted when a model state changes.
      */
    val stateChanged: (ISignal[
        ICellModel, 
        typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
      ]) | (Signal[
        this.type, 
        typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
      ]) = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): ICell = js.native
    
    /**
      * Get the trusted state of the model.
      */
    def trusted: Boolean = js.native
    /**
      * Set the trusted state of the model.
      */
    def trusted_=(newValue: Boolean): Unit = js.native
    /**
      * Whether the cell is trusted.
      */
    @JSName("trusted")
    var trusted_FCellModel: Boolean = js.native
    
    /**
      * The type of cell.
      */
    val `type`: CellType = js.native
  }
  object CellModel {
    
    /**
      * The options used to initialize a `CellModel`.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The source cell data.
        */
      var cell: js.UndefOr[IBaseCell] = js.native
      
      /**
        * A unique identifier for this cell.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * An IModelDB in which to store cell data.
        */
      var modelDB: js.UndefOr[IModelDB] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCell(value: IBaseCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
  - typingsSlinky.jupyterlabCells.modelMod.ICellModel because Already inherited
  - typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel because var conflicts: metadata, mimeType, mimeTypeChanged, trusted. Inlined executionCount, outputs, clearExecution */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
  @js.native
  class CodeCellModel protected () extends CellModel {
    /**
      * Construct a new code cell with optional original cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions) = this()
    
    /**
      * Handle a change to the execution count.
      */
    var _onExecutionCountChanged: js.Any = js.native
    
    var _outputs: js.Any = js.native
    
    /**
      * Clear execution, outputs, and related metadata
      */
    def clearExecution(): Unit = js.native
    
    /**
      * The execution count of the cell.
      */
    def executionCount: ExecutionCount = js.native
    def executionCount_=(newValue: ExecutionCount): Unit = js.native
    /**
      * The code cell's prompt number. Will be null if the cell has not been run.
      */
    @JSName("executionCount")
    var executionCount_FCodeCellModel: ExecutionCount = js.native
    
    /**
      * The cell outputs.
      */
    def outputs: IOutputAreaModel = js.native
    /**
      * The cell outputs.
      */
    @JSName("outputs")
    val outputs_FCodeCellModel: IOutputAreaModel = js.native
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MCodeCellModel: code = js.native
  }
  object CodeCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.ContentFactory")
    @js.native
    class ContentFactory () extends IContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * A factory for creating code cell model content.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Create an output area.
        */
      def createOutputArea(options: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions): IOutputAreaModel = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createOutputArea: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputArea = js.Any.fromFunction1(createOutputArea))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateOutputArea(value: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions => IOutputAreaModel): Self = StObject.set(x, "createOutputArea", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to initialize a `CodeCellModel`.
      */
    @js.native
    trait IOptions
      extends typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions {
      
      /**
        * The factory for output area model creation.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
  @js.native
  class MarkdownCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a markdown cell model from optional cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) = this()
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MMarkdownCellModel: markdown = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "RawCellModel")
  @js.native
  class RawCellModel protected () extends AttachmentsCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: IOptions) = this()
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    def type_MRawCellModel: raw = js.native
  }
  
  @JSImport("@jupyterlab/cells/lib/model", "isCodeCellModel")
  @js.native
  def isCodeCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean = js.native
  
  @JSImport("@jupyterlab/cells/lib/model", "isMarkdownCellModel")
  @js.native
  def isMarkdownCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean = js.native
  
  @JSImport("@jupyterlab/cells/lib/model", "isRawCellModel")
  @js.native
  def isRawCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean = js.native
  
  @js.native
  trait IAttachmentsCellModel extends ICellModel {
    
    /**
      * The cell attachments
      */
    val attachments: IAttachmentsModel = js.native
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
      mimeTypeChanged: ISignal[
          IModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: CellType,
      value: IObservableString
    ): IAttachmentsCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachmentsCellModel]
    }
    
    @scala.inline
    implicit class IAttachmentsCellModelMutableBuilder[Self <: IAttachmentsCellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: IAttachmentsModel): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    }
  }
  
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
    val stateChanged: ISignal[
        ICellModel, 
        typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
      ] = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): ICell = js.native
    
    /**
      * Whether the cell is trusted.
      */
    var trusted: Boolean = js.native
    
    /**
      * The type of the cell.
      */
    val `type`: CellType = js.native
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
      mimeTypeChanged: ISignal[
          IModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
        ],
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
    implicit class ICellModelMutableBuilder[Self <: ICellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentChanged(value: ISignal[ICellModel, Unit]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IObservableJSON): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateChanged(
        value: ISignal[
              ICellModel, 
              typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
            ]
      ): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => ICell): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICodeCellModel extends ICellModel {
    
    /**
      * Clear execution, outputs, and related metadata
      */
    def clearExecution(): Unit = js.native
    
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
      clearExecution: () => Unit,
      contentChanged: ISignal[ICellModel, Unit],
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      outputs: IOutputAreaModel,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: code,
      value: IObservableString
    ): ICodeCellModel = {
      val __obj = js.Dynamic.literal(clearExecution = js.Any.fromFunction0(clearExecution), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICodeCellModel]
    }
    
    @scala.inline
    implicit class ICodeCellModelMutableBuilder[Self <: ICodeCellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearExecution(value: () => Unit): Self = StObject.set(x, "clearExecution", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecutionCount(value: ExecutionCount): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
      
      @scala.inline
      def setOutputs(value: IOutputAreaModel): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMarkdownCellModel extends IAttachmentsCellModel {
    
    /**
      * The type of the cell.
      */
    @JSName("type")
    val type_IMarkdownCellModel: markdown = js.native
  }
  object IMarkdownCellModel {
    
    @scala.inline
    def apply(
      attachments: IAttachmentsModel,
      contentChanged: ISignal[ICellModel, Unit],
      dispose: () => Unit,
      id: String,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      mimeType: String,
      mimeTypeChanged: ISignal[
          IModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
        ],
      toJSON: () => ICell,
      trusted: Boolean,
      `type`: markdown,
      value: IObservableString
    ): IMarkdownCellModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarkdownCellModel]
    }
    
    @scala.inline
    implicit class IMarkdownCellModelMutableBuilder[Self <: IMarkdownCellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: markdown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
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
      mimeTypeChanged: ISignal[
          IModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
        ],
      modelDB: IModelDB,
      selections: IObservableMap[js.Array[ITextSelection]],
      stateChanged: ISignal[
          ICellModel, 
          typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]
        ],
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
    implicit class IRawCellModelMutableBuilder[Self <: IRawCellModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
