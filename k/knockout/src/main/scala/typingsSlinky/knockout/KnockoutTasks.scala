package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// tasks.js
//////////////////////////////////
@js.native
trait KnockoutTasks extends js.Object {
  def cancel(handle: Double): Unit = js.native
  def runEarly(): Unit = js.native
  def schedule(task: js.Function): Double = js.native
  def scheduler(callback: js.Function): js.Any = js.native
}

object KnockoutTasks {
  @scala.inline
  def apply(
    cancel: Double => Unit,
    runEarly: () => Unit,
    schedule: js.Function => Double,
    scheduler: js.Function => js.Any
  ): KnockoutTasks = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), runEarly = js.Any.fromFunction0(runEarly), schedule = js.Any.fromFunction1(schedule), scheduler = js.Any.fromFunction1(scheduler))
    __obj.asInstanceOf[KnockoutTasks]
  }
  @scala.inline
  implicit class KnockoutTasksOps[Self <: KnockoutTasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunEarly(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runEarly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSchedule(value: js.Function => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScheduler(value: js.Function => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

