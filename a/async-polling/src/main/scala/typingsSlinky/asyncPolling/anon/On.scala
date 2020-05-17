package typingsSlinky.asyncPolling.anon

import typingsSlinky.asyncPolling.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait On extends js.Object {
  def on(eventName: EventName, listener: js.Function): js.Any = js.native
  def run(): js.Any = js.native
  def stop(): js.Any = js.native
}

object On {
  @scala.inline
  def apply(on: (EventName, js.Function) => js.Any, run: () => js.Any, stop: () => js.Any): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = js.Any.fromFunction0(run), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[On]
  }
  @scala.inline
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: (EventName, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRun(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

