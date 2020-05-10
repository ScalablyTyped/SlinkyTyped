package typingsSlinky.eventLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLite extends js.Object {
  def emit(event: String, args: js.Any*): Boolean = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
}

object EventLite {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Boolean,
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite,
    once: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite
  ): EventLite = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[EventLite]
  }
  @scala.inline
  implicit class EventLiteOps[Self <: EventLite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: (String, /* repeated */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

