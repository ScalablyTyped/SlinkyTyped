package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePackStatusesRequest extends js.Object {
  /**
    * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100. 
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The names of organization conformance packs for which you want status details. If you do not specify any names, AWS Config returns details for all your organization conformance packs. 
    */
  var OrganizationConformancePackNames: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackNames] = js.native
}

object DescribeOrganizationConformancePackStatusesRequest {
  @scala.inline
  def apply(): DescribeOrganizationConformancePackStatusesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesRequest]
  }
  @scala.inline
  implicit class DescribeOrganizationConformancePackStatusesRequestOps[Self <: DescribeOrganizationConformancePackStatusesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withOrganizationConformancePackNames(value: OrganizationConformancePackNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationConformancePackNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackNames")(js.undefined)
        ret
    }
  }
  
}

