package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
  /**
    * The number of resources that are compliant and the number that are noncompliant. If one or more resource types were provided with the request, the numbers are returned for each resource type. The maximum number returned is 100.
    */
  var ComplianceSummariesByResourceType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceSummariesByResourceType] = js.native
}

object GetComplianceSummaryByResourceTypeResponse {
  @scala.inline
  def apply(): GetComplianceSummaryByResourceTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeResponse]
  }
  @scala.inline
  implicit class GetComplianceSummaryByResourceTypeResponseOps[Self <: GetComplianceSummaryByResourceTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceSummariesByResourceType(value: ComplianceSummariesByResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummariesByResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSummariesByResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummariesByResourceType")(js.undefined)
        ret
    }
  }
  
}

