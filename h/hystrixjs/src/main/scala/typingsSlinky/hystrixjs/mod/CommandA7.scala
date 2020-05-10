package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): js.Thenable[R] = js.native
}

object CommandA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](execute: (T, U, V, W, X, Y, Z) => js.Thenable[R]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction7(execute))
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
  @scala.inline
  implicit class CommandA7Ops[Self[r, t, u, v, w, x, y, z] <: CommandA7[r, t, u, v, w, x, y, z], R, T, U, V, W, X, Y, Z] (val x: Self[R, T, U, V, W, X, Y, Z]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X, Y, Z] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X, Y, Z]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X, Y, Z]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X, Y, Z]) with Other]
    @scala.inline
    def withExecute(value: (T, U, V, W, X, Y, Z) => js.Thenable[R]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction7(value))
        ret
    }
  }
  
}

