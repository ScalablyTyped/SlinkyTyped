package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortfolioOutput extends js.Object {
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetail] = js.native
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object UpdatePortfolioOutput {
  @scala.inline
  def apply(): UpdatePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePortfolioOutput]
  }
  @scala.inline
  implicit class UpdatePortfolioOutputOps[Self <: UpdatePortfolioOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortfolioDetail(value: PortfolioDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

