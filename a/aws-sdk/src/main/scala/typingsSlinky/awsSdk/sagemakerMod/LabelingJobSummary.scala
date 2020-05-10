package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers into a label for a data object. For more information, see Annotation Consolidation.
    */
  var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.native
  /**
    * The date and time that the job was created (timestamp).
    */
  var CreationTime: js.Date = js.native
  /**
    * If the LabelingJobStatus field is Failed, this field contains a description of the error.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * Input configuration for the labeling job.
    */
  var InputConfig: js.UndefOr[LabelingJobInputConfig] = js.native
  /**
    * Counts showing the progress of the labeling job.
    */
  var LabelCounters: typingsSlinky.awsSdk.sagemakerMod.LabelCounters = js.native
  /**
    * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
    */
  var LabelingJobArn: typingsSlinky.awsSdk.sagemakerMod.LabelingJobArn = js.native
  /**
    * The name of the labeling job.
    */
  var LabelingJobName: typingsSlinky.awsSdk.sagemakerMod.LabelingJobName = js.native
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobOutput] = js.native
  /**
    * The current status of the labeling job. 
    */
  var LabelingJobStatus: typingsSlinky.awsSdk.sagemakerMod.LabelingJobStatus = js.native
  /**
    * The date and time that the job was last modified (timestamp).
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a worker.
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to the job.
    */
  var WorkteamArn: typingsSlinky.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object LabelingJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: js.Date,
    PreHumanTaskLambdaArn: LambdaFunctionArn,
    WorkteamArn: WorkteamArn
  ): LabelingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], PreHumanTaskLambdaArn = PreHumanTaskLambdaArn.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSummary]
  }
  @scala.inline
  implicit class LabelingJobSummaryOps[Self <: LabelingJobSummary] (val x: Self) extends AnyVal {
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
    def withLabelCounters(value: LabelCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelingJobArn(value: LabelingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelingJobName(value: LabelingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelingJobStatus(value: LabelingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreHumanTaskLambdaArn(value: LambdaFunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreHumanTaskLambdaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkteamArn(value: WorkteamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotationConsolidationLambdaArn(value: LambdaFunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnotationConsolidationLambdaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationConsolidationLambdaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnnotationConsolidationLambdaArn")(js.undefined)
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
    def withInputConfig(value: LabelingJobInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelingJobOutput(value: LabelingJobOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingJobOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobOutput")(js.undefined)
        ret
    }
  }
  
}

