package typingsSlinky.nodeCron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledTask extends js.Object {
  def destroy(): Unit = js.native
  def getStatus(): String = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

object ScheduledTask {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getStatus: () => String,
    start: () => ScheduledTask,
    stop: () => ScheduledTask
  ): ScheduledTask = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStatus = js.Any.fromFunction0(getStatus), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ScheduledTask]
  }
  @scala.inline
  implicit class ScheduledTaskOps[Self <: ScheduledTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => ScheduledTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => ScheduledTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

