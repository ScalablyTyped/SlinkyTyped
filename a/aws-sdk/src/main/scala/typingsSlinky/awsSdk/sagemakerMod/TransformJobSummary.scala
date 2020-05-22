package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformJobSummary extends js.Object {
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * Indicates when the transform job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
    */
  var TransformEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typingsSlinky.awsSdk.sagemakerMod.TransformJobArn = js.native
  /**
    * The name of the transform job.
    */
  var TransformJobName: typingsSlinky.awsSdk.sagemakerMod.TransformJobName = js.native
  /**
    * The status of the transform job.
    */
  var TransformJobStatus: typingsSlinky.awsSdk.sagemakerMod.TransformJobStatus = js.native
}

object TransformJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus,
    FailureReason: FailureReason = null,
    LastModifiedTime: js.Date = null,
    TransformEndTime: js.Date = null
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (TransformEndTime != null) __obj.updateDynamic("TransformEndTime")(TransformEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobSummary]
  }
}

