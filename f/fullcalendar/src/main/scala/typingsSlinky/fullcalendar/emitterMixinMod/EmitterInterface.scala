package typingsSlinky.fullcalendar.emitterMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterInterface extends js.Object {
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
}

object EmitterInterface {
  @scala.inline
  def apply(
    hasHandlers: js.Any => js.Any,
    off: (js.Any, js.Any) => js.Any,
    on: (js.Any, js.Any) => js.Any,
    one: (js.Any, js.Any) => js.Any,
    trigger: (js.Any, /* repeated */ js.Any) => js.Any,
    triggerWith: (js.Any, js.Any, js.Any) => js.Any
  ): EmitterInterface = {
    val __obj = js.Dynamic.literal(hasHandlers = js.Any.fromFunction1(hasHandlers), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), one = js.Any.fromFunction2(one), trigger = js.Any.fromFunction2(trigger), triggerWith = js.Any.fromFunction3(triggerWith))
    __obj.asInstanceOf[EmitterInterface]
  }
  @scala.inline
  implicit class EmitterInterfaceOps[Self <: EmitterInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasHandlers(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOff(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOne(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrigger(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTriggerWith(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWith")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

