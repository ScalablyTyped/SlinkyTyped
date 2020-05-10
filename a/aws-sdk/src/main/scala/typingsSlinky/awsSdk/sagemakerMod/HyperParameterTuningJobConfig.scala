package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobObjective] = js.native
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ParameterRanges] = js.native
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: typingsSlinky.awsSdk.sagemakerMod.ResourceLimits = js.native
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. To use the Bayesian search strategy, set this to Bayesian. To randomly search, set it to Random. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobEarlyStoppingType] = js.native
  /**
    * The tuning job's completion criteria.
    */
  var TuningJobCompletionCriteria: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TuningJobCompletionCriteria] = js.native
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(ResourceLimits: ResourceLimits, Strategy: HyperParameterTuningJobStrategyType): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(ResourceLimits = ResourceLimits.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  @scala.inline
  implicit class HyperParameterTuningJobConfigOps[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceLimits(value: ResourceLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategy(value: HyperParameterTuningJobStrategyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperParameterTuningJobObjective(value: HyperParameterTuningJobObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameterTuningJobObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterRanges(value: ParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingJobEarlyStoppingType(value: TrainingJobEarlyStoppingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobEarlyStoppingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingJobEarlyStoppingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobEarlyStoppingType")(js.undefined)
        ret
    }
    @scala.inline
    def withTuningJobCompletionCriteria(value: TuningJobCompletionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobCompletionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuningJobCompletionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TuningJobCompletionCriteria")(js.undefined)
        ret
    }
  }
  
}

