package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePackStatusesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OrganizationConformancePackStatus objects. 
    */
  var OrganizationConformancePackStatuses: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackStatuses] = js.native
}

object DescribeOrganizationConformancePackStatusesResponse {
  @scala.inline
  def apply(): DescribeOrganizationConformancePackStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationConformancePackStatusesResponseOps[Self <: DescribeOrganizationConformancePackStatusesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOrganizationConformancePackStatuses(value: OrganizationConformancePackStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationConformancePackStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackStatuses")(js.undefined)
        ret
    }
  }
  
}

