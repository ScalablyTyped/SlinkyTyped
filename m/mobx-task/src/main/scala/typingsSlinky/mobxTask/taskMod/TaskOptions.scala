package typingsSlinky.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions[A /* <: js.Array[_] */, R] extends js.Object {
  var args: js.UndefOr[A] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var result: js.UndefOr[WithoutPromise[R]] = js.native
  var state: js.UndefOr[TaskStatus] = js.native
  var swallow: js.UndefOr[Boolean] = js.native
}

object TaskOptions {
  @scala.inline
  def apply[A, R](): TaskOptions[A, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions[A, R]]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self[a, r] <: TaskOptions[a, r], A, R] (val x: Self[A, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, R]) with Other]
    @scala.inline
    def withArgs(value: A): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: WithoutPromise[R]): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: TaskStatus): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSwallow(value: Boolean): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwallow: Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallow")(js.undefined)
        ret
    }
  }
  
}

