package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecution extends js.Object {
  /**
    * The estimated number of seconds that remain before the job execution status will be changed to TIMED_OUT.
    */
  var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.native
  /**
    * A number that identifies a particular job execution on a particular device. It can be used later in commands that return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The content of the job document.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was enqueued.
    */
  var queuedAt: js.UndefOr[QueuedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the job execution was started.
    */
  var startedAt: js.UndefOr[StartedAt] = js.native
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.native
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.native
}

object JobExecution {
  @scala.inline
  def apply(): JobExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecution]
  }
  @scala.inline
  implicit class JobExecutionOps[Self <: JobExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximateSecondsBeforeTimedOut(value: ApproximateSecondsBeforeTimedOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateSecondsBeforeTimedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximateSecondsBeforeTimedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximateSecondsBeforeTimedOut")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionNumber(value: ExecutionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withJobDocument(value: JobDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: LastUpdatedAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedAt(value: QueuedAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: StartedAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: JobExecutionStatus): Self = {
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
    def withStatusDetails(value: DetailsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNumber(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(js.undefined)
        ret
    }
  }
  
}

