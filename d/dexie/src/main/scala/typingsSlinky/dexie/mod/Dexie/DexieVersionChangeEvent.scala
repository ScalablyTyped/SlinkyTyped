package typingsSlinky.dexie.mod.Dexie

import org.scalajs.dom.raw.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DexieVersionChangeEvent extends js.Object {
  def fire(event: IDBVersionChangeEvent): js.Any = js.native
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
}

object DexieVersionChangeEvent {
  @scala.inline
  def apply(
    fire: IDBVersionChangeEvent => js.Any,
    subscribe: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit,
    unsubscribe: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit
  ): DexieVersionChangeEvent = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[DexieVersionChangeEvent]
  }
  @scala.inline
  implicit class DexieVersionChangeEventOps[Self <: DexieVersionChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: IDBVersionChangeEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: js.Function1[/* event */ IDBVersionChangeEvent, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

