package typingsSlinky.baconjs.busMod

import typingsSlinky.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription[V] extends js.Object {
  var input: typingsSlinky.baconjs.observableMod.default[V] = js.native
  var unsub: js.UndefOr[Unsub] = js.native
}

object Subscription {
  @scala.inline
  def apply[V](input: typingsSlinky.baconjs.observableMod.default[V]): Subscription[V] = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription[V]]
  }
  @scala.inline
  implicit class SubscriptionOps[Self[v] <: Subscription[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withInput(value: typingsSlinky.baconjs.observableMod.default[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsub(value: () => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsub")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnsub: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsub")(js.undefined)
        ret
    }
  }
  
}

