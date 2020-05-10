package typingsSlinky.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
}

object Emitter {
  @scala.inline
  def apply[EventName, EmittedType](): Emitter[EventName, EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emitter[EventName, EmittedType]]
  }
  @scala.inline
  implicit class EmitterOps[Self[eventname, emittedtype] <: Emitter[eventname, emittedtype], EventName, EmittedType] (val x: Self[EventName, EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EventName, EmittedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EventName, EmittedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[EventName, EmittedType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[EventName, EmittedType]) with Other]
    @scala.inline
    def withAddEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEventListener: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAddListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddListener: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.undefined)
        ret
    }
    @scala.inline
    def withOff(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOff: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEventListener: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveListener: Self[EventName, EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.undefined)
        ret
    }
  }
  
}

