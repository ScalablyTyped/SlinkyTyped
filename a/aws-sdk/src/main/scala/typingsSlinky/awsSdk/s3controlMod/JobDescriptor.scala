package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDescriptor extends js.Object {
  /**
    * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is required only for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.ConfirmationRequired] = js.native
  /**
    * A timestamp indicating when this job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The description for this job, if one was provided in this job's Create Job request.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * If the specified job failed, this field contains information describing the failure.
    */
  var FailureReasons: js.UndefOr[JobFailureList] = js.native
  /**
    * The Amazon Resource Name (ARN) for this job.
    */
  var JobArn: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.JobArn] = js.native
  /**
    * The ID for the specified job.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.JobId] = js.native
  /**
    * The configuration information for the specified job's manifest object.
    */
  var Manifest: js.UndefOr[JobManifest] = js.native
  /**
    * The operation that the specified job is configured to execute on the objects listed in the manifest.
    */
  var Operation: js.UndefOr[JobOperation] = js.native
  /**
    * The priority of the specified job.
    */
  var Priority: js.UndefOr[JobPriority] = js.native
  /**
    * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the number of tasks that failed.
    */
  var ProgressSummary: js.UndefOr[JobProgressSummary] = js.native
  /**
    * Contains the configuration information for the job-completion report if you requested one in the Create Job request.
    */
  var Report: js.UndefOr[JobReport] = js.native
  /**
    * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks for this job.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * The current status of the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * 
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
  /**
    * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3 console. When you create the job, it enters the Suspended state to await confirmation before running. After you confirm the job, it automatically exits the Suspended state.
    */
  var SuspendedCause: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.SuspendedCause] = js.native
  /**
    * The timestamp when this job was suspended, if it has been suspended.
    */
  var SuspendedDate: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded, failed, or was canceled.
    */
  var TerminationDate: js.UndefOr[js.Date] = js.native
}

object JobDescriptor {
  @scala.inline
  def apply(): JobDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDescriptor]
  }
  @scala.inline
  implicit class JobDescriptorOps[Self <: JobDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmationRequired(value: ConfirmationRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmationRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmationRequired")(js.undefined)
        ret
    }
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
    def withFailureReasons(value: JobFailureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withJobArn(value: JobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobArn")(js.undefined)
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
    def withManifest(value: JobManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: JobOperation): Self = {
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
    def withReport(value: JobReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Report")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
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
    def withStatusUpdateReason(value: JobStatusUpdateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusUpdateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusUpdateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendedCause(value: SuspendedCause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedCause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendedCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedCause")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuspendedDate")(js.undefined)
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

