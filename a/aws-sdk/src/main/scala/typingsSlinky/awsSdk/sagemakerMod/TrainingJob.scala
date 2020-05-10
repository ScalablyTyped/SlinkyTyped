package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJob extends js.Object {
  /**
    * Information about the algorithm used for training, and algorithm metadata.
    */
  var AlgorithmSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AlgorithmSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var AutoMLJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * The billable time in seconds.
    */
  var BillableTimeInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.BillableTimeInSeconds] = js.native
  var CheckpointConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CheckpointConfig] = js.native
  /**
    * A timestamp that indicates when the training job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  var DebugHookConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DebugHookConfig] = js.native
  /**
    * Information about the debug rule configuration.
    */
  var DebugRuleConfigurations: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DebugRuleConfigurations] = js.native
  /**
    * Information about the evaluation status of the rules for the training job.
    */
  var DebugRuleEvaluationStatuses: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DebugRuleEvaluationStatuses] = js.native
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.native
  /**
    * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of on-demand instances. For more information, see model-managed-spot-training.
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.native
  /**
    * If the TrainingJob was created with network isolation, the value is set to true. If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * If the training job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * A list of final metric values that are set when the training job completes. Used only if the training job was configured to use metrics.
    */
  var FinalMetricDataList: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FinalMetricDataList] = js.native
  /**
    * Algorithm-specific parameters.
    */
  var HyperParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameters] = js.native
  /**
    * An array of Channel objects that describes each data input channel.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InputDataConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobArn] = js.native
  /**
    * A timestamp that indicates when the status of the training job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the Amazon S3 location that is configured for storing model artifacts.
    */
  var ModelArtifacts: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ModelArtifacts] = js.native
  /**
    * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts.
    */
  var OutputDataConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.OutputDataConfig] = js.native
  /**
    * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
    */
  var ResourceConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResourceConfig] = js.native
  /**
    * The AWS Identity and Access Management (IAM) role configured for the training job.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    *  Provides detailed information about the state of the training job. For detailed information about the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var SecondaryStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecondaryStatus] = js.native
  /**
    * A history of all of the secondary statuses that the training job has transitioned through.
    */
  var SecondaryStatusTransitions: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecondaryStatusTransitions] = js.native
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.StoppingCondition] = js.native
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  var TensorBoardOutputConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TensorBoardOutputConfig] = js.native
  /**
    * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn] = js.native
  /**
    * The name of the training job.
    */
  var TrainingJobName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobName] = js.native
  /**
    * The status of the training job. Training job statuses are:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
    */
  var TrainingJobStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatus] = js.native
  /**
    * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The training time in seconds.
    */
  var TrainingTimeInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingTimeInSeconds] = js.native
  /**
    * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
    */
  var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.native
  /**
    * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}

object TrainingJob {
  @scala.inline
  def apply(): TrainingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJob]
  }
  @scala.inline
  implicit class TrainingJobOps[Self <: TrainingJob] (val x: Self) extends AnyVal {
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
    def withoutAlgorithmSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLJobArn(value: AutoMLJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBillableTimeInSeconds(value: BillableTimeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillableTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillableTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillableTimeInSeconds")(js.undefined)
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
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withDebugRuleEvaluationStatuses(value: DebugRuleEvaluationStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugRuleEvaluationStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugRuleEvaluationStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugRuleEvaluationStatuses")(js.undefined)
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
    def withFinalMetricDataList(value: FinalMetricDataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalMetricDataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalMetricDataList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalMetricDataList")(js.undefined)
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
    def withLabelingJobArn(value: LabelingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobArn")(js.undefined)
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
    def withModelArtifacts(value: ModelArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: OutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDataConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceConfig(value: ResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryStatus(value: SecondaryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryStatusTransitions(value: SecondaryStatusTransitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryStatusTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryStatusTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryStatusTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppingCondition(value: StoppingCondition): Self = {
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
    @scala.inline
    def withTrainingJobArn(value: TrainingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJobName(value: TrainingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJobStatus(value: TrainingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingTimeInSeconds(value: TrainingTimeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingTimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTuningJobArn(value: HyperParameterTuningJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuningJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobArn")(js.undefined)
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

