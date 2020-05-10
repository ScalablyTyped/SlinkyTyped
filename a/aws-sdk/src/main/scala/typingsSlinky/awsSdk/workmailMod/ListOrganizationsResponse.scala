package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
  /**
    * The overview of owned organizations presented as a list of organization summaries.
    */
  var OrganizationSummaries: js.UndefOr[typingsSlinky.awsSdk.workmailMod.OrganizationSummaries] = js.native
}

object ListOrganizationsResponse {
  @scala.inline
  def apply(): ListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationsResponse]
  }
  @scala.inline
  implicit class ListOrganizationsResponseOps[Self <: ListOrganizationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withOrganizationSummaries(value: OrganizationSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationSummaries")(js.undefined)
        ret
    }
  }
  
}

