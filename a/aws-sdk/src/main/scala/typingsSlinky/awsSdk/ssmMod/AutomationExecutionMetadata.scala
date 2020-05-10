package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationExecutionMetadata extends js.Object {
  /**
    * The execution ID.
    */
  var AutomationExecutionId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionId] = js.native
  /**
    * The status of the execution.
    */
  var AutomationExecutionStatus: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionStatus] = js.native
  /**
    * Use this filter with DescribeAutomationExecutions. Specify either Local or CrossAccount. CrossAccount is an Automation that runs in multiple AWS Regions and accounts. For more information, see Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
    */
  var AutomationType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationType] = js.native
  /**
    * The action of the step that is currently running.
    */
  var CurrentAction: js.UndefOr[String] = js.native
  /**
    * The name of the step that is currently running.
    */
  var CurrentStepName: js.UndefOr[String] = js.native
  /**
    * The name of the Automation document used during execution.
    */
  var DocumentName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentName] = js.native
  /**
    * The document version used during the execution.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The IAM role ARN of the user who ran the Automation.
    */
  var ExecutedBy: js.UndefOr[String] = js.native
  /**
    * The time the execution finished. This is not populated if the execution is still in progress.
    */
  var ExecutionEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The time the execution started.
    */
  var ExecutionStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * An Amazon S3 bucket where execution information is stored.
    */
  var LogFile: js.UndefOr[String] = js.native
  /**
    * The MaxConcurrency value specified by the user when starting the Automation.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The MaxErrors value specified by the user when starting the Automation.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The Automation execution mode.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Outputs: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The ExecutionId of the parent Automation.
    */
  var ParentAutomationExecutionId: js.UndefOr[AutomationExecutionId] = js.native
  /**
    * A list of targets that resolved during the execution.
    */
  var ResolvedTargets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResolvedTargets] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var Target: js.UndefOr[String] = js.native
  /**
    * The specified key-value mapping of document parameters to target resources.
    */
  var TargetMaps: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetMaps] = js.native
  /**
    * The list of execution outputs as defined in the Automation document.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  /**
    * The targets defined by the user when starting the Automation.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}

object AutomationExecutionMetadata {
  @scala.inline
  def apply(): AutomationExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomationExecutionMetadata]
  }
  @scala.inline
  implicit class AutomationExecutionMetadataOps[Self <: AutomationExecutionMetadata] (val x: Self) extends AnyVal {
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
    def withAutomationType(value: AutomationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationType")(js.undefined)
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
    def withLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFile")(js.undefined)
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

