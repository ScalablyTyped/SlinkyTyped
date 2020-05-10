package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatus extends js.Object {
  /**
    * Output only.
    *
    * The number of attempts dispatched. This count includes tasks which have
    * been dispatched but haven't received a response.
    */
  var attemptDispatchCount: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * The number of attempts which have received a response.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var attemptResponseCount: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * The status of the task's first attempt.
    *
    * Only AttemptStatus.dispatch_time will be set.
    * The other AttemptStatus information is not retained by Cloud Tasks.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var firstAttemptStatus: js.UndefOr[AttemptStatus] = js.native
  /**
    * Output only.
    *
    * The status of the task's last attempt.
    *
    * This field is not calculated for
    * [pull tasks](google.cloud.tasks.v2beta2.PullTaskTarget).
    */
  var lastAttemptStatus: js.UndefOr[AttemptStatus] = js.native
}

object TaskStatus {
  @scala.inline
  def apply(): TaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatus]
  }
  @scala.inline
  implicit class TaskStatusOps[Self <: TaskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptDispatchCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDispatchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptDispatchCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDispatchCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAttemptResponseCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptResponseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptResponseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptResponseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstAttemptStatus(value: AttemptStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttemptStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstAttemptStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttemptStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAttemptStatus(value: AttemptStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttemptStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptStatus")(js.undefined)
        ret
    }
  }
  
}

