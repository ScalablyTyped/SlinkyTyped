package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends js.Object {
  /** The objective value at this training step. */
  var objectiveValue: js.UndefOr[Double] = js.native
  /** The global training step for this metric. */
  var trainingStep: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterOutputHyperparameterMetricOps[Self <: GoogleCloudMlV1HyperparameterOutputHyperparameterMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectiveValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectiveValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectiveValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingStep")(js.undefined)
        ret
    }
  }
  
}

