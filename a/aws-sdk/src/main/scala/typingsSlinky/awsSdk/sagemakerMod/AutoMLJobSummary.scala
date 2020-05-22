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
    LastModifiedTime: js.Date,
    EndTime: js.Date = null,
    FailureReason: AutoMLFailureReason = null
  ): AutoMLJobSummary = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobSummary]
  }
}

