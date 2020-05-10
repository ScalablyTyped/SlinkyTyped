package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummaryItem extends js.Object {
  /**
    * The type of compliance item. For example, the compliance type can be Association, Patch, or Custom:string.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.native
  /**
    * A list of COMPLIANT items for the specified compliance type.
    */
  var CompliantSummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CompliantSummary] = js.native
  /**
    * A list of NON_COMPLIANT items for the specified compliance type.
    */
  var NonCompliantSummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NonCompliantSummary] = js.native
}

object ComplianceSummaryItem {
  @scala.inline
  def apply(): ComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryItem]
  }
  @scala.inline
  implicit class ComplianceSummaryItemOps[Self <: ComplianceSummaryItem] (val x: Self) extends AnyVal {
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
  }
  
}

