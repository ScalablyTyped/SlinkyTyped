package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA4[R, T, U, V, W] extends js.Object {
  def execute(t: T, u: U, v: V, w: W): js.Thenable[R] = js.native
}

object CommandA4 {
  @scala.inline
  def apply[R, T, U, V, W](execute: (T, U, V, W) => js.Thenable[R]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute))
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
  @scala.inline
  implicit class CommandA4Ops[Self[r, t, u, v, w] <: CommandA4[r, t, u, v, w], R, T, U, V, W] (val x: Self[R, T, U, V, W]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W]) with Other]
    @scala.inline
    def withExecute(value: (T, U, V, W) => js.Thenable[R]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

