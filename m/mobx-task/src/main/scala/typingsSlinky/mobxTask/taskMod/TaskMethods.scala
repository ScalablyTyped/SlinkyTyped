package typingsSlinky.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskMethods[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * Pattern-matches on the task status.
    * @param props
    */
  def `match`[PT, ET, RT](props: TaskMatchProps[PT, ET, RT, A, R]): PT | ET | RT = js.native
  /**
    * Resets the state.
    */
  def reset(): Unit = js.native
  /**
    * Sets the state.
    */
  def setState(props: TaskOptions[A, R]): Unit = js.native
  /**
    * Wraps the task by invoking `func` with the inner task function, which returns the wrapped function
    * and converts that to a task.
    *
    * @param func
    */
  def wrap[NA /* <: js.Array[_] */, NR](func: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[/* args */ NA, NR]]): Task_[NA, NR] = js.native
}

object TaskMethods {
  @scala.inline
  def apply[A, R](
    `match`: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => js.Any,
    reset: () => Unit,
    setState: TaskOptions[A, R] => Unit,
    wrap: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => Task_[js.Any, js.Any]
  ): TaskMethods[A, R] = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), wrap = js.Any.fromFunction1(wrap))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[TaskMethods[A, R]]
  }
  @scala.inline
  implicit class TaskMethodsOps[Self[a, r] <: TaskMethods[a, r], A, R] (val x: Self[A, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, R]) with Other]
    @scala.inline
    def withMatch(value: TaskMatchProps[js.Any, js.Any, js.Any, A, R] => js.Any): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: TaskOptions[A, R] => Unit): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrap(
      value: js.Function1[/* inner */ js.Function1[/* args */ A, R], js.Function1[js.Any, js.Any]] => Task_[js.Any, js.Any]
    ): Self[A, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

