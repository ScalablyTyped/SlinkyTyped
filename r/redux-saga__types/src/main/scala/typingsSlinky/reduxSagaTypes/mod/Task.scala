package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Cancels the task (If it is still running)
    */
  def cancel(): Unit = js.native
  /**
    * Returns task thrown error. `undefined` if task is still running
    */
  def error(): js.UndefOr[js.Any] = js.native
  /**
    * Returns true if the task has been cancelled
    */
  def isCancelled(): Boolean = js.native
  /**
    * Returns true if the task hasn't yet returned or thrown an error
    */
  def isRunning(): Boolean = js.native
  /**
    * Returns task return value. `undefined` if task is still running
    */
  def result[T](): js.UndefOr[T] = js.native
  def setContext[C /* <: js.Object */](props: Partial[C]): Unit = js.native
  /**
    * Returns a Promise which is either:
    * - resolved with task's return value
    * - rejected with task's thrown error
    */
  def toPromise[T](): js.Promise[T] = js.native
}

object Task {
  @scala.inline
  def apply(
    cancel: () => Unit,
    error: () => js.UndefOr[js.Any],
    isCancelled: () => Boolean,
    isRunning: () => Boolean,
    result: () => js.UndefOr[js.Any],
    setContext: Partial[js.Any] => Unit,
    toPromise: () => js.Promise[js.Any]
  ): Task = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), error = js.Any.fromFunction0(error), isCancelled = js.Any.fromFunction0(isCancelled), isRunning = js.Any.fromFunction0(isRunning), result = js.Any.fromFunction0(result), setContext = js.Any.fromFunction1(setContext), toPromise = js.Any.fromFunction0(toPromise))
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: () => js.UndefOr[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCancelled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRunning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResult(value: () => js.UndefOr[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: Partial[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToPromise(value: () => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPromise")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

