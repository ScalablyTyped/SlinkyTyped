package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoMLJobRequest extends js.Object {
  /**
    * Contains CompletionCriteria and SecurityConfig.
    */
  var AutoMLJobConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  /**
    * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not provided, the most commonly used ObjectiveMetric for problem type will be selected.
    */
  var AutoMLJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  /**
    * This will generate possible candidates without training a model. A candidate is a combination of data preprocessors, algorithms, and algorithm parameter settings.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  /**
    * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  /**
    * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  /**
    * Defines the kind of preprocessing and algorithms intended for the candidates. Options include: BinaryClassification, MulticlassClassification, and Regression.
    */
  var ProblemType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProblemType] = js.native
  /**
    * The ARN of the role that will be used to access the data.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateAutoMLJobRequest {
  @scala.inline
  def apply(
    AutoMLJobName: AutoMLJobName,
    InputDataConfig: AutoMLInputDataConfig,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): CreateAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobRequest]
  }
  @scala.inline
  implicit class CreateAutoMLJobRequestOps[Self <: CreateAutoMLJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLJobName(value: AutoMLJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDataConfig(value: AutoMLInputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: AutoMLOutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobConfig(value: AutoMLJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLJobObjective(value: AutoMLJobObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateCandidateDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateCandidateDefinitionsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateCandidateDefinitionsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withProblemType(value: ProblemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(js.undefined)
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

