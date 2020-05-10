package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummaryByResourceType extends js.Object {
  /**
    * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  var ComplianceSummary: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceSummary] = js.native
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ComplianceSummaryByResourceType {
  @scala.inline
  def apply(): ComplianceSummaryByResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummaryByResourceType]
  }
  @scala.inline
  implicit class ComplianceSummaryByResourceTypeOps[Self <: ComplianceSummaryByResourceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceSummary(value: ComplianceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
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
  }
  
}

