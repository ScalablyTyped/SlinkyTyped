package typingsSlinky.cucumber.cucumberMod.events

import typingsSlinky.cucumber.cucumberMod.Status
import typingsSlinky.cucumber.cucumberMod.Step
import typingsSlinky.cucumber.cucumberMod.StepDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepResultPayload extends EventPayload {
  var ambiguousStepDefinitions: js.Any
  var attachments: js.Array[_]
  var duration: js.Any
  var failureException: js.Error
  var status: Status
  var step: Step
  var stepDefinition: StepDefinition
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
}

