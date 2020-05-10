package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.native
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.native
}

object Algorithm {
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAlgorithmImage(value: AlgorithmImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHyperParameterRanges(value: DefaultHyperParameterRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHyperParameterRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHyperParameterRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHyperParameterRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHyperParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultResourceConfig(value: ResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResourceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingInputMode(value: TrainingInputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInputMode")(js.undefined)
        ret
    }
  }
  
}

