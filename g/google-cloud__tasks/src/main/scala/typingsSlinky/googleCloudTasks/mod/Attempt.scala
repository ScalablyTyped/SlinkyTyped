package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attempt extends js.Object {
  var dispatchTime: String = js.native
  var responseStatus: Status = js.native
  var responseTime: String = js.native
  var scheduleTime: String = js.native
}

object Attempt {
  @scala.inline
  def apply(dispatchTime: String, responseStatus: Status, responseTime: String, scheduleTime: String): Attempt = {
    val __obj = js.Dynamic.literal(dispatchTime = dispatchTime.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
  @scala.inline
  implicit class AttemptOps[Self <: Attempt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatchTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

