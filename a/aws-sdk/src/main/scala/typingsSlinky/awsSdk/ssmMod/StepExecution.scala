package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepExecution extends js.Object {
  /**
    * The action this step performs. The action determines the behavior of the step.
    */
  var Action: js.UndefOr[AutomationActionName] = js.native
  /**
    * If a step has finished execution, this contains the time the execution ended. If the step has not yet concluded, this field is not populated.
    */
  var ExecutionEndTime: js.UndefOr[js.Date] = js.native
  /**
    * If a step has begun execution, this contains the time the step started. If the step is in Pending status, this field is not populated.
    */
  var ExecutionStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the Automation failure.
    */
  var FailureDetails: js.UndefOr[typingsSlinky.awsSdk.ssmMod.FailureDetails] = js.native
  /**
    * If a step failed, this message explains why the execution failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * Fully-resolved values passed into the step before execution.
    */
  var Inputs: js.UndefOr[NormalStringMap] = js.native
  /**
    * The flag which can be used to help decide whether the failure of current step leads to the Automation failure.
    */
  var IsCritical: js.UndefOr[Boolean] = js.native
  /**
    * The flag which can be used to end automation no matter whether the step succeeds or fails.
    */
  var IsEnd: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of tries to run the action of the step. The default value is 1.
    */
  var MaxAttempts: js.UndefOr[Integer] = js.native
  /**
    * The next step after the step succeeds.
    */
  var NextStep: js.UndefOr[String] = js.native
  /**
    * The action to take if the step fails. The default value is Abort.
    */
  var OnFailure: js.UndefOr[String] = js.native
  /**
    * Returned values from the execution of the step.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * A user-specified list of parameters to override when running a step.
    */
  var OverriddenParameters: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * A message associated with the response code for an execution.
    */
  var Response: js.UndefOr[String] = js.native
  /**
    * The response code returned by the execution of the step.
    */
  var ResponseCode: js.UndefOr[String] = js.native
  /**
    * The unique ID of a step execution.
    */
  var StepExecutionId: js.UndefOr[String] = js.native
  /**
    * The name of this execution step.
    */
  var StepName: js.UndefOr[String] = js.native
  /**
    * The execution status for this step.
    */
  var StepStatus: js.UndefOr[AutomationExecutionStatus] = js.native
  /**
    * The combination of AWS Regions and accounts targeted by the current Automation execution.
    */
  var TargetLocation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetLocation] = js.native
  /**
    * The targets for the step execution.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
  /**
    * The timeout seconds of the step.
    */
  var TimeoutSeconds: js.UndefOr[Long] = js.native
  /**
    * Strategies used when step fails, we support Continue and Abort. Abort will fail the automation when the step fails. Continue will ignore the failure of current step and allow automation to run the next step. With conditional branching, we add step:stepName to support the automation to go to another specific step.
    */
  var ValidNextSteps: js.UndefOr[ValidNextStepList] = js.native
}

object StepExecution {
  @scala.inline
  def apply(): StepExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepExecution]
  }
  @scala.inline
  implicit class StepExecutionOps[Self <: StepExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: AutomationActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDetails(value: FailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: NormalStringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCritical")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withNextStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextStep")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: AutomationParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOverriddenParameters(value: AutomationParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverriddenParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverriddenParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverriddenParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStepExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepName")(js.undefined)
        ret
    }
    @scala.inline
    def withStepStatus(value: AutomationExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLocation(value: TargetLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withValidNextSteps(value: ValidNextStepList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidNextSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidNextSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidNextSteps")(js.undefined)
        ret
    }
  }
  
}

