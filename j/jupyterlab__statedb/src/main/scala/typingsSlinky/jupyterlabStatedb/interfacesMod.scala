package typingsSlinky.jupyterlabStatedb

import typingsSlinky.jupyterlabStatedb.anon.Ids
import typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorable.IOptions
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait IDataConnector[T, U, V, W] extends StObject {
    
    /**
      * Retrieve an item from the data connector.
      *
      * @param id - The identifier used to retrieve an item.
      *
      * @returns A promise that bears a data payload if available.
      *
      * #### Notes
      * The promise returned by this method may be rejected if an error occurs in
      * retrieving the data. Nonexistence of an `id` resolves with `undefined`.
      */
    def fetch(id: V): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Retrieve the list of items available from the data connector.
      *
      * @param query - The optional query filter to apply to the connector request.
      *
      * @returns A promise that bears a list of `values` and an associated list of
      * fetch `ids`.
      *
      * #### Notes
      * The promise returned by this method may be rejected if an error occurs in
      * retrieving the data. The two lists will always be the same size. If there
      * is no data, this method will succeed with empty `ids` and `values`.
      */
    def list(): js.Promise[Ids[V, T]] = js.native
    def list(query: W): js.Promise[Ids[V, T]] = js.native
    
    /**
      * Remove a value using the data connector.
      *
      * @param id - The identifier for the data being removed.
      *
      * @returns A promise that is rejected if remove fails and succeeds otherwise.
      *
      * #### Notes
      * This promise may resolve with a back-end response or `undefined`.
      * Existence of resolved content in the promise is not prescribed and must be
      * tested for. For example, some back-ends may return a copy of the item of
      * type `T` being removed while others may return no content.
      */
    def remove(id: V): js.Promise[_] = js.native
    
    /**
      * Save a value using the data connector.
      *
      * @param id - The identifier for the data being saved.
      *
      * @param value - The data being saved.
      *
      * @returns A promise that is rejected if saving fails and succeeds otherwise.
      *
      * #### Notes
      * This promise may resolve with a back-end response or `undefined`.
      * Existence of resolved content in the promise is not prescribed and must be
      * tested for. For example, some back-ends may return a copy of the item of
      * type `T` being saved while others may return no content.
      */
    def save(id: V, value: U): js.Promise[_] = js.native
  }
  
  @js.native
  trait IObjectPool[T /* <: IObservableDisposable */] extends IDisposable {
    
    /**
      * A signal emitted when an object is added.
      *
      * ####
      * This signal does not emit if an object is added using `inject()`.
      */
    val added: ISignal[this.type, T] = js.native
    
    /**
      * The current object.
      */
    val current: T | Null = js.native
    
    /**
      * A signal emitted when the current object changes.
      *
      * #### Notes
      * If the last object being tracked is disposed, `null` will be emitted.
      */
    val currentChanged: ISignal[this.type, T | Null] = js.native
    
    /**
      * Filter the objects in the pool based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T] = js.native
    
    /**
      * Find the first object in the pool that satisfies a filter function.
      *
      * @param - fn The filter function to call on each object.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Iterate through each object in the pool.
      *
      * @param fn - The function to call on each object.
      */
    def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit = js.native
    
    /**
      * Check if this pool has the specified object.
      *
      * @param obj - The object whose existence is being checked.
      */
    def has(obj: T): Boolean = js.native
    
    /**
      * The number of objects held by the pool.
      */
    val size: Double = js.native
    
    /**
      * A signal emitted when an object is updated.
      */
    val updated: ISignal[this.type, T] = js.native
  }
  object IObjectPool {
    
    @scala.inline
    def apply[T /* <: IObservableDisposable */](
      added: ISignal[IObjectPool[T], T],
      currentChanged: ISignal[IObjectPool[T], T | Null],
      dispose: () => Unit,
      filter: js.Function1[/* obj */ T, Boolean] => js.Array[T],
      find: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T],
      forEach: js.Function1[/* obj */ T, Unit] => Unit,
      has: T => Boolean,
      isDisposed: Boolean,
      size: Double,
      updated: ISignal[IObjectPool[T], T]
    ): IObjectPool[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObjectPool[T]]
    }
    
    @scala.inline
    implicit class IObjectPoolMutableBuilder[Self <: IObjectPool[_], T /* <: IObservableDisposable */] (val x: Self with IObjectPool[T]) extends AnyVal {
      
      @scala.inline
      def setAdded(value: ISignal[IObjectPool[T], T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentChanged(value: ISignal[IObjectPool[T], T | Null]): Self = StObject.set(x, "currentChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNull: Self = StObject.set(x, "current", null)
      
      @scala.inline
      def setFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: ISignal[IObjectPool[T], T]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRestorable[T /* <: IObservableDisposable */, U] extends StObject {
    
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    def restore(options: IOptions[T]): js.Promise[U] = js.native
    
    /**
      * A promise that settles when the collection has been restored.
      */
    val restored: js.Promise[U] = js.native
  }
  object IRestorable {
    
    @scala.inline
    def apply[T /* <: IObservableDisposable */, U](restore: IOptions[T] => js.Promise[U], restored: js.Promise[U]): IRestorable[T, U] = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestorable[T, U]]
    }
    
    /**
      * The state restoration configuration options.
      *
      * @typeparam T - The type of object held by the restorable collection.
      */
    @js.native
    trait IOptions[T /* <: IObservableDisposable */]
      extends typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] {
      
      /**
        * The data connector to fetch restore data.
        */
      var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String] = js.native
      
      /**
        * The command registry which holds the restore command.
        */
      var registry: CommandRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: IObservableDisposable */](
        command: String,
        connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
        name: T => String,
        registry: CommandRegistry
      ): IOptions[T] = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: IObservableDisposable */] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IRestorableMutableBuilder[Self <: IRestorable[_, _], T /* <: IObservableDisposable */, U] (val x: Self with (IRestorable[T, U])) extends AnyVal {
      
      @scala.inline
      def setRestore(value: IOptions[T] => js.Promise[U]): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestored(value: js.Promise[U]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRestorer[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] extends StObject {
    
    /**
      * Restore the objects in a given restorable collection.
      *
      * @param restorable - The restorable collection being restored.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    def restore(restorable: T, options: IOptions[U]): js.Promise[V] = js.native
    
    /**
      * A promise that settles when the collection has been restored.
      */
    val restored: js.Promise[V] = js.native
  }
  object IRestorer {
    
    @scala.inline
    def apply[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V](
      restore: (T, typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[U]) => js.Promise[V],
      restored: js.Promise[V]
    ): IRestorer[T, U, V] = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestorer[T, U, V]]
    }
    
    /**
      * The state restoration configuration options.
      *
      * @typeparam T - The type of object held by the restorable collection.
      */
    @js.native
    trait IOptions[T /* <: IObservableDisposable */] extends StObject {
      
      /**
        * A function that returns the args needed to restore an instance.
        */
      var args: js.UndefOr[js.Function1[/* obj */ T, ReadonlyPartialJSONObject]] = js.native
      
      /**
        * The command to execute when restoring instances.
        */
      var command: String = js.native
      
      /**
        * A function that returns a unique persistent name for this instance.
        */
      def name(obj: T): String = js.native
      
      /**
        * The point after which it is safe to restore state.
        */
      var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: IObservableDisposable */](command: String, name: T => String): typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = js.Any.fromFunction1(name))
        __obj.asInstanceOf[typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[_], T /* <: IObservableDisposable */] (val x: Self with typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setArgs(value: /* obj */ T => ReadonlyPartialJSONObject): Self = StObject.set(x, "args", js.Any.fromFunction1(value))
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: T => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWhen(value: js.Promise[_] | js.Array[js.Promise[_]]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
        
        @scala.inline
        def setWhenVarargs(value: js.Promise[js.Any]*): Self = StObject.set(x, "when", js.Array(value :_*))
      }
    }
    
    @scala.inline
    implicit class IRestorerMutableBuilder[Self <: IRestorer[_, _, _], T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] (val x: Self with (IRestorer[T, U, V])) extends AnyVal {
      
      @scala.inline
      def setRestore(value: (T, typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[U]) => js.Promise[V]): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRestored(value: js.Promise[V]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
}
