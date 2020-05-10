package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
  /**
    * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an AWS resource type such as AWS::EC2::Instance. You can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceTypes: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceTypes] = js.native
}

object GetComplianceSummaryByResourceTypeRequest {
  @scala.inline
  def apply(): GetComplianceSummaryByResourceTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
  }
  @scala.inline
  implicit class GetComplianceSummaryByResourceTypeRequestOps[Self <: GetComplianceSummaryByResourceTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceTypes(value: ResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(js.undefined)
        ret
    }
  }
  
}

