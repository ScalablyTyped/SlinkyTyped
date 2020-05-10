package typingsSlinky.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskState[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * The last arguments passed to the task.
    */
  val args: A = js.native
  /**
    * The error of the last failed invocation.
    */
  val error: js.UndefOr[js.Any] = js.native
  /**
    * Convenience getter for `state === 'pending'`.
    */
  val pending: Boolean = js.native
  /**
    * Convenience getter for `state === 'rejected'`.
    */
  val rejected: Boolean = js.native
  /**
    * Convenience getter for `state === 'resolved'`.
    */
  val resolved: Boolean = js.native
  /**
    * The result of the last invocation.
    */
  val result: js.UndefOr[WithoutPromise[R]] = js.native
  /**
    * The status (resolved, rejected, pending)
    */
  val state: TaskStatus = js.native
}

object TaskState {
  @scala.inline
  def apply[A, R](args: A, pending: Boolean, rejected: Boolean, resolved: Boolean, state: TaskStatus): TaskState[A, R] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskState[A, R]]
  }
  @scala.inline
  implicit class TaskStateOps[Self[a, r] <: TaskState[a, r], A, R] (val x: Self[A, R]) extends AnyVal {
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
    def withPending(value: Boolean): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: Boolean): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: Boolean): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TaskStatus): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
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
  }
  
}

