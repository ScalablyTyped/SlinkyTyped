package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceItem extends js.Object {
  /**
    * The compliance type. For example, Association (for a State Manager association), Patch, or Custom:string are all valid compliance types.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A "Key": "Value" tag combination for the compliance item.
    */
  var Details: js.UndefOr[ComplianceItemDetails] = js.native
  /**
    * A summary for the compliance item. The summary includes an execution ID, the execution type (for example, command), and the execution time.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  /**
    * An ID for the compliance item. For example, if the compliance item is a Windows patch, the ID could be the number of the KB article; for example: KB4010320.
    */
  var Id: js.UndefOr[ComplianceItemId] = js.native
  /**
    * An ID for the resource. For a managed instance, this is the instance ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  /**
    * The type of resource. ManagedInstance is currently the only supported resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  /**
    * The severity of the compliance status. Severity can be one of the following: Critical, High, Medium, Low, Informational, Unspecified.
    */
  var Severity: js.UndefOr[ComplianceSeverity] = js.native
  /**
    * The status of the compliance item. An item is either COMPLIANT or NON_COMPLIANT.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
  /**
    * A title for the compliance item. For example, if the compliance item is a Windows patch, the title could be the title of the KB article for the patch; for example: Security Update for Active Directory Federation Services.
    */
  var Title: js.UndefOr[ComplianceItemTitle] = js.native
}

object ComplianceItem {
  @scala.inline
  def apply(): ComplianceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceItem]
  }
  @scala.inline
  implicit class ComplianceItemOps[Self <: ComplianceItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceType(value: ComplianceTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: ComplianceItemDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionSummary(value: ComplianceExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ComplianceItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: ComplianceResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ComplianceResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: ComplianceSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ComplianceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ComplianceItemTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

