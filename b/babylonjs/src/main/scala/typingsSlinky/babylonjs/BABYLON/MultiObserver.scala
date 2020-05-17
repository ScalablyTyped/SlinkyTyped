package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiObserver[T] extends js.Object {
  var _observables: js.Any = js.native
  var _observers: js.Any = js.native
  /**
    * Release associated resources
    */
  def dispose(): Unit = js.native
}

object MultiObserver {
  @scala.inline
  def apply[T](_observables: js.Any, _observers: js.Any, dispose: () => Unit): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[MultiObserver[T]]
  }
  @scala.inline
  implicit class MultiObserverOps[Self[t] <: MultiObserver[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_observables(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_observers(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

