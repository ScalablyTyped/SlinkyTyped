package typingsSlinky.createSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionConfig[S, T] extends js.Object {
  /**
    * Synchronously gets the value for the subscribed property.
    * Return undefined if the subscribable value is undefined,
    * Or does not support synchronous reading (e.g. native Promise).
    */
  def getCurrentValue(source: S): T = js.native
  /**
    * Set up a subscription for the subscribable value in props, and return an unsubscribe function.
    * Return false to indicate the property cannot be unsubscribed from (e.g. native Promises).
    * Due to the variety of change event types, subscribers should provide their own handlers.
    * Those handlers should not attempt to update state though;
    * They should call the callback() instead when a subscription changes.
    */
  def subscribe(source: S, callback: js.Function1[/* newValue */ T, Unit]): Unsubscribe = js.native
}

object SubscriptionConfig {
  @scala.inline
  def apply[S, T](getCurrentValue: S => T, subscribe: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): SubscriptionConfig[S, T] = {
    val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction1(getCurrentValue), subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[SubscriptionConfig[S, T]]
  }
  @scala.inline
  implicit class SubscriptionConfigOps[Self[s, t] <: SubscriptionConfig[s, t], S, T] (val x: Self[S, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, T]) with Other]
    @scala.inline
    def withGetCurrentValue(value: S => T): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (S, js.Function1[/* newValue */ T, Unit]) => Unsubscribe): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

