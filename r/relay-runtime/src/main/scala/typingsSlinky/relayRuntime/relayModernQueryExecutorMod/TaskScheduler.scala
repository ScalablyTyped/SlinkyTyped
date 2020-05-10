package typingsSlinky.relayRuntime.relayModernQueryExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskScheduler extends js.Object {
  def cancel(id: String): Unit = js.native
  def schedule(fn: js.Function0[Unit]): String = js.native
}

object TaskScheduler {
  @scala.inline
  def apply(cancel: String => Unit, schedule: js.Function0[Unit] => String): TaskScheduler = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), schedule = js.Any.fromFunction1(schedule))
    __obj.asInstanceOf[TaskScheduler]
  }
  @scala.inline
  implicit class TaskSchedulerOps[Self <: TaskScheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSchedule(value: js.Function0[Unit] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

