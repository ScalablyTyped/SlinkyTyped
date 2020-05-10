package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTrainingJobDefinition extends js.Object {
  /**
    * The HyperParameterAlgorithmSpecification object that specifies the resource algorithm to use for the training jobs that the tuning job launches.
    */
  var AlgorithmSpecification: HyperParameterAlgorithmSpecification = js.native
  var CheckpointConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CheckpointConfig] = js.native
  /**
    * The job definition name.
    */
  var DefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.native
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean indicating whether managed spot training is enabled (True) or not (False).
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.native
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var HyperParameterRanges: js.UndefOr[ParameterRanges] = js.native
  /**
    * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InputDataConfig] = js.native
  /**
    * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning job launches.
    */
  var OutputDataConfig: typingsSlinky.awsSdk.sagemakerMod.OutputDataConfig = js.native
  /**
    * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning job launches. Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
    */
  var ResourceConfig: typingsSlinky.awsSdk.sagemakerMod.ResourceConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies the values of hyperparameters that do not change for the tuning job.
    */
  var StaticHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker ends the training job. Use this API to cap model training costs.
    */
  var StoppingCondition: typingsSlinky.awsSdk.sagemakerMod.StoppingCondition = js.native
  var TuningObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.native
  /**
    * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object HyperParameterTrainingJobDefinition {
  @scala.inline
  def apply(
    AlgorithmSpecification: HyperParameterAlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): HyperParameterTrainingJobDefinition = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
  }
  @scala.inline
  implicit class HyperParameterTrainingJobDefinitionOps[Self <: HyperParameterTrainingJobDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmSpecification(value: HyperParameterAlgorithmSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: OutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceConfig(value: ResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppingCondition(value: StoppingCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckpointConfig(value: CheckpointConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckpointConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefinitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableInterContainerTrafficEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInterContainerTrafficEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInterContainerTrafficEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableInterContainerTrafficEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableManagedSpotTraining(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableManagedSpotTraining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableManagedSpotTraining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableManagedSpotTraining")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetworkIsolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNetworkIsolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetworkIsolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNetworkIsolation")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperParameterRanges(value: ParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDataConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticHyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticHyperParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTuningObjective(value: HyperParameterTuningJobObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuningObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

