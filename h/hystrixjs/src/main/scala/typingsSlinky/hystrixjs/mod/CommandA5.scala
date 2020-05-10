package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA5[R, T, U, V, W, X] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X): js.Thenable[R] = js.native
}

object CommandA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](execute: (T, U, V, W, X) => js.Thenable[R]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction5(execute))
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
  @scala.inline
  implicit class CommandA5Ops[Self[r, t, u, v, w, x] <: CommandA5[r, t, u, v, w, x], R, T, U, V, W, X] (val x: Self[R, T, U, V, W, X]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X]) with Other]
    @scala.inline
    def withExecute(value: (T, U, V, W, X) => js.Thenable[R]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

