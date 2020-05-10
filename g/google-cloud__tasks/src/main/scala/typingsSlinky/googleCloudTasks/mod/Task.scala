package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  var appEngineHttpRequest: AppEngineHttpRequest = js.native
  var createTime: String = js.native
  var dispatchCount: Double = js.native
  var firstAttempt: Attempt = js.native
  var lastAttempt: Attempt = js.native
  var name: String = js.native
  var responseCount: Double = js.native
  var scheduleTime: String = js.native
  var view: View = js.native
}

object Task {
  @scala.inline
  def apply(
    appEngineHttpRequest: AppEngineHttpRequest,
    createTime: String,
    dispatchCount: Double,
    firstAttempt: Attempt,
    lastAttempt: Attempt,
    name: String,
    responseCount: Double,
    scheduleTime: String,
    view: View
  ): Task = {
    val __obj = js.Dynamic.literal(appEngineHttpRequest = appEngineHttpRequest.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], dispatchCount = dispatchCount.asInstanceOf[js.Any], firstAttempt = firstAttempt.asInstanceOf[js.Any], lastAttempt = lastAttempt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], responseCount = responseCount.asInstanceOf[js.Any], scheduleTime = scheduleTime.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineHttpRequest(value: AppEngineHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatchCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstAttempt(value: Attempt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAttempt(value: Attempt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

