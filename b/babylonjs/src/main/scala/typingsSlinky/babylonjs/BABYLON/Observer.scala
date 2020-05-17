package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  /** @hidden */
  var _willBeUnregistered: Boolean = js.native
  /**
    * Defines the mask of the observer (used to filter notifications)
    */
  var mask: Double = js.native
  /**
    * Defines the current scope used to restore the JS context
    */
  var scope: js.Any = js.native
  /**
    * Gets or sets a property defining that the observer as to be unregistered after the next notification
    */
  var unregisterOnNextCall: Boolean = js.native
  /**
    * Defines the callback to call when the observer is notified
    */
  def callback(eventData: T, eventState: EventState): Unit = js.native
}

object Observer {
  @scala.inline
  def apply[T](
    _willBeUnregistered: Boolean,
    callback: (T, EventState) => Unit,
    mask: Double,
    scope: js.Any,
    unregisterOnNextCall: Boolean
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(_willBeUnregistered = _willBeUnregistered.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), mask = mask.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], unregisterOnNextCall = unregisterOnNextCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self[t] <: Observer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_willBeUnregistered(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_willBeUnregistered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: (T, EventState) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMask(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnregisterOnNextCall(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregisterOnNextCall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

