package typingsSlinky.cucumber.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturesResultPayload extends EventPayload {
  var duration: Double = js.native
  var scenarioResults: js.Array[_] = js.native
  var stepsResults: js.Array[_] = js.native
  var strict: Boolean = js.native
  var success: Boolean = js.native
}

object FeaturesResultPayload {
  @scala.inline
  def apply(
    duration: Double,
    scenarioResults: js.Array[_],
    stepsResults: js.Array[_],
    strict: Boolean,
    success: Boolean
  ): FeaturesResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scenarioResults = scenarioResults.asInstanceOf[js.Any], stepsResults = stepsResults.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesResultPayload]
  }
  @scala.inline
  implicit class FeaturesResultPayloadOps[Self <: FeaturesResultPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenarioResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenarioResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepsResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

