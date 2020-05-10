package typingsSlinky.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieErrorEvent extends js.Object {
  def fire(error: js.Any): js.Any = js.native
  def subscribe(fn: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def unsubscribe(fn: js.Function1[/* error */ js.Any, _]): Unit = js.native
}

object DexieErrorEvent {
  @scala.inline
  def apply(
    fire: js.Any => js.Any,
    subscribe: js.Function1[/* error */ js.Any, _] => Unit,
    unsubscribe: js.Function1[/* error */ js.Any, _] => Unit
  ): DexieErrorEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieErrorEvent]
  }
  @scala.inline
  implicit class DexieErrorEventOps[Self <: DexieErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function1[/* error */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: js.Function1[/* error */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

