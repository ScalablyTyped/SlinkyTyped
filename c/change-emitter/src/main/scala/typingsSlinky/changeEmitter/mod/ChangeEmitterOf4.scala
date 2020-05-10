package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf4[T1, T2, T3, T4] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4): Unit = js.native
  def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten = js.native
}

object ChangeEmitterOf4 {
  @scala.inline
  def apply[T1, T2, T3, T4](emit: (T1, T2, T3, T4) => Unit, listen: ListenerOf4[T1, T2, T3, T4] => Unlisten): ChangeEmitterOf4[T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction4(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
  }
  @scala.inline
  implicit class ChangeEmitterOf4Ops[Self[t1, t2, t3, t4] <: ChangeEmitterOf4[t1, t2, t3, t4], T1, T2, T3, T4] (val x: Self[T1, T2, T3, T4]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4]) with Other]
    @scala.inline
    def withEmit(value: (T1, T2, T3, T4) => Unit): Self[T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf4[T1, T2, T3, T4] => Unlisten): Self[T1, T2, T3, T4] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

