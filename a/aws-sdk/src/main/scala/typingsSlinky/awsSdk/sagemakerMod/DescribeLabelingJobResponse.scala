package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLabelingJobResponse extends js.Object {
  
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * If the job failed, the reason that it failed. 
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * Configuration information required for human workers to complete a labeling task.
    */
  var HumanTaskConfig: typingsSlinky.awsSdk.sagemakerMod.HumanTaskConfig = js.native
  
  /**
    * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig = js.native
  
  /**
    * A unique identifier for work done as part of a labeling job.
    */
  var JobReferenceCode: typingsSlinky.awsSdk.sagemakerMod.JobReferenceCode = js.native
  
  /**
    * The attribute used as the label in the output manifest file.
    */
  var LabelAttributeName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelAttributeName] = js.native
  
  /**
    * The S3 location of the JSON file that defines the categories used to label data objects. Please note the following label-category limits:   Semantic segmentation labeling jobs using automated labeling: 20 labels   Box bounding labeling jobs (all): 10 labels   The file is a JSON structure in the following format:  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label 1"    },    {    "label": "label 2"    },    ...    {    "label": "label n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.native
  
  /**
    * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine, the number of objects than couldn't be labeled, and the total number of objects labeled. 
    */
  var LabelCounters: typingsSlinky.awsSdk.sagemakerMod.LabelCounters = js.native
  
  /**
    * Configuration information for automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobAlgorithmsConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: typingsSlinky.awsSdk.sagemakerMod.LabelingJobArn = js.native
  
  /**
    * The name assigned to the labeling job when it was created.
    */
  var LabelingJobName: typingsSlinky.awsSdk.sagemakerMod.LabelingJobName = js.native
  
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobOutput] = js.native
  
  /**
    * The processing status of the labeling job. 
    */
  var LabelingJobStatus: typingsSlinky.awsSdk.sagemakerMod.LabelingJobStatus = js.native
  
  /**
    * The date and time that the labeling job was last updated.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig = js.native
  
  /**
    * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically stopped.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.native
  
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object DescribeLabelingJobResponse {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    JobReferenceCode: JobReferenceCode,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: js.Date,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn
  ): DescribeLabelingJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskConfig = HumanTaskConfig.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], LabelCounters = LabelCounters.asInstanceOf[js.Any], LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelingJobResponse]
  }
  
  @scala.inline
  implicit class DescribeLabelingJobResponseOps[Self <: DescribeLabelingJobResponse] (val x: Self) extends AnyVal {
    
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
    def setHumanTaskConfig(value: HumanTaskConfig): Self = this.set("HumanTaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfig(value: LabelingJobInputConfig): Self = this.set("InputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReferenceCode(value: JobReferenceCode): Self = this.set("JobReferenceCode", value.asInstanceOf[js.Any])
    
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
    def setOutputConfig(value: LabelingJobOutputConfig): Self = this.set("OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLabelAttributeName(value: LabelAttributeName): Self = this.set("LabelAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAttributeName: Self = this.set("LabelAttributeName", js.undefined)
    
    @scala.inline
    def setLabelCategoryConfigS3Uri(value: S3Uri): Self = this.set("LabelCategoryConfigS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCategoryConfigS3Uri: Self = this.set("LabelCategoryConfigS3Uri", js.undefined)
    
    @scala.inline
    def setLabelingJobAlgorithmsConfig(value: LabelingJobAlgorithmsConfig): Self = this.set("LabelingJobAlgorithmsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingJobAlgorithmsConfig: Self = this.set("LabelingJobAlgorithmsConfig", js.undefined)
    
    @scala.inline
    def setLabelingJobOutput(value: LabelingJobOutput): Self = this.set("LabelingJobOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingJobOutput: Self = this.set("LabelingJobOutput", js.undefined)
    
    @scala.inline
    def setStoppingConditions(value: LabelingJobStoppingConditions): Self = this.set("StoppingConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppingConditions: Self = this.set("StoppingConditions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
