package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf5[T1, T2, T3, T4, T5] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Unit = js.native
  def listen(listener: ListenerOf5[T1, T2, T3, T4, T5]): Unlisten = js.native
}

object ChangeEmitterOf5 {
  @scala.inline
  def apply[T1, T2, T3, T4, T5](emit: (T1, T2, T3, T4, T5) => Unit, listen: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): ChangeEmitterOf5[T1, T2, T3, T4, T5] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction5(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf5[T1, T2, T3, T4, T5]]
  }
  @scala.inline
  implicit class ChangeEmitterOf5Ops[Self[t1, t2, t3, t4, t5] <: ChangeEmitterOf5[t1, t2, t3, t4, t5], T1, T2, T3, T4, T5] (val x: Self[T1, T2, T3, T4, T5]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, T4, T5] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, T4, T5]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, T4, T5]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, T4, T5]) with Other]
    @scala.inline
    def withEmit(value: (T1, T2, T3, T4, T5) => Unit): Self[T1, T2, T3, T4, T5] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf5[T1, T2, T3, T4, T5] => Unlisten): Self[T1, T2, T3, T4, T5] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

