package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortfolioOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * Information about the portfolio.
    */
  var PortfolioDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetail] = js.native
  /**
    * Information about the TagOptions associated with the portfolio.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  /**
    * Information about the tags associated with the portfolio.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object DescribePortfolioOutput {
  @scala.inline
  def apply(): DescribePortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioOutput]
  }
  @scala.inline
  implicit class DescribePortfolioOutputOps[Self <: DescribePortfolioOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgets(value: Budgets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(js.undefined)
        ret
    }
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
    def withTagOptions(value: TagOptionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(js.undefined)
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

