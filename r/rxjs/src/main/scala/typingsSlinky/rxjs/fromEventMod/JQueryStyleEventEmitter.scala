package typingsSlinky.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def off(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function): Unit = js.native
}

object JQueryStyleEventEmitter {
  @scala.inline
  def apply(off: (String, js.Function) => Unit, on: (String, js.Function) => Unit): JQueryStyleEventEmitter = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[JQueryStyleEventEmitter]
  }
  @scala.inline
  implicit class JQueryStyleEventEmitterOps[Self <: JQueryStyleEventEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOff(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

