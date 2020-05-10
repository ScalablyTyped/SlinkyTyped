package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHyperParameterTuningJobRequest extends js.Object {
  /**
    * The HyperParameterTuningJobConfig object that describes the tuning job, including the search strategy, the objective metric used to evaluate training jobs, ranges of parameters to search, and resource limits for the tuning job. For more information, see automatic-model-tuning 
    */
  var HyperParameterTuningJobConfig: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobConfig = js.native
  /**
    * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job launches. The name must be unique within the same AWS account and AWS Region. The name must have { } to { } characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % - (hyphen). The name is not case sensitive.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  /**
    * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. For more information, see AWS Tagging Strategies. Tags that you specify for the tuning job are also added to all training jobs that the tuning job launches.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The HyperParameterTrainingJobDefinition object that describes the training jobs that this tuning job launches, including static hyperparameters, input data configuration, output data configuration, resource configuration, and stopping condition.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.native
  /**
    * 
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.native
  /**
    * Specifies the configuration for starting the hyperparameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job. All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric. If you specify IDENTICAL_DATA_AND_ALGORITHM as the WarmStartType value for the warm start configuration, the training job that performs the best in the new tuning job is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.  All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job. 
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.native
}

object CreateHyperParameterTuningJobRequest {
  @scala.inline
  def apply(
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName
  ): CreateHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHyperParameterTuningJobRequest]
  }
  @scala.inline
  implicit class CreateHyperParameterTuningJobRequestOps[Self <: CreateHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

