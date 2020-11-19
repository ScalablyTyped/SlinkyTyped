package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCounters(value: LabelCounters): Self = this.set("LabelCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = this.set("LabelingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobName(value: LabelingJobName): Self = this.set("LabelingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobStatus(value: LabelingJobStatus): Self = this.set("LabelingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreHumanTaskLambdaArn(value: LambdaFunctionArn): Self = this.set("PreHumanTaskLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkteamArn(value: WorkteamArn): Self = this.set("WorkteamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationConsolidationLambdaArn(value: LambdaFunctionArn): Self = this.set("AnnotationConsolidationLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationConsolidationLambdaArn: Self = this.set("AnnotationConsolidationLambdaArn", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setInputConfig(value: LabelingJobInputConfig): Self = this.set("InputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("InputConfig", js.undefined)
    
    @scala.inline
    def setLabelingJobOutput(value: LabelingJobOutput): Self = this.set("LabelingJobOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingJobOutput: Self = this.set("LabelingJobOutput", js.undefined)
  }
}
