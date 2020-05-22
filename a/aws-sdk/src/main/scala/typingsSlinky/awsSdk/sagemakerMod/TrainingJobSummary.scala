package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobSummary extends js.Object {
  /**
    * A timestamp that shows when the training job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    *  Timestamp when the training job was last modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that shows when the training job ended. This field is set only if the training job has one of the terminal statuses (Completed, Failed, or Stopped). 
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn = js.native
  /**
    * The name of the training job that you want a summary for.
    */
  var TrainingJobName: typingsSlinky.awsSdk.sagemakerMod.TrainingJobName = js.native
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatus = js.native
}

object TrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    LastModifiedTime: js.Date = null,
    TrainingEndTime: js.Date = null
  ): TrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobSummary]
  }
}

