package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf3[T1, T2, T3] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3): Unit = js.native
  def listen(listener: ListenerOf3[T1, T2, T3]): Unlisten = js.native
}

object ChangeEmitterOf3 {
  @scala.inline
  def apply[T1, T2, T3](emit: (T1, T2, T3) => Unit, listen: ListenerOf3[T1, T2, T3] => Unlisten): ChangeEmitterOf3[T1, T2, T3] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction3(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf3[T1, T2, T3]]
  }
  @scala.inline
  implicit class ChangeEmitterOf3Ops[Self[t1, t2, t3] <: ChangeEmitterOf3[t1, t2, t3], T1, T2, T3] (val x: Self[T1, T2, T3]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3]) with Other]
    @scala.inline
    def withEmit(value: (T1, T2, T3) => Unit): Self[T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf3[T1, T2, T3] => Unlisten): Self[T1, T2, T3] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

