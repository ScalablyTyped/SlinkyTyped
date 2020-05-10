package typingsSlinky.framebus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBus extends js.Object {
  def emit(event: String, args: js.Any*): Boolean = js.native
  def off(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def pub(event: String, args: js.Any*): Boolean = js.native
  def publish(event: String, args: js.Any*): Boolean = js.native
  def sub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def subscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def trigger(event: String, args: js.Any*): Boolean = js.native
  def unsub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  def unsubscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
}

object FrameBus {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Boolean,
    off: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    on: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    pub: (String, /* repeated */ js.Any) => Boolean,
    publish: (String, /* repeated */ js.Any) => Boolean,
    sub: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    subscribe: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    trigger: (String, /* repeated */ js.Any) => Boolean,
    unsub: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    unsubscribe: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean
  ): FrameBus = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pub = js.Any.fromFunction2(pub), publish = js.Any.fromFunction2(publish), sub = js.Any.fromFunction2(sub), subscribe = js.Any.fromFunction2(subscribe), trigger = js.Any.fromFunction2(trigger), unsub = js.Any.fromFunction2(unsub), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[FrameBus]
  }
  @scala.inline
  implicit class FrameBusOps[Self <: FrameBus] (val x: Self) extends AnyVal {
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
    def withOff(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPub(value: (String, /* repeated */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPublish(value: (String, /* repeated */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSub(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrigger(value: (String, /* repeated */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsub(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsub")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

