package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobSummary extends js.Object {
  /**
    * The ARN of the job.
    */
  var AutoMLJobArn: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * The job's secondary status.
    */
  var AutoMLJobSecondaryStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  /**
    * The job's status.
    */
  var AutoMLJobStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  /**
    * When the job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  /**
    * When the job was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}

object AutoMLJobSummary {
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    LastModifiedTime: js.Date
  ): AutoMLJobSummary = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobSummary]
  }
  @scala.inline
  implicit class AutoMLJobSummaryOps[Self <: AutoMLJobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLJobArn(value: AutoMLJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobName(value: AutoMLJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobSecondaryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobStatus(value: AutoMLJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: AutoMLFailureReason): Self = {
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
  }
  
}

