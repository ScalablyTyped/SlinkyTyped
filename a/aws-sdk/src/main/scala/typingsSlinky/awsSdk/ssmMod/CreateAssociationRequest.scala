package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationRequest extends js.Object {
  /**
    * Specify a descriptive name for the association.
    */
  var AssociationName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationTargetParameterName] = js.native
  /**
    * The severity level to assign to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.native
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The instance ID.   InstanceId has been deprecated. To specify an instance ID for an association, use the Targets parameter. Requests that include the parameter InstanceID with SSM documents that use schema version 2.0 or later will fail. In addition, if you use the parameter InstanceId, you cannot use the parameters AssociationName, DocumentVersion, MaxErrors, MaxConcurrency, OutputLocation, or ScheduleExpression. To use these parameters, you must use the Targets parameter. 
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The name of the SSM document that contains the configuration information for the instance. You can specify Command or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:partition:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
    */
  var Name: DocumentARN = js.native
  /**
    * An Amazon S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.native
  /**
    * The parameters for the runtime configuration of the document.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameters] = js.native
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  var ScheduleExpression: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The targets (either instances or tags) for the association. You must specify a value for Targets if you don't specify a value for InstanceId.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}

object CreateAssociationRequest {
  @scala.inline
  def apply(Name: DocumentARN): CreateAssociationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationRequest]
  }
  @scala.inline
  implicit class CreateAssociationRequestOps[Self <: CreateAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: DocumentARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociationName(value: AssociationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomationTargetParameterName(value: AutomationTargetParameterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationTargetParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationTargetParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationTargetParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceSeverity(value: AssociationComplianceSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSeverity")(js.undefined)
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
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
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
    def withOutputLocation(value: InstanceAssociationOutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
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
    def withScheduleExpression(value: ScheduleExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleExpression")(js.undefined)
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

