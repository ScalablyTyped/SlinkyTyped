package typingsSlinky.googleCloudTasks.anon

import typingsSlinky.googleCloudTasks.mod.AppEngineHttpRequest
import typingsSlinky.googleCloudTasks.mod.Attempt
import typingsSlinky.googleCloudTasks.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Task> */
@js.native
trait PartialTask extends js.Object {
  var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.native
  var createTime: js.UndefOr[String] = js.native
  var dispatchCount: js.UndefOr[Double] = js.native
  var firstAttempt: js.UndefOr[Attempt] = js.native
  var lastAttempt: js.UndefOr[Attempt] = js.native
  var name: js.UndefOr[String] = js.native
  var responseCount: js.UndefOr[Double] = js.native
  var scheduleTime: js.UndefOr[String] = js.native
  var view: js.UndefOr[View] = js.native
}

object PartialTask {
  @scala.inline
  def apply(): PartialTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTask]
  }
  @scala.inline
  implicit class PartialTaskOps[Self <: PartialTask] (val x: Self) extends AnyVal {
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
    def withoutAppEngineHttpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatchCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstAttempt(value: Attempt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAttempt(value: Attempt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

