package typingsSlinky.changeEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEmitterOf1[T] extends js.Object {
  def emit(value: T): Unit = js.native
  def listen(listener: ListenerOf1[T]): Unlisten = js.native
}

object ChangeEmitterOf1 {
  @scala.inline
  def apply[T](emit: T => Unit, listen: ListenerOf1[T] => Unlisten): ChangeEmitterOf1[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), listen = js.Any.fromFunction1(listen))
    __obj.asInstanceOf[ChangeEmitterOf1[T]]
  }
  @scala.inline
  implicit class ChangeEmitterOf1Ops[Self[t] <: ChangeEmitterOf1[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEmit(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListen(value: ListenerOf1[T] => Unlisten): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

