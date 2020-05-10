package typingsSlinky.cucumber.mod.events

import typingsSlinky.cucumber.mod.Scenario
import typingsSlinky.cucumber.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioResultPayload extends EventPayload {
  var duration: js.Any = js.native
  var failureException: js.Error = js.native
  var scenario: Scenario = js.native
  var status: Status = js.native
  var stepResults: js.Array[_] = js.native
}

object ScenarioResultPayload {
  @scala.inline
  def apply(
    duration: js.Any,
    failureException: js.Error,
    scenario: Scenario,
    status: Status,
    stepResults: js.Array[_]
  ): ScenarioResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failureException = failureException.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioResultPayload]
  }
  @scala.inline
  implicit class ScenarioResultPayloadOps[Self <: ScenarioResultPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureException(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenario(value: Scenario): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenario")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

