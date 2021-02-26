package typingsSlinky.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabStatedb.interfacesMod.IDataConnector
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.cancel
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.merge
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.overwrite
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.remove
import typingsSlinky.jupyterlabStatedb.jupyterlabStatedbStrings.save
import typingsSlinky.jupyterlabStatedb.statedbMod.StateDB.Change
import typingsSlinky.jupyterlabStatedb.statedbMod.StateDB.IOptions
import typingsSlinky.jupyterlabStatedb.tokensMod.IStateDB
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statedbMod {
  
  @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB")
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  class StateDB[T /* <: ReadonlyPartialJSONValue */] () extends IStateDB[T] {
    def this(options: IOptions[T]) = this()
    
    var _changed: js.Any = js.native
    
    /**
      * Clear the entire database.
      */
    var _clear: js.Any = js.native
    
    var _connector: js.Any = js.native
    
    /**
      * Fetch a value from the database.
      */
    var _fetch: js.Any = js.native
    
    /**
      * Fetch a list from the database.
      */
    var _list: js.Any = js.native
    
    /**
      * Merge data into the state database.
      */
    var _merge: js.Any = js.native
    
    /**
      * Overwrite the entire database with new contents.
      */
    var _overwrite: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Remove a key in the database.
      */
    var _remove: js.Any = js.native
    
    /**
      * Save a key and its value in the database.
      */
    var _save: js.Any = js.native
    
    /**
      * A signal that emits the change type any time a value changes.
      */
    def changed: ISignal[this.type, Change] = js.native
    
    /**
      * Clear the entire database.
      */
    def clear(): js.Promise[Unit] = js.native
  }
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB.Connector")
    @js.native
    class Connector () extends IDataConnector[String, String, String, String] {
      
      var _storage: js.Any = js.native
    }
    
    /**
      * A state database change.
      */
    @js.native
    trait Change extends StObject {
      
      /**
        * The key of the database item that was changed.
        *
        * #### Notes
        * This field is set to `null` for global changes (i.e. `clear`).
        */
      var id: String | Null = js.native
      
      /**
        * The type of change.
        */
      var `type`: clear | remove | save = js.native
    }
    object Change {
      
      @scala.inline
      def apply(`type`: clear | remove | save): Change = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Change]
      }
      
      @scala.inline
      implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdNull: Self = StObject.set(x, "id", null)
        
        @scala.inline
        def setType(value: clear | remove | save): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Database content map
      */
    type Content[T] = StringDictionary[js.UndefOr[T]]
    
    /**
      * A data transformation that can be applied to a state database.
      */
    @js.native
    trait DataTransform[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * The contents of the change operation.
        */
      var contents: Content[T] | Null = js.native
      
      var `type`: cancel | clear | merge | overwrite = js.native
    }
    object DataTransform {
      
      @scala.inline
      def apply[T /* <: ReadonlyPartialJSONValue */](`type`: cancel | clear | merge | overwrite): DataTransform[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataTransform[T]]
      }
      
      @scala.inline
      implicit class DataTransformMutableBuilder[Self <: DataTransform[_], T /* <: ReadonlyPartialJSONValue */] (val x: Self with DataTransform[T]) extends AnyVal {
        
        @scala.inline
        def setContents(value: Content[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentsNull: Self = StObject.set(x, "contents", null)
        
        @scala.inline
        def setType(value: cancel | clear | merge | overwrite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for a state database.
      */
    @js.native
    trait IOptions[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * Optional string key/value connector. Defaults to in-memory connector.
        */
      var connector: js.UndefOr[IDataConnector[String, String, String, String]] = js.native
      
      /**
        * An optional promise that resolves with a data transformation that is
        * applied to the database contents before the database begins resolving
        * client requests.
        */
      var transform: js.UndefOr[js.Promise[DataTransform[T]]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: ReadonlyPartialJSONValue */](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: ReadonlyPartialJSONValue */] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[String, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
        
        @scala.inline
        def setTransform(value: js.Promise[DataTransform[T]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
  }
}
