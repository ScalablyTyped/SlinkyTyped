package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): Unit = js.native
  def listen(listener: Listener): Unlisten = js.native
}

object ChangeEmitter {
  @scala.inline
  def apply(emit: /* repeated */ js.Any => Unit, listen: Listener => Unlisten): ChangeEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitter]
  }
  @scala.inline
  implicit class ChangeEmitterOps[Self <: ChangeEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListen(value: Listener => Unlisten): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

