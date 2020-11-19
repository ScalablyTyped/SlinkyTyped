package typingsSlinky.jupyterlabStatedb.restorablepoolMod

import typingsSlinky.jupyterlabStatedb.interfacesMod.IObjectPool
import typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorable
import typingsSlinky.jupyterlabStatedb.restorablepoolMod.RestorablePool.IOptions
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statedb/lib/restorablepool", "RestorablePool")
@js.native
class RestorablePool_[T /* <: IObservableDisposable */] protected ()
  extends IObjectPool[T]
     with IRestorable[T, js.Any] {
  /**
    * Create a new restorable pool.
    *
    * @param options - The instantiation options for a restorable pool.
    */
  def this(options: IOptions) = this()
  
  var _added: js.Any = js.native
  
  var _current: js.Any = js.native
  
  var _currentChanged: js.Any = js.native
  
  var _hasRestored: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _objects: js.Any = js.native
  
  /**
    * Clean up after disposed objects.
    */
  var _onInstanceDisposed: js.Any = js.native
  
  var _restore: js.Any = js.native
  
  var _restored: js.Any = js.native
  
  var _updated: js.Any = js.native
  
  /**
    * Add a new object to the pool.
    *
    * @param obj - The object object being added.
    *
    * #### Notes
    * The object passed into the pool is added synchronously; its existence in
    * the pool can be checked with the `has()` method. The promise this method
    * returns resolves after the object has been added and saved to an underlying
    * restoration connector, if one is available.
    */
  def add(obj: T): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when an object object is added.
    *
    * #### Notes
    * This signal will only fire when an object is added to the pool.
    * It will not fire if an object injected into the pool.
    */
  @JSName("added")
  def added_MRestorablePool_ : ISignal[this.type, T] = js.native
  
  /**
    * A signal emitted when the current widget changes.
    */
  @JSName("currentChanged")
  def currentChanged_MRestorablePool_ : ISignal[this.type, T | Null] = js.native
  
  def current_=(obj: T | Null): Unit = js.native
  /**
    * The current object.
    *
    * #### Notes
    * The restorable pool does not set `current`. It is intended for client use.
    *
    * If `current` is set to an object that does not exist in the pool, it is a
    * no-op.
    */
  @JSName("current")
  def current_MRestorablePool_ : T | Null = js.native
  
  /**
    * Inject an object into the restorable pool without the pool handling its
    * restoration lifecycle.
    *
    * @param obj - The object to inject into the pool.
    */
  def inject(obj: T): js.Promise[Unit] = js.native
  
  /**
    * Test whether the pool is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MRestorablePool_ : Boolean = js.native
  
  /**
    * A namespace for all tracked objects.
    */
  val namespace: String = js.native
  
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  /* InferMemberOverrides */
  override def restore(options: typingsSlinky.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[T]): js.Promise[js.Any] = js.native
  
  /**
    * A promise resolved when the restorable pool has been restored.
    */
  @JSName("restored")
  def restored_MRestorablePool_ : js.Promise[Unit] = js.native
  
  /**
    * Save the restore data for a given object.
    *
    * @param obj - The object being saved.
    */
  def save(obj: T): js.Promise[Unit] = js.native
  
  /**
    * The number of objects held by the pool.
    */
  @JSName("size")
  def size_MRestorablePool_ : Double = js.native
  
  /**
    * A signal emitted when an object is updated.
    */
  @JSName("updated")
  def updated_MRestorablePool_ : ISignal[this.type, T] = js.native
}
