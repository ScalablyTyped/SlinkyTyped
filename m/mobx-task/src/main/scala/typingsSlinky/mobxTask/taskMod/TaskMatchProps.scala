package typingsSlinky.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskMatchProps[T1, T2, T3, A /* <: js.Array[_] */, R] extends js.Object {
  var pending: js.UndefOr[js.Function1[/* args */ A, T1]] = js.native
  var rejected: js.UndefOr[js.Function1[/* error */ js.Any, T2]] = js.native
  var resolved: js.UndefOr[js.Function1[/* result */ WithoutPromise[R], T3]] = js.native
}

object TaskMatchProps {
  @scala.inline
  def apply[T1, T2, T3, A, R](): TaskMatchProps[T1, T2, T3, A, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, A, R]]
  }
  @scala.inline
  implicit class TaskMatchPropsOps[Self[t1, t2, t3, a, r] <: TaskMatchProps[t1, t2, t3, a, r], T1, T2, T3, A, R] (val x: Self[T1, T2, T3, A, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T1, T2, T3, A, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T1, T2, T3, A, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T1, T2, T3, A, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T1, T2, T3, A, R]) with Other]
    @scala.inline
    def withPending(value: /* args */ A => T1): Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPending: Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
    @scala.inline
    def withRejected(value: /* error */ js.Any => T2): Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRejected: Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(js.undefined)
        ret
    }
    @scala.inline
    def withResolved(value: /* result */ WithoutPromise[R] => T3): Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolved: Self[T1, T2, T3, A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(js.undefined)
        ret
    }
  }
  
}

