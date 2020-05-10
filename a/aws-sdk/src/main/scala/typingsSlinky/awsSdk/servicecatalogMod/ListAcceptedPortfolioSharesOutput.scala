package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAcceptedPortfolioSharesOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetails] = js.native
}

object ListAcceptedPortfolioSharesOutput {
  @scala.inline
  def apply(): ListAcceptedPortfolioSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceptedPortfolioSharesOutput]
  }
  @scala.inline
  implicit class ListAcceptedPortfolioSharesOutputOps[Self <: ListAcceptedPortfolioSharesOutput] (val x: Self) extends AnyVal {
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
    def withPortfolioDetails(value: PortfolioDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioDetails")(js.undefined)
        ret
    }
  }
  
}

