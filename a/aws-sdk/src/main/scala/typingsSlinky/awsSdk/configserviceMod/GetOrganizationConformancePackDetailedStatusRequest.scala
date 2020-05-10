package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationConformancePackDetailedStatusRequest extends js.Object {
  /**
    * An OrganizationResourceDetailedStatusFilters object.
    */
  var Filters: js.UndefOr[OrganizationResourceDetailedStatusFilters] = js.native
  /**
    * The maximum number of OrganizationConformancePackDetailedStatuses returned on each page. If you do not specify a number, AWS Config uses the default. The default is 100. 
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of organization conformance pack for which you want status details for member accounts.
    */
  var OrganizationConformancePackName: typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
}

object GetOrganizationConformancePackDetailedStatusRequest {
  @scala.inline
  def apply(OrganizationConformancePackName: OrganizationConformancePackName): GetOrganizationConformancePackDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusRequest]
  }
  @scala.inline
  implicit class GetOrganizationConformancePackDetailedStatusRequestOps[Self <: GetOrganizationConformancePackDetailedStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationConformancePackName(value: OrganizationConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: OrganizationResourceDetailedStatusFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: CosmosPageLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
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

