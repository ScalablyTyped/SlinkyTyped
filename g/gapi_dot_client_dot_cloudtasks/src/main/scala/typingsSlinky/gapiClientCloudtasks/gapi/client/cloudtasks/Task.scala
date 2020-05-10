package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * App Engine HTTP request that is sent to the task's target. Can be set
    * only if Queue.app_engine_http_target is set.
    *
    * An App Engine task is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.native
  /** Deprecated. Use Task.app_engine_http_request. */
  var appEngineTaskTarget: js.UndefOr[AppEngineTaskTarget] = js.native
  /**
    * Output only.
    *
    * The time that the task was created.
    *
    * `create_time` will be truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The task name.
    *
    * The task name must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    *
    * &#42; `PROJECT_ID` can contain uppercase and lowercase letters,
    * numbers, hyphens, colons, and periods; that is, it must match
    * the regular expression: `[a-zA-Z\\d-:\\.]+`.
    * &#42; `QUEUE_ID` can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular
    * expression: `[a-zA-Z\\d-]+`. The maximum length is 100
    * characters.
    * &#42; `TASK_ID` contain uppercase and lowercase letters, numbers,
    * underscores, and hyphens; that is, it must match the regular
    * expression: `[a-zA-Z\\d_-]+`. The maximum length is 500
    * characters.
    *
    * Optionally caller-specified in CreateTaskRequest.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pull message contains data that should be used by the caller of
    * CloudTasks.PullTasks to process the task. Can be set only if
    * Queue.pull_target is set.
    *
    * A pull task is a task that has PullMessage set.
    */
  var pullMessage: js.UndefOr[PullMessage] = js.native
  /** Deprecated. Use Task.pull_message. */
  var pullTaskTarget: js.UndefOr[PullTaskTarget] = js.native
  /**
    * The time when the task is scheduled to be attempted.
    *
    * For pull queues, this is the time when the task is available to
    * be leased; if a task is currently leased, this is the time when
    * the current lease expires, that is, the time that the task was
    * leased plus the PullTasksRequest.lease_duration.
    *
    * For App Engine queues, this is when the task will be attempted or retried.
    *
    * `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only.
    *
    * Task status.
    */
  var taskStatus: js.UndefOr[TaskStatus] = js.native
  /**
    * Output only.
    *
    * The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
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
    def withoutAppEngineHttpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withAppEngineTaskTarget(value: AppEngineTaskTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineTaskTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineTaskTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineTaskTarget")(js.undefined)
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
    def withPullMessage(value: PullMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPullTaskTarget(value: PullTaskTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTaskTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullTaskTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTaskTarget")(js.undefined)
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
    def withTaskStatus(value: TaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
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

