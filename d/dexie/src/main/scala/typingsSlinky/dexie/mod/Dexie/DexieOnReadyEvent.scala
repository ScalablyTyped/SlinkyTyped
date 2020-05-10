package typingsSlinky.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieOnReadyEvent extends js.Object {
  def fire(): js.Any = js.native
  def subscribe(fn: js.Function0[_], bSticky: Boolean): Unit = js.native
  def unsubscribe(fn: js.Function0[_]): Unit = js.native
}

object DexieOnReadyEvent {
  @scala.inline
  def apply(
    fire: () => js.Any,
    subscribe: (js.Function0[_], Boolean) => Unit,
    unsubscribe: js.Function0[_] => Unit
  ): DexieOnReadyEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction0(fire), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieOnReadyEvent]
  }
  @scala.inline
  implicit class DexieOnReadyEventOps[Self <: DexieOnReadyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (js.Function0[_], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

