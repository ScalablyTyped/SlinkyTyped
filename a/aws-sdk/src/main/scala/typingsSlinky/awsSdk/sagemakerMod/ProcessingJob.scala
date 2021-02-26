package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingJob extends StObject {
  
  var AppSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppSpecification] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  
  /**
    * The time the processing job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  
  /**
    * A string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExitMessage] = js.native
  
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The time the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.native
  
  var NetworkConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NetworkConfig] = js.native
  
  /**
    * The time that the processing job ended.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * For each input, data is downloaded from S3 into the processing container before the processing job begins running if "S3InputMode" is set to File.
    */
  var ProcessingInputs: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  
  /**
    * The ARN of the processing job.
    */
  var ProcessingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingJobArn] = js.native
  
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName] = js.native
  
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingJobStatus] = js.native
  
  var ProcessingOutputConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  
  var ProcessingResources: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingResources] = js.native
  
  /**
    * The time that the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the role used to create the processing job.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RoleArn] = js.native
  
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ARN of the training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn] = js.native
}
object ProcessingJob {
  
  @scala.inline
  def apply(): ProcessingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingJob]
  }
  
  @scala.inline
  implicit class ProcessingJobMutableBuilder[Self <: ProcessingJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSpecificationUndefined: Self = StObject.set(x, "AppSpecification", js.undefined)
    
    @scala.inline
    def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setEnvironment(value: ProcessingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setExitMessage(value: ExitMessage): Self = StObject.set(x, "ExitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitMessageUndefined: Self = StObject.set(x, "ExitMessage", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleArnUndefined: Self = StObject.set(x, "MonitoringScheduleArn", js.undefined)
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    @scala.inline
    def setProcessingEndTime(value: js.Date): Self = StObject.set(x, "ProcessingEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingEndTimeUndefined: Self = StObject.set(x, "ProcessingEndTime", js.undefined)
    
    @scala.inline
    def setProcessingInputs(value: ProcessingInputs): Self = StObject.set(x, "ProcessingInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingInputsUndefined: Self = StObject.set(x, "ProcessingInputs", js.undefined)
    
    @scala.inline
    def setProcessingInputsVarargs(value: ProcessingInput*): Self = StObject.set(x, "ProcessingInputs", js.Array(value :_*))
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobArnUndefined: Self = StObject.set(x, "ProcessingJobArn", js.undefined)
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobNameUndefined: Self = StObject.set(x, "ProcessingJobName", js.undefined)
    
    @scala.inline
    def setProcessingJobStatus(value: ProcessingJobStatus): Self = StObject.set(x, "ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobStatusUndefined: Self = StObject.set(x, "ProcessingJobStatus", js.undefined)
    
    @scala.inline
    def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    @scala.inline
    def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingResourcesUndefined: Self = StObject.set(x, "ProcessingResources", js.undefined)
    
    @scala.inline
    def setProcessingStartTime(value: js.Date): Self = StObject.set(x, "ProcessingStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStartTimeUndefined: Self = StObject.set(x, "ProcessingStartTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: ProcessingStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
  }
}
