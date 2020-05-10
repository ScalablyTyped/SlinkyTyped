package typingsSlinky.gapiClientMl.gapi.client.ml

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterOutput extends js.Object {
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  /** The final objective metric seen for this trial. */
  var finalMetric: js.UndefOr[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  /** The hyperparameters given to this trial. */
  var hyperparameters: js.UndefOr[Record[String, String]] = js.native
  /** The trial id for these results. */
  var trialId: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1HyperparameterOutput {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputOps[Self <: GoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllMetrics(value: js.Array[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalMetric(value: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperparameters(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperparameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialId")(js.undefined)
        ret
    }
  }
  
}

