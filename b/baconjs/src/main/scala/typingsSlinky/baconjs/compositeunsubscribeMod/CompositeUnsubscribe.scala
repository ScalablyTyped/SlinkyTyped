package typingsSlinky.baconjs.compositeunsubscribeMod

import typingsSlinky.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeUnsubscribe extends js.Object {
  var starting: js.Array[Subscription] = js.native
  var subscriptions: js.Array[Unsub] = js.native
  var unsubscribed: Boolean = js.native
  def add(subscription: Subscription): Unit = js.native
  def count(): Double = js.native
  def empty(): Boolean = js.native
  def remove(unsub: Unsub): Unit = js.native
  def unsubscribe(): Unit = js.native
}

object CompositeUnsubscribe {
  @scala.inline
  def apply(
    add: Subscription => Unit,
    count: () => Double,
    empty: () => Boolean,
    remove: Unsub => Unit,
    starting: js.Array[Subscription],
    subscriptions: js.Array[Unsub],
    unsubscribe: () => Unit,
    unsubscribed: Boolean
  ): CompositeUnsubscribe = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), empty = js.Any.fromFunction0(empty), remove = js.Any.fromFunction1(remove), starting = starting.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe), unsubscribed = unsubscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeUnsubscribe]
  }
  @scala.inline
  implicit class CompositeUnsubscribeOps[Self <: CompositeUnsubscribe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Subscription => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: Unsub => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStarting(value: js.Array[Subscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[Unsub]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnsubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

