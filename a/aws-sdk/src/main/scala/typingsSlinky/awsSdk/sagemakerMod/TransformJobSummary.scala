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
    TransformJobStatus: TransformJobStatus
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobSummary]
  }
  @scala.inline
  implicit class TransformJobSummaryOps[Self <: TransformJobSummary] (val x: Self) extends AnyVal {
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
    def withTransformJobArn(value: TransformJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformJobName(value: TransformJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformJobStatus(value: TransformJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobStatus")(value.asInstanceOf[js.Any])
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
    def withTransformEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformEndTime")(js.undefined)
        ret
    }
  }
  
}

