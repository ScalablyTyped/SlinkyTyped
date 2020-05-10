package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationVersionInfo extends js.Object {
  /**
    * The ID created by the system when the association was created.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The name specified for the association version when the association version was created.
    */
  var AssociationName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationName] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.native
  /**
    * The date the association version was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The version of a Systems Manager document used when the association version was created.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * The name specified when the association was created.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * The location in Amazon S3 specified for the association when the association version was created.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.native
  /**
    * Parameters specified when the association version was created.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The cron or rate schedule specified for the association when the association version was created.
    */
  var ScheduleExpression: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ScheduleExpression] = js.native
  /**
    * The targets specified for the association when the association version was created. 
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}

object AssociationVersionInfo {
  @scala.inline
  def apply(): AssociationVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationVersionInfo]
  }
  @scala.inline
  implicit class AssociationVersionInfoOps[Self <: AssociationVersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: AssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
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
    def withAssociationVersion(value: AssociationVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationVersion")(js.undefined)
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
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
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
    def withName(value: DocumentARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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

