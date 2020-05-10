package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationPortfolioAccessOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OrganizationNodes] = js.native
}

object ListOrganizationPortfolioAccessOutput {
  @scala.inline
  def apply(): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
  @scala.inline
  implicit class ListOrganizationPortfolioAccessOutputOps[Self <: ListOrganizationPortfolioAccessOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationNodes(value: OrganizationNodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationNodes")(js.undefined)
        ret
    }
  }
  
}

