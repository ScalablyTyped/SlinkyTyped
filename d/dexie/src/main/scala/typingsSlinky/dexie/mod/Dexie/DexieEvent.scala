package typingsSlinky.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieEvent extends js.Object {
  var subscribers: js.Array[js.Function] = js.native
  def fire(args: js.Any*): js.Any = js.native
  def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

object DexieEvent {
  @scala.inline
  def apply(
    fire: /* repeated */ js.Any => js.Any,
    subscribe: js.Function1[/* repeated */ js.Any, _] => Unit,
    subscribers: js.Array[js.Function],
    unsubscribe: js.Function1[/* repeated */ js.Any, _] => Unit
  ): DexieEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieEvent]
  }
  @scala.inline
  implicit class DexieEventOps[Self <: DexieEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribers(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribe(value: js.Function1[/* repeated */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

