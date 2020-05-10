package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionConfig extends js.Object {
  /**
    * Lists the hyperparameter names and ranges.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
    */
  var autoMLConfig: js.UndefOr[AutoMLConfig] = js.native
  /**
    * Only events with a value greater than or equal to this threshold are used for training a model.
    */
  var eventValueThreshold: js.UndefOr[EventValueThreshold] = js.native
  /**
    * Lists the feature transformation parameters.
    */
  var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.native
  /**
    * Describes the properties for hyperparameter optimization (HPO).
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.native
}

object SolutionConfig {
  @scala.inline
  def apply(): SolutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionConfig]
  }
  @scala.inline
  implicit class SolutionConfigOps[Self <: SolutionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmHyperParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLConfig(value: AutoMLConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMLConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMLConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEventValueThreshold(value: EventValueThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventValueThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventValueThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventValueThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureTransformationParameters(value: FeatureTransformationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTransformationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureTransformationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTransformationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withHpoConfig(value: HPOConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHpoConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpoConfig")(js.undefined)
        ret
    }
  }
  
}

