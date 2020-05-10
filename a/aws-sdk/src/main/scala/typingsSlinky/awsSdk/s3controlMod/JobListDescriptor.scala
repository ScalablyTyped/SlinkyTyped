package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobListDescriptor extends js.Object {
  /**
    * A timestamp indicating when the specified job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The user-specified description that was included in the specified job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.JobId] = js.native
  /**
    * The operation that the specified job is configured to run on each object listed in the manifest.
    */
  var Operation: js.UndefOr[OperationName] = js.native
  /**
    * The current priority for the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  /**
    * The specified job's current status.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[js.Date] = js.native
}

object JobListDescriptor {
  @scala.inline
  def apply(): JobListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListDescriptor]
  }
  @scala.inline
  implicit class JobListDescriptorOps[Self <: JobListDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyMaxLength256String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: OperationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: JobPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressSummary(value: JobProgressSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationDate")(js.undefined)
        ret
    }
  }
  
}

