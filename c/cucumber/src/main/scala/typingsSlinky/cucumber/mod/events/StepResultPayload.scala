package typingsSlinky.cucumber.mod.events

import typingsSlinky.cucumber.mod.Status
import typingsSlinky.cucumber.mod.Step
import typingsSlinky.cucumber.mod.StepDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepResultPayload extends EventPayload {
  var ambiguousStepDefinitions: js.Any = js.native
  var attachments: js.Array[_] = js.native
  var duration: js.Any = js.native
  var failureException: js.Error = js.native
  var status: Status = js.native
  var step: Step = js.native
  var stepDefinition: StepDefinition = js.native
}

object StepResultPayload {
  @scala.inline
  def apply(
    ambiguousStepDefinitions: js.Any,
    attachments: js.Array[_],
    duration: js.Any,
    failureException: js.Error,
    status: Status,
    step: Step,
    stepDefinition: StepDefinition
  ): StepResultPayload = {
    val __obj = js.Dynamic.literal(ambiguousStepDefinitions = ambiguousStepDefinitions.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], failureException = failureException.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepDefinition = stepDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepResultPayload]
  }
  @scala.inline
  implicit class StepResultPayloadOps[Self <: StepResultPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbiguousStepDefinitions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousStepDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Step): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepDefinition(value: StepDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepDefinition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

