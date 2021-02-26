package typingsSlinky.jupyterlabNotebook

import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel
import typingsSlinky.jupyterlabCells.modelMod.IMarkdownCellModel
import typingsSlinky.jupyterlabCells.modelMod.IRawCellModel
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabDocregistry.mod.DocumentModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabNbformat.mod.CellType
import typingsSlinky.jupyterlabNbformat.mod.INotebookContent
import typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.IOptions
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONValue
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel because Already inherited
  - typingsSlinky.jupyterlabNotebook.modelMod.INotebookModel because var conflicts: contentChanged, dirty, readOnly, stateChanged. Inlined cells, contentFactory, nbformat, nbformatMinor, metadata, deletedCells */ @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel")
  @js.native
  /**
    * Construct a new notebook model.
    */
  class NotebookModel () extends DocumentModel {
    def this(options: IOptions) = this()
    
    var _cells: js.Any = js.native
    
    var _deletedCells: js.Any = js.native
    
    /**
      * Make sure we have the required metadata fields.
      */
    var _ensureMetadata: js.Any = js.native
    
    var _nbformat: js.Any = js.native
    
    var _nbformatMinor: js.Any = js.native
    
    /**
      * Handle a change in the cells list.
      */
    var _onCellsChanged: js.Any = js.native
    
    /**
      * Get the observable list of notebook cells.
      */
    def cells: IObservableUndoableList[ICellModel] = js.native
    /**
      * The list of cells in the notebook.
      */
    @JSName("cells")
    val cells_FNotebookModel: IObservableUndoableList[ICellModel] = js.native
    
    /**
      * The cell model factory for the notebook.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * The default kernel language of the document.
      */
    @JSName("defaultKernelLanguage")
    def defaultKernelLanguage_MNotebookModel: String = js.native
    
    /**
      * The default kernel name of the document.
      */
    @JSName("defaultKernelName")
    def defaultKernelName_MNotebookModel: String = js.native
    
    /**
      * A list of deleted cells for the notebook..
      */
    def deletedCells: js.Array[String] = js.native
    /**
      * The array of deleted cells since the notebook was last run.
      */
    @JSName("deletedCells")
    val deletedCells_FNotebookModel: js.Array[String] = js.native
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * Should emit a [contentChanged] signal.
      */
    def fromJSON(value: INotebookContent): Unit = js.native
    
    /**
      * The metadata associated with the notebook.
      */
    def metadata: IObservableJSON = js.native
    /**
      * The metadata associated with the notebook.
      */
    @JSName("metadata")
    val metadata_FNotebookModel: IObservableJSON = js.native
    
    /**
      * The major version number of the nbformat.
      */
    def nbformat: Double = js.native
    
    /**
      * The minor version number of the nbformat.
      */
    def nbformatMinor: Double = js.native
    /**
      * The minor version number of the nbformat.
      */
    @JSName("nbformatMinor")
    val nbformatMinor_FNotebookModel: Double = js.native
    
    /**
      * The major version number of the nbformat.
      */
    @JSName("nbformat")
    val nbformat_FNotebookModel: Double = js.native
  }
  object NotebookModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel.ContentFactory")
    @js.native
    class ContentFactory protected () extends StObject {
      /**
        * Create a new cell model factory.
        */
      def this(options: typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions) = this()
      
      /**
        * Clone the content factory with a new IModelDB.
        */
      def clone(modelDB: IModelDB): ContentFactory = js.native
      
      /**
        * The factory for code cell content.
        */
      val codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
      
      /**
        * Create a new cell by cell type.
        *
        * @param type:  the type of the cell to create.
        *
        * @param options: the cell creation options.
        *
        * #### Notes
        * This method is intended to be a convenience method to programmaticaly
        * call the other cell creation methods in the factory.
        */
      def createCell(`type`: CellType, opts: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel = js.native
      
      /**
        * Create a new code cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new code cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        *   If the contentFactory is not provided, the instance
        *   `codeCellContentFactory` will be used.
        */
      def createCodeCell(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
      
      /**
        * Create a new markdown cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new markdown cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createMarkdownCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel = js.native
      
      /**
        * Create a new raw cell.
        *
        * @param source - The data to use for the original source data.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
      
      /**
        * The IModelDB in which to put the notebook data.
        */
      val modelDB: js.UndefOr[IModelDB] = js.native
    }
    /**
      * A namespace for the notebook model content factory.
      */
    object ContentFactory {
      
      /**
        * The options used to initialize a `ContentFactory`.
        */
      @js.native
      trait IOptions extends StObject {
        
        /**
          * The factory for code cell model content.
          */
        var codeCellContentFactory: js.UndefOr[typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.native
        
        /**
          * The modelDB in which to place new content.
          */
        var modelDB: js.UndefOr[IModelDB] = js.native
      }
      object IOptions {
        
        @scala.inline
        def apply(): typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions]
        }
        
        @scala.inline
        implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCodeCellContentFactory(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCodeCellContentFactoryUndefined: Self = StObject.set(x, "codeCellContentFactory", js.undefined)
          
          @scala.inline
          def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
        }
      }
    }
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
    
    /**
      * A factory for creating notebook model content.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Clone the content factory with a new IModelDB.
        */
      def clone(modelDB: IModelDB): IContentFactory = js.native
      
      /**
        * The factory for output area models.
        */
      val codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
      
      /**
        * Create a new cell by cell type.
        *
        * @param type:  the type of the cell to create.
        *
        * @param options: the cell creation options.
        *
        * #### Notes
        * This method is intended to be a convenience method to programmaticaly
        * call the other cell creation methods in the factory.
        */
      def createCell(`type`: CellType, opts: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel = js.native
      
      /**
        * Create a new code cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new code cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createCodeCell(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
      
      /**
        * Create a new markdown cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new markdown cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createMarkdownCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel = js.native
      
      /**
        * Create a new raw cell.
        *
        * @param options - The options used to create the cell.
        *
        * @returns A new raw cell. If a source cell is provided, the
        *   new cell will be initialized with the data from the source.
        */
      def createRawCell(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
      
      /**
        * The IModelDB in which to put data for the notebook model.
        */
      var modelDB: js.UndefOr[IModelDB] = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        clone_ : IModelDB => IContentFactory,
        codeCellContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
        createCell: (CellType, typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel,
        createCodeCell: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
        createMarkdownCell: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel,
        createRawCell: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCell = js.Any.fromFunction2(createCell), createCodeCell = js.Any.fromFunction1(createCodeCell), createMarkdownCell = js.Any.fromFunction1(createMarkdownCell), createRawCell = js.Any.fromFunction1(createRawCell))
        __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClone_(value: IModelDB => IContentFactory): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCodeCellContentFactory(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = StObject.set(x, "codeCellContentFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateCell(value: (CellType, typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) => ICellModel): Self = StObject.set(x, "createCell", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateCodeCell(value: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateMarkdownCell(value: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IMarkdownCellModel): Self = StObject.set(x, "createMarkdownCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateRawCell(value: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel): Self = StObject.set(x, "createRawCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
      }
    }
    
    /**
      * An options object for initializing a notebook model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A factory for creating cell models.
        *
        * The default is a shared factory instance.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
      
      /**
        * The language preference for the model.
        */
      var languagePreference: js.UndefOr[String] = js.native
      
      /**
        * A modelDB for storing notebook data.
        */
      var modelDB: js.UndefOr[IModelDB] = js.native
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
        
        @scala.inline
        def setLanguagePreference(value: String): Self = StObject.set(x, "languagePreference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguagePreferenceUndefined: Self = StObject.set(x, "languagePreference", js.undefined)
        
        @scala.inline
        def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
      }
    }
  }
  
  @js.native
  trait INotebookModel extends IModel {
    
    /**
      * The list of cells in the notebook.
      */
    val cells: IObservableUndoableList[ICellModel] = js.native
    
    /**
      * The cell model factory for the notebook.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * The array of deleted cells since the notebook was last run.
      */
    val deletedCells: js.Array[String] = js.native
    
    /**
      * The metadata associated with the notebook.
      */
    val metadata: IObservableJSON = js.native
    
    /**
      * The major version number of the nbformat.
      */
    val nbformat: Double = js.native
    
    /**
      * The minor version number of the nbformat.
      */
    val nbformatMinor: Double = js.native
  }
  object INotebookModel {
    
    @scala.inline
    def apply(
      cells: IObservableUndoableList[ICellModel],
      contentChanged: ISignal[INotebookModel, Unit],
      contentFactory: IContentFactory,
      defaultKernelLanguage: String,
      defaultKernelName: String,
      deletedCells: js.Array[String],
      dirty: Boolean,
      dispose: () => Unit,
      fromJSON: ReadonlyPartialJSONValue => Unit,
      fromString: String => Unit,
      initialize: () => Unit,
      isDisposed: Boolean,
      metadata: IObservableJSON,
      modelDB: IModelDB,
      nbformat: Double,
      nbformatMinor: Double,
      readOnly: Boolean,
      stateChanged: ISignal[INotebookModel, IChangedArgs[_, _, String]],
      toJSON: () => PartialJSONValue
    ): INotebookModel = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], contentFactory = contentFactory.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], deletedCells = deletedCells.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformatMinor = nbformatMinor.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[INotebookModel]
    }
    
    @scala.inline
    implicit class INotebookModelMutableBuilder[Self <: INotebookModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCells(value: IObservableUndoableList[ICellModel]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedCells(value: js.Array[String]): Self = StObject.set(x, "deletedCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedCellsVarargs(value: String*): Self = StObject.set(x, "deletedCells", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: IObservableJSON): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNbformatMinor(value: Double): Self = StObject.set(x, "nbformatMinor", value.asInstanceOf[js.Any])
    }
  }
}
