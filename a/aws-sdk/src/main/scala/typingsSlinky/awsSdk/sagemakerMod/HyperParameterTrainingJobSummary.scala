package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTrainingJobSummary extends js.Object {
  /**
    * The date and time that the training job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The reason that the training job failed. 
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The FinalHyperParameterTuningJobObjectiveMetric object that specifies the value of the objective metric of the tuning job that launched this training job.
    */
  var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FinalHyperParameterTuningJobObjectiveMetric] = js.native
  /**
    * The status of the objective metric for the training job:   Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.     Pending: The training job is in progress and evaluation of its final objective metric is pending.     Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.  
    */
  var ObjectiveStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatus] = js.native
  /**
    * Specifies the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn = js.native
  /**
    * The training job definition name.
    */
  var TrainingJobDefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.native
  /**
    * The name of the training job.
    */
  var TrainingJobName: typingsSlinky.awsSdk.sagemakerMod.TrainingJobName = js.native
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatus = js.native
  /**
    * The date and time that the training job started.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of the hyperparameters for which you specified ranges to search.
    */
  var TunedHyperParameters: HyperParameters = js.native
  /**
    * The HyperParameter tuning job that launched the training job.
    */
  var TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.native
}

object HyperParameterTrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    TunedHyperParameters: HyperParameters
  ): HyperParameterTrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any], TunedHyperParameters = TunedHyperParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobSummary]
  }
  @scala.inline
  implicit class HyperParameterTrainingJobSummaryOps[Self <: HyperParameterTrainingJobSummary] (val x: Self) extends AnyVal {
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
    def withTrainingJobArn(value: TrainingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobName(value: TrainingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobStatus(value: TrainingJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTunedHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TunedHyperParameters")(value.asInstanceOf[js.Any])
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
    def withFinalHyperParameterTuningJobObjectiveMetric(value: FinalHyperParameterTuningJobObjectiveMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalHyperParameterTuningJobObjectiveMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectiveStatus(value: ObjectiveStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectiveStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectiveStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectiveStatus")(js.undefined)
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
    def withTrainingJobDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobDefinitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobDefinitionName")(js.undefined)
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
    def withTuningJobName(value: HyperParameterTuningJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuningJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobName")(js.undefined)
        ret
    }
  }
  
}

