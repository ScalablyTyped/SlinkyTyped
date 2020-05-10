package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unit of scheduled work.
  */
@js.native
trait SchemaTask extends js.Object {
  /**
    * App Engine HTTP request that is sent to the task&#39;s target. Can be set
    * only if app_engine_http_target is set on the queue.  An App Engine task
    * is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[SchemaAppEngineHttpRequest] = js.native
  /**
    * Output only. The time that the task was created.  `create_time` will be
    * truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optionally caller-specified in CreateTask.  The task name.  The task name
    * must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the task&#39;s location.    The
    * list of available locations can be obtained by calling    ListLocations.
    * For more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters. * `TASK_ID` can contain only
    * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_).
    * The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * LeaseTasks to process the task. Can be set only if pull_target is set on
    * the queue.  A pull task is a task that has PullMessage set.
    */
  var pullMessage: js.UndefOr[SchemaPullMessage] = js.native
  /**
    * The time when the task is scheduled to be attempted.  For App Engine
    * queues, this is when the task will be attempted or retried.  For pull
    * queues, this is the time when the task is available to be leased; if a
    * task is currently leased, this is the time when the current lease
    * expires, that is, the time that the task was leased plus the
    * lease_duration.  `schedule_time` will be truncated to the nearest
    * microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. The task status.
    */
  var status: js.UndefOr[SchemaTaskStatus] = js.native
  /**
    * Output only. The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.native
}

object SchemaTask {
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  @scala.inline
  implicit class SchemaTaskOps[Self <: SchemaTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineHttpRequest(value: SchemaAppEngineHttpRequest): Self = {
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
    def withPullMessage(value: SchemaPullMessage): Self = {
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
    def withStatus(value: SchemaTaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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

