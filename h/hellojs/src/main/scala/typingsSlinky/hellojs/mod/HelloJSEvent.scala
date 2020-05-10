package typingsSlinky.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSEvent extends js.Object {
  def emit(event: String, data: js.Any): HelloJSStatic = js.native
  def emitAfter(): HelloJSStatic = js.native
  def findEvents(event: String, callback: js.Function2[/* name */ String, /* index */ Double, Unit]): Unit = js.native
  def off(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
  def on(event: String, callback: js.Function1[/* auth */ HelloJSEventArgument, Unit]): HelloJSStatic = js.native
}

object HelloJSEvent {
  @scala.inline
  def apply(
    emit: (String, js.Any) => HelloJSStatic,
    emitAfter: () => HelloJSStatic,
    findEvents: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit,
    off: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic,
    on: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic
  ): HelloJSEvent = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), emitAfter = js.Any.fromFunction0(emitAfter), findEvents = js.Any.fromFunction2(findEvents), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[HelloJSEvent]
  }
  @scala.inline
  implicit class HelloJSEventOps[Self <: HelloJSEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: (String, js.Any) => HelloJSStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmitAfter(value: () => HelloJSStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitAfter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindEvents(value: (String, js.Function2[/* name */ String, /* index */ Double, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOff(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* auth */ HelloJSEventArgument, Unit]) => HelloJSStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

