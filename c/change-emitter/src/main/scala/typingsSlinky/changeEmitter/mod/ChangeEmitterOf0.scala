package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf0 extends js.Object {
  def emit(): Unit = js.native
  def listen(listener: ListenerOf0): Unlisten = js.native
}

object ChangeEmitterOf0 {
  @scala.inline
  def apply(emit: () => Unit, listen: ListenerOf0 => Unlisten): ChangeEmitterOf0 = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction0(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf0]
  }
  @scala.inline
  implicit class ChangeEmitterOf0Ops[Self <: ChangeEmitterOf0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf0 => Unlisten): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

