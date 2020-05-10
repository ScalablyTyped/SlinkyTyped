package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingJobSummary extends js.Object {
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExitMessage] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A timestamp that indicates the last time the processing job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the processing job..
    */
  var ProcessingJobArn: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
}

object ProcessingJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus
  ): ProcessingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingJobSummary]
  }
  @scala.inline
  implicit class ProcessingJobSummaryOps[Self <: ProcessingJobSummary] (val x: Self) extends AnyVal {
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
    def withProcessingJobArn(value: ProcessingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobName(value: ProcessingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobStatus(value: ProcessingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitMessage(value: ExitMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingEndTime")(js.undefined)
        ret
    }
  }
  
}

