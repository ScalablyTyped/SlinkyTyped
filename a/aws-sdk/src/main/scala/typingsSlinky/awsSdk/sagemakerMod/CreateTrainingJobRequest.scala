package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrainingJobRequest extends js.Object {
  /**
    * The registry path of the Docker image that contains the training algorithm and algorithm-specific metadata, including the input mode. For more information about algorithms provided by Amazon SageMaker, see Algorithms. For information about providing your own algorithms, see Using Your Own Algorithms with Amazon SageMaker. 
    */
  var AlgorithmSpecification: typingsSlinky.awsSdk.sagemakerMod.AlgorithmSpecification = js.native
  /**
    * Contains information about the output location for managed spot training checkpoint data.
    */
  var CheckpointConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CheckpointConfig] = js.native
  var DebugHookConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DebugHookConfig] = js.native
  /**
    * Configuration information for debugging rules.
    */
  var DebugRuleConfigurations: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DebugRuleConfigurations] = js.native
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training. For more information, see Protect Communications Between ML Compute Instances in a Distributed Training Job.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * To train models using managed spot training, choose True. Managed spot training provides a fully managed and scalable infrastructure for training machine learning models. this option is useful when training jobs can be interrupted and when there is flexibility when the training job is run.  The complete and intermediate results of jobs are stored in an Amazon S3 bucket, and can be used as a starting point to train models incrementally. Amazon SageMaker provides metrics and logs in CloudWatch. They can be used to see when managed spot training jobs are running, interrupted, resumed, or completed. 
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.native
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If you enable network isolation for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * Algorithm-specific parameters that influence the quality of the model. You set hyperparameters before you start the learning process. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.  You can specify a maximum of 100 hyperparameters. Each hyperparameter is a key-value pair. Each key and value is limited to 256 characters, as specified by the Length Constraint. 
    */
  var HyperParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameters] = js.native
  /**
    * An array of Channel objects. Each channel is a named input source. InputDataConfig describes the input data and its location.  Algorithms can accept input data from one or more channels. For example, an algorithm might have two channels of input data, training_data and validation_data. The configuration for each channel provides the S3, EFS, or FSx location where the input data is stored. It also provides information about the stored data: the MIME type, compression method, and whether the data is wrapped in RecordIO format.  Depending on the input mode that the algorithm supports, Amazon SageMaker either copies input data files from an S3 bucket to a local directory in the Docker container, or makes it available as input streams. For example, if you specify an EFS location, input data files will be made available as input streams. They do not need to be downloaded.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InputDataConfig] = js.native
  /**
    * Specifies the path to the S3 location where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts. 
    */
  var OutputDataConfig: typingsSlinky.awsSdk.sagemakerMod.OutputDataConfig = js.native
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use ML storage volumes for scratch space. If you want Amazon SageMaker to use the ML storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
    */
  var ResourceConfig: typingsSlinky.awsSdk.sagemakerMod.ResourceConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.  During model training, Amazon SageMaker needs your permission to read input data from an S3 bucket, download a Docker image that contains training code, write model artifacts to an S3 bucket, write logs to Amazon CloudWatch Logs, and publish metrics to Amazon CloudWatch. You grant permissions for all of these tasks to an IAM role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: typingsSlinky.awsSdk.sagemakerMod.StoppingCondition = js.native
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  var TensorBoardOutputConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TensorBoardOutputConfig] = js.native
  /**
    * The name of the training job. The name must be unique within an AWS Region in an AWS account. 
    */
  var TrainingJobName: typingsSlinky.awsSdk.sagemakerMod.TrainingJobName = js.native
  /**
    * A VpcConfig object that specifies the VPC that you want your training job to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object CreateTrainingJobRequest {
  @scala.inline
  def apply(
    AlgorithmSpecification: AlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition,
    TrainingJobName: TrainingJobName
  ): CreateTrainingJobRequest = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingJobRequest]
  }
  @scala.inline
  implicit class CreateTrainingJobRequestOps[Self <: CreateTrainingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmSpecification(value: AlgorithmSpecification): Self = {
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
    def withTrainingJobName(value: TrainingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(value.asInstanceOf[js.Any])
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
    def withDebugHookConfig(value: DebugHookConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugHookConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugHookConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugHookConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugRuleConfigurations(value: DebugRuleConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugRuleConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugRuleConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugRuleConfigurations")(js.undefined)
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
    def withHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameters")(js.undefined)
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
    @scala.inline
    def withTensorBoardOutputConfig(value: TensorBoardOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TensorBoardOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorBoardOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TensorBoardOutputConfig")(js.undefined)
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

