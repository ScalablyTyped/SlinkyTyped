package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA3[R, T, U, V] extends js.Object {
  def execute(t: T, u: U, v: V): js.Thenable[R] = js.native
}

object CommandA3 {
  @scala.inline
  def apply[R, T, U, V](execute: (T, U, V) => js.Thenable[R]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute))
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
  @scala.inline
  implicit class CommandA3Ops[Self[r, t, u, v] <: CommandA3[r, t, u, v], R, T, U, V] (val x: Self[R, T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V]) with Other]
    @scala.inline
    def withExecute(value: (T, U, V) => js.Thenable[R]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

