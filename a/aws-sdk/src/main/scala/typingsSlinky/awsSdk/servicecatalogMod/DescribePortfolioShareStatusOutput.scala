package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortfolioShareStatusOutput extends js.Object {
  /**
    * Organization node identifier. It can be either account id, organizational unit id or organization id.
    */
  var OrganizationNodeValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OrganizationNodeValue] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  /**
    * The token for the portfolio share operation. For example, share-6v24abcdefghi.
    */
  var PortfolioShareToken: js.UndefOr[Id] = js.native
  /**
    * Information about the portfolio share operation.
    */
  var ShareDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ShareDetails] = js.native
  /**
    * Status of the portfolio share operation.
    */
  var Status: js.UndefOr[ShareStatus] = js.native
}

object DescribePortfolioShareStatusOutput {
  @scala.inline
  def apply(): DescribePortfolioShareStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
  }
  @scala.inline
  implicit class DescribePortfolioShareStatusOutputOps[Self <: DescribePortfolioShareStatusOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationNodeValue(value: OrganizationNodeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationNodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationNodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationNodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(js.undefined)
        ret
    }
    @scala.inline
    def withPortfolioShareToken(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioShareToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortfolioShareToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioShareToken")(js.undefined)
        ret
    }
    @scala.inline
    def withShareDetails(value: ShareDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

