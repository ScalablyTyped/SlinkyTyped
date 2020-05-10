package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProcessingJobResponse extends js.Object {
  /**
    * Configures the processing job to run a specified container image.
    */
  var AppSpecification: typingsSlinky.awsSdk.sagemakerMod.AppSpecification = js.native
  /**
    * The ARN of an AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The environment variables set in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.native
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExitMessage] = js.native
  /**
    * The configuration information used to create an experiment.
    */
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The time at which the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.native
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NetworkConfig] = js.native
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The inputs for a processing job.
    */
  var ProcessingInputs: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingInputs] = js.native
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobArn = js.native
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
  /**
    * Provides the status of a processing job.
    */
  var ProcessingJobStatus: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobStatus = js.native
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProcessingOutputConfig] = js.native
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typingsSlinky.awsSdk.sagemakerMod.ProcessingResources = js.native
  /**
    * The time at which the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.native
  /**
    * The ARN of a training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn] = js.native
}

object DescribeProcessingJobResponse {
  @scala.inline
  def apply(
    AppSpecification: AppSpecification,
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus,
    ProcessingResources: ProcessingResources
  ): DescribeProcessingJobResponse = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobResponse]
  }
  @scala.inline
  implicit class DescribeProcessingJobResponseOps[Self <: DescribeProcessingJobResponse] (val x: Self) extends AnyVal {
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
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobArn(value: ProcessingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobName(value: ProcessingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingJobStatus(value: ProcessingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingResources(value: ProcessingResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingResources")(value.asInstanceOf[js.Any])
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
    def withExitMessage(value: ExitMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitMessage")(js.undefined)
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
    def withMonitoringScheduleArn(value: MonitoringScheduleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringScheduleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringScheduleArn")(js.undefined)
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
    def withProcessingEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingEndTime")(js.undefined)
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
    def withProcessingStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingStartTime")(js.undefined)
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
  }
  
}

