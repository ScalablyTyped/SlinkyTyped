package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA2[R, T, U] extends js.Object {
  def execute(t: T, u: U): js.Thenable[R] = js.native
}

object CommandA2 {
  @scala.inline
  def apply[R, T, U](execute: (T, U) => js.Thenable[R]): CommandA2[R, T, U] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute))
    __obj.asInstanceOf[CommandA2[R, T, U]]
  }
  @scala.inline
  implicit class CommandA2Ops[Self[r, t, u] <: CommandA2[r, t, u], R, T, U] (val x: Self[R, T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U]) with Other]
    @scala.inline
    def withExecute(value: (T, U) => js.Thenable[R]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

