package typingsSlinky.cucumber.mod.events

import typingsSlinky.cucumber.mod.Status
import typingsSlinky.cucumber.mod.Step
import typingsSlinky.cucumber.mod.StepDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmbiguousStepDefinitions(value: js.Any): Self = this.set("ambiguousStepDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: js.Any*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureException(value: js.Error): Self = this.set("failureException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDefinition(value: StepDefinition): Self = this.set("stepDefinition", value.asInstanceOf[js.Any])
  }
}
