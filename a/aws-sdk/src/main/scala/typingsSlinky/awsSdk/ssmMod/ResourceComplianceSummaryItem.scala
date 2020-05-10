package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceComplianceSummaryItem extends js.Object {
  /**
    * The compliance type.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A list of items that are compliant for the resource.
    */
  var CompliantSummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CompliantSummary] = js.native
  /**
    * Information about the execution.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.native
  /**
    * A list of items that aren't compliant for the resource.
    */
  var NonCompliantSummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NonCompliantSummary] = js.native
  /**
    * The highest severity item found for the resource. The resource is compliant for this item.
    */
  var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.native
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.native
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.native
  /**
    * The compliance status for the resource.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
}

object ResourceComplianceSummaryItem {
  @scala.inline
  def apply(): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
  @scala.inline
  implicit class ResourceComplianceSummaryItemOps[Self <: ResourceComplianceSummaryItem] (val x: Self) extends AnyVal {
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
    def withCompliantSummary(value: CompliantSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantSummary")(js.undefined)
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
    def withNonCompliantSummary(value: NonCompliantSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withOverallSeverity(value: ComplianceSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallSeverity")(js.undefined)
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
  }
  
}

