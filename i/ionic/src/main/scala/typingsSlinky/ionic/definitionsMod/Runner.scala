package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner[T /* <: js.Object */, U] extends js.Object {
  def run(options: T): js.Promise[U] = js.native
}

object Runner {
  @scala.inline
  def apply[T, U](run: T => js.Promise[U]): Runner[T, U] = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Runner[T, U]]
  }
  @scala.inline
  implicit class RunnerOps[Self[t, u] <: Runner[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withRun(value: T => js.Promise[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

