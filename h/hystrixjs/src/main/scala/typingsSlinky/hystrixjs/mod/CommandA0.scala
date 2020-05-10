package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA0[R] extends js.Object {
  def execute[R](): js.Thenable[R] = js.native
}

object CommandA0 {
  @scala.inline
  def apply[R](execute: () => js.Thenable[js.Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[CommandA0[R]]
  }
  @scala.inline
  implicit class CommandA0Ops[Self[r] <: CommandA0[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withExecute(value: () => js.Thenable[js.Any]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

