package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProcessingJobRequest extends StObject {
  
  /**
    * Configures the processing job to run a specified Docker container image.
    */
  var AppSpecification: typingsSlinky.awsSdk.sagemakerMod.AppSpecification = js.native
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NetworkConfig] = js.native
  
  /**
    * For each input, data is downloaded from S3 into the processing container before the processing job begins running if "S3InputMode" is set to File.
    */
  var ProcessingInputs: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  
  /**
    *  The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
  
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typingsSlinky.awsSdk.sagemakerMod.ProcessingResources = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateProcessingJobRequest {
  
  @scala.inline
  def apply(
    AppSpecification: AppSpecification,
    ProcessingJobName: ProcessingJobName,
    ProcessingResources: ProcessingResources,
    RoleArn: RoleArn
  ): CreateProcessingJobRequest = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessingJobRequest]
  }
  
  @scala.inline
  implicit class CreateProcessingJobRequestMutableBuilder[Self <: CreateProcessingJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: ProcessingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    @scala.inline
    def setProcessingInputs(value: ProcessingInputs): Self = StObject.set(x, "ProcessingInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingInputsUndefined: Self = StObject.set(x, "ProcessingInputs", js.undefined)
    
    @scala.inline
    def setProcessingInputsVarargs(value: ProcessingInput*): Self = StObject.set(x, "ProcessingInputs", js.Array(value :_*))
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    @scala.inline
    def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
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
  }
}
