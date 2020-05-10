package typingsSlinky.jupyterlabCoreutils.interfacesMod

import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The number of objects held by the pool.
    */
  val size: Double = js.native
  /**
    * A signal emitted when an object is updated.
    */
  val updated: ISignal[this.type, T] = js.native
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
}

object IObjectPool {
  @scala.inline
  def apply[T](
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
  implicit class IObjectPoolOps[Self[t] <: IObjectPool[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdded(value: ISignal[IObjectPool[T], T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentChanged(value: ISignal[IObjectPool[T], T | Null]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: ISignal[IObjectPool[T], T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(null)
        ret
    }
  }
  
}

