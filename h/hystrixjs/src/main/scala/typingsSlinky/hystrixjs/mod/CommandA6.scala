package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA6[R, T, U, V, W, X, Y] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R] = js.native
}

object CommandA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => js.Thenable[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
  @scala.inline
  implicit class CommandA6Ops[Self[r, t, u, v, w, x, y] <: CommandA6[r, t, u, v, w, x, y], R, T, U, V, W, X, Y] (val x: Self[R, T, U, V, W, X, Y]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X, Y] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X, Y]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X, Y]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X, Y]) with Other]
    @scala.inline
    def withExecute(value: (T, U, V, W, X, Y) => js.Thenable[R]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

