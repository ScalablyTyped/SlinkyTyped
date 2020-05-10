package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProcessingJobRequest extends js.Object {
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
  implicit class CreateProcessingJobRequestOps[Self <: CreateProcessingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppSpecification(value: AppSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobName(value: ProcessingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingResources(value: ProcessingResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: ProcessingEnvironmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentConfig(value: ExperimentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfig(value: NetworkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingInputs(value: ProcessingInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingOutputConfig(value: ProcessingOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingOutputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppingCondition(value: ProcessingStoppingCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppingCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

