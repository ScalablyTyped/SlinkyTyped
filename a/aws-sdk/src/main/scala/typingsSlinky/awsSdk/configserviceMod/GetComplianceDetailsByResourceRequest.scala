package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailsByResourceRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceTypes] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS resource for which you want compliance information.
    */
  var ResourceId: BaseResourceId = js.native
  /**
    * The type of the AWS resource for which you want compliance information.
    */
  var ResourceType: StringWithCharLimit256 = js.native
}

object GetComplianceDetailsByResourceRequest {
  @scala.inline
  def apply(ResourceId: BaseResourceId, ResourceType: StringWithCharLimit256): GetComplianceDetailsByResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
  }
  @scala.inline
  implicit class GetComplianceDetailsByResourceRequestOps[Self <: GetComplianceDetailsByResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: BaseResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplianceTypes(value: ComplianceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

