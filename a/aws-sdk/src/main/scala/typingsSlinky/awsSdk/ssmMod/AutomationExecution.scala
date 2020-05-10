package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationExecution extends js.Object {
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionId] = js.native
  /**
    * The execution status of the Automation.
    */
  var AutomationExecutionStatus: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionStatus] = js.native
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.native
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.native
  /**
    * The name of the Automation document used during the execution.
    */
  var DocumentName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentName] = js.native
  /**
    * The version of the document to use during execution.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who ran the automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.native
  /**
    * The time the execution finished.
    */
  var ExecutionEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[js.Date] = js.native
  /**
    * A message describing why an execution has failed, if the status is set to Failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * The MaxConcurrency value specified by the user when the execution started.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The MaxErrors value specified by the user when the execution started.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  /**
    * The list of execution outputs as defined in the automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The key-value map of execution parameters, which were supplied when calling StartAutomationExecution.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The AutomationExecutionId of the parent automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.native
  /**
    * An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.
    */
  var ProgressCounters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ProgressCounters] = js.native
  /**
    * A list of resolved targets in the rate control execution.
    */
  var ResolvedTargets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResolvedTargets] = js.native
  /**
    * A list of details about the current state of all steps that comprise an execution. An Automation document contains a list of steps that are run in order.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.native
  /**
    * A boolean value that indicates if the response contains the full list of the Automation step executions. If true, use the DescribeAutomationStepExecutions API action to get the full list of step executions.
    */
  var StepExecutionsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * The target of the execution.
    */
  var Target: js.UndefOr[String] = js.native
  /**
    * The combination of AWS Regions and/or AWS accounts where you want to run the Automation.
    */
  var TargetLocations: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetLocations] = js.native
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetMaps] = js.native
  /**
    * The parameter name.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  /**
    * The specified targets.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}

object AutomationExecution {
  @scala.inline
  def apply(): AutomationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecution]
  }
  @scala.inline
  implicit class AutomationExecutionOps[Self <: AutomationExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationExecutionId(value: AutomationExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomationExecutionStatus(value: AutomationExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationExecutionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentAction")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentVersion(value: DocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedBy")(js.undefined)
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
    def withMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: MaxErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ExecutionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
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
    def withParameters(value: AutomationParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParentAutomationExecutionId(value: AutomationExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentAutomationExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentAutomationExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentAutomationExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCounters(value: ProgressCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressCounters")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedTargets(value: ResolvedTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withStepExecutions(value: StepExecutionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withStepExecutionsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutionsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepExecutionsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepExecutionsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLocations(value: TargetLocations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetMaps(value: TargetMaps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetParameterName(value: AutomationParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetParameterName")(js.undefined)
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
  }
  
}

