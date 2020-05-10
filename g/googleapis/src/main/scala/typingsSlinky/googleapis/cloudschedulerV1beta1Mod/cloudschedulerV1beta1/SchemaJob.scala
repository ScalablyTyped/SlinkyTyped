package typingsSlinky.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a job. The maximum allowed size for a job is 100KB.
  */
@js.native
trait SchemaJob extends js.Object {
  /**
    * App Engine HTTP target.
    */
  var appEngineHttpTarget: js.UndefOr[SchemaAppEngineHttpTarget] = js.native
  /**
    * The deadline for job attempts. If the request handler does not respond by
    * this deadline then the request is cancelled and the attempt is marked as
    * a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in
    * execution logs. Cloud Scheduler will retry the job according to the
    * RetryConfig.  The allowed duration for this deadline is:  * For HTTP
    * targets, between 15 seconds and 30 minutes. * For App Engine HTTP
    * targets, between 15   seconds and 24 hours. * For PubSub targets, this
    * field is ignored.
    */
  var attemptDeadline: js.UndefOr[String] = js.native
  /**
    * Optionally caller-specified in CreateJob or UpdateJob.  A human-readable
    * description for the job. This string must not contain more than 500
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * HTTP target.
    */
  var httpTarget: js.UndefOr[SchemaHttpTarget] = js.native
  /**
    * Output only. The time the last job attempt started.
    */
  var lastAttemptTime: js.UndefOr[String] = js.native
  /**
    * Optionally caller-specified in CreateJob, after which it becomes output
    * only.  The job name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.  * `PROJECT_ID`
    * can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons
    * (:), or periods (.).    For more information, see    [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the job&#39;s location.    The
    * list of available locations can be obtained by calling    ListLocations.
    * For more information, see https://cloud.google.com/about/locations/. *
    * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), or underscores (_). The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pub/Sub target.
    */
  var pubsubTarget: js.UndefOr[SchemaPubsubTarget] = js.native
  /**
    * Settings that determine the retry behavior.
    */
  var retryConfig: js.UndefOr[SchemaRetryConfig] = js.native
  /**
    * Required, except when used with UpdateJob.  Describes the schedule on
    * which the job will be executed.  The schedule can be either of the
    * following types:  * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview)
    * * English-like
    * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules)
    * As a general rule, execution `n + 1` of a job will not begin until
    * execution `n` has finished. Cloud Scheduler will never allow two
    * simultaneously outstanding executions. For example, this implies that if
    * the `n+1`th execution is scheduled to run at 16:00 but the `n`th
    * execution takes until 16:15, the `n+1`th execution will not start until
    * `16:15`. A scheduled start time will be delayed if the previous execution
    * has not ended when its scheduled time occurs.  If retry_count &gt; 0 and
    * a job attempt fails, the job will be tried a total of retry_count times,
    * with exponential backoff, until the next scheduled start time.
    */
  var schedule: js.UndefOr[String] = js.native
  /**
    * Output only. The next time the job is scheduled. Note that this may be a
    * retry of a previously failed attempt or the next execution time according
    * to the schedule.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. State of the job.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The response from the target for the last attempted
    * execution.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
  /**
    * Specifies the time zone to be used in interpreting schedule. The value of
    * this field must be a time zone name from the [tz
    * database](http://en.wikipedia.org/wiki/Tz_database).  Note that some time
    * zones include a provision for daylight savings time. The rules for
    * daylight saving time are determined by the chosen tz. For UTC use the
    * string &quot;utc&quot;. If a time zone is not specified, the default will
    * be in UTC (also known as GMT).
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * Output only. The creation time of the job.
    */
  var userUpdateTime: js.UndefOr[String] = js.native
}

object SchemaJob {
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  @scala.inline
  implicit class SchemaJobOps[Self <: SchemaJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineHttpTarget(value: SchemaAppEngineHttpTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineHttpTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAttemptDeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpTarget(value: SchemaHttpTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAttemptTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttemptTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptTime")(js.undefined)
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
    def withPubsubTarget(value: SchemaPubsubTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsubTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryConfig(value: SchemaRetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
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
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withUserUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userUpdateTime")(js.undefined)
        ret
    }
  }
  
}

