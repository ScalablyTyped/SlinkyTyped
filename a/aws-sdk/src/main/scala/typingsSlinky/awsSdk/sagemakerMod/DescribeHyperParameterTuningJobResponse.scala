package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHyperParameterTuningJobResponse extends js.Object {
  /**
    * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
    */
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  /**
    * The date and time that the tuning job started.
    */
  var CreationTime: js.Date = js.native
  /**
    * If the tuning job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  /**
    * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
    */
  var HyperParameterTuningJobConfig: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobConfig = js.native
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
    */
  var HyperParameterTuningJobStatus: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  /**
    * The date and time that the status of the tuning job was modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  /**
    * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
    */
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  /**
    * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.native
  /**
    * 
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.native
  /**
    * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
  /**
    * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.native
}

object DescribeHyperParameterTuningJobResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
  @scala.inline
  implicit class DescribeHyperParameterTuningJobResponseOps[Self <: DescribeHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
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
    def withHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectiveStatusCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatusCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BestTrainingJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestTrainingJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BestTrainingJob")(js.undefined)
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
    def withHyperParameterTuningEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameterTuningEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningEndTime")(js.undefined)
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
    def withOverallBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallBestTrainingJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallBestTrainingJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallBestTrainingJob")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJobDefinition(value: HyperParameterTrainingJobDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJobDefinitions(value: HyperParameterTrainingJobDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmStartConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmStartConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarmStartConfig")(js.undefined)
        ret
    }
  }
  
}

