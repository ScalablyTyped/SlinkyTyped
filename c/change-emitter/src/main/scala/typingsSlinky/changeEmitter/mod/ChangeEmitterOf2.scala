package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf2[T1, T2] extends js.Object {
  def emit(value1: T1, value2: T2): Unit = js.native
  def listen(listener: ListenerOf2[T1, T2]): Unlisten = js.native
}

object ChangeEmitterOf2 {
  @scala.inline
  def apply[T1, T2](emit: (T1, T2) => Unit, listen: ListenerOf2[T1, T2] => Unlisten): ChangeEmitterOf2[T1, T2] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf2[T1, T2]]
  }
  @scala.inline
  implicit class ChangeEmitterOf2Ops[Self[t1, t2] <: ChangeEmitterOf2[t1, t2], T1, T2] (val x: Self[T1, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2]) with Other]
    @scala.inline
    def withEmit(value: (T1, T2) => Unit): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf2[T1, T2] => Unlisten): Self[T1, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

