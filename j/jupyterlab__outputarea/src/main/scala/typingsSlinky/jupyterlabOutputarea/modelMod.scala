package typingsSlinky.jupyterlabOutputarea

import typingsSlinky.jupyterlabNbformat.mod.IOutput
import typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList
import typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typingsSlinky.jupyterlabOutputarea.anon.LastModel
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IContentFactory
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class OutputAreaModel () extends IOutputAreaModel {
    def this(options: IOptions) = this()
    
    /**
      * Add a copy of the item to the list.
      */
    var _add: js.Any = js.native
    
    var _changed: js.Any = js.native
    
    /**
      * Create an output item and hook up its signals.
      */
    var _createItem: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _lastName: js.Any = js.native
    
    var _lastStream: js.Any = js.native
    
    /**
      * Handle a change to an item.
      */
    var _onGenericChange: js.Any = js.native
    
    /**
      * Handle a change to the list.
      */
    var _onListChanged: js.Any = js.native
    
    var _stateChanged: js.Any = js.native
    
    var _trusted: js.Any = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    @JSName("changed")
    def changed_MOutputAreaModel: ISignal[this.type, ChangedArgs] = js.native
    
    /**
      * A flag that is set when we want to clear the output area
      * *after* the next addition to it.
      */
    var clearNext: Boolean = js.native
    
    /**
      * Test whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MOutputAreaModel: Boolean = js.native
    
    /**
      * Get the length of the items in the model.
      */
    @JSName("length")
    def length_MOutputAreaModel: Double = js.native
    
    /**
      * An observable list containing the output models
      * for this output area.
      */
    var list: IObservableList[IOutputModel] = js.native
    
    /**
      * Whether a new value should be consolidated with the previous output.
      *
      * This will only be called if the minimal criteria of both being stream
      * messages of the same type.
      */
    /* protected */ def shouldCombine(options: LastModel): Boolean = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MOutputAreaModel: ISignal[IOutputAreaModel, Unit] = js.native
    
    /**
      * Get whether the model is trusted.
      */
    @JSName("trusted")
    def trusted_MOutputAreaModel: Boolean = js.native
  }
  object OutputAreaModel {
    
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel.ContentFactory")
    @js.native
    class ContentFactory () extends IContentFactory
    
    /**
      * The default output model factory.
      */
    @JSImport("@jupyterlab/outputarea/lib/model", "OutputAreaModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
  }
  
  @js.native
  trait IOutputAreaModel extends IDisposable {
    
    /**
      * Add an output, which may be combined with previous output.
      *
      * @returns The total number of outputs.
      *
      * #### Notes
      * The output bundle is copied.
      * Contiguous stream outputs of the same `name` are combined.
      */
    def add(output: IOutput): Double = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    val changed: ISignal[IOutputAreaModel, ChangedArgs] = js.native
    
    /**
      * Clear all of the output.
      *
      * @param wait - Delay clearing the output until the next message is added.
      */
    def clear(): Unit = js.native
    def clear(wait: Boolean): Unit = js.native
    
    /**
      * The output content factory used by the model.
      */
    val contentFactory: IContentFactory = js.native
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * This will clear any existing data.
      */
    def fromJSON(values: js.Array[IOutput]): Unit = js.native
    
    /**
      * Get an item at the specified index.
      */
    def get(index: Double): IOutputModel = js.native
    
    /**
      * The length of the items in the model.
      */
    val length: Double = js.native
    
    /**
      * Set the value at the specified index.
      */
    def set(index: Double, output: IOutput): Unit = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    val stateChanged: ISignal[IOutputAreaModel, Unit] = js.native
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): js.Array[IOutput] = js.native
    
    /**
      * Whether the output area is trusted.
      */
    var trusted: Boolean = js.native
  }
  object IOutputAreaModel {
    
    /**
      * A type alias for changed args.
      */
    type ChangedArgs = IChangedArgs[IOutputModel]
    
    /**
      * The interface for an output content factory.
      */
    @js.native
    trait IContentFactory extends StObject {
      
      /**
        * Create an output model.
        */
      def createOutputModel(options: typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions): IOutputModel = js.native
    }
    object IContentFactory {
      
      @scala.inline
      def apply(
        createOutputModel: typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      @scala.inline
      implicit class IContentFactoryMutableBuilder[Self <: IContentFactory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateOutputModel(value: typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions => IOutputModel): Self = StObject.set(x, "createOutputModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to create a output area model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The output content factory used by the model.
        *
        * If not given, a default factory will be used.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.native
      
      /**
        * Whether the output is trusted.  The default is false.
        */
      var trusted: js.UndefOr[Boolean] = js.native
      
      /**
        * The initial values for the model.
        */
      var values: js.UndefOr[js.Array[IOutput]] = js.native
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
        def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[IOutput]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: IOutput*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
  }
}
