package typingsSlinky.jupyterlabCoreutils.restorablepoolMod

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IObjectPool
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable
import typingsSlinky.jupyterlabCoreutils.restorablepoolMod.RestorablePool.IOptions
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/restorablepool", "RestorablePool")
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
    * A namespace for all tracked objects.
    */
  val namespace: String = js.native
  /**
    * A promise resolved when the restorable pool has been restored.
    */
  @JSName("restored")
  val restored_RestorablePool_ : js.Promise[Unit] = js.native
  /**
    * Add a new object to the pool.
    *
    * @param obj - The object object being added.
    *
    * #### Notes
    * The object passed into the tracker is added synchronously; its existence in
    * the tracker can be checked with the `has()` method. The promise this method
    * returns resolves after the object has been added and saved to an underlying
    * restoration connector, if one is available.
    */
  def add(obj: T): js.Promise[Unit] = js.native
  /**
    * Inject an object into the restorable pool without the pool handling its
    * restoration lifecycle.
    *
    * @param obj - The object to inject into the pool.
    */
  def inject(obj: T): js.Promise[Unit] = js.native
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  /* InferMemberOverrides */
  override def restore(options: typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable.IOptions[T]): js.Promise[js.Any] = js.native
  /**
    * Save the restore data for a given object.
    *
    * @param obj - The object being saved.
    */
  def save(obj: T): js.Promise[Unit] = js.native
}

