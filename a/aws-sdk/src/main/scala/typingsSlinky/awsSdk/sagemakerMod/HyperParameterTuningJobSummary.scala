package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobSummary extends js.Object {
  /**
    * The date and time that the tuning job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * The status of the tuning job.
    */
  var HyperParameterTuningJobStatus: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  /**
    * The date and time that the tuning job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
    */
  var ResourceLimits: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResourceLimits] = js.native
  /**
    * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  /**
    * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
}

object HyperParameterTuningJobSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): HyperParameterTuningJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobSummary]
  }
  @scala.inline
  implicit class HyperParameterTuningJobSummaryOps[Self <: HyperParameterTuningJobSummary] (val x: Self) extends AnyVal {
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
    def withStrategy(value: HyperParameterTuningJobStrategyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobStatusCounters")(value.asInstanceOf[js.Any])
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
    def withResourceLimits(value: ResourceLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLimits")(js.undefined)
        ret
    }
  }
  
}

