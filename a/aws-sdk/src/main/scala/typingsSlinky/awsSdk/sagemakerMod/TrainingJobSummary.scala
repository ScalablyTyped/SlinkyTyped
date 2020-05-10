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
    TrainingJobStatus: TrainingJobStatus
  ): TrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobSummary]
  }
  @scala.inline
  implicit class TrainingJobSummaryOps[Self <: TrainingJobSummary] (val x: Self) extends AnyVal {
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
    def withTrainingJobArn(value: TrainingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobName(value: TrainingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobStatus(value: TrainingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatus")(value.asInstanceOf[js.Any])
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
    def withTrainingEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingEndTime")(js.undefined)
        ret
    }
  }
  
}

