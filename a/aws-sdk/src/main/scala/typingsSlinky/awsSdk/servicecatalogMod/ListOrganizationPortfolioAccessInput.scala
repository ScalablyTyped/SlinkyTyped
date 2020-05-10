package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationPortfolioAccessInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The organization node type that will be returned in the output.    ORGANIZATION - Organization that has access to the portfolio.     ORGANIZATIONAL_UNIT - Organizational unit that has access to the portfolio within your organization.    ACCOUNT - Account that has access to the portfolio within your organization.  
    */
  var OrganizationNodeType: typingsSlinky.awsSdk.servicecatalogMod.OrganizationNodeType = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The portfolio identifier. For example, port-2abcdext3y5fk.
    */
  var PortfolioId: Id = js.native
}

object ListOrganizationPortfolioAccessInput {
  @scala.inline
  def apply(OrganizationNodeType: OrganizationNodeType, PortfolioId: Id): ListOrganizationPortfolioAccessInput = {
    val __obj = js.Dynamic.literal(OrganizationNodeType = OrganizationNodeType.asInstanceOf[js.Any], PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationPortfolioAccessInput]
  }
  @scala.inline
  implicit class ListOrganizationPortfolioAccessInputOps[Self <: ListOrganizationPortfolioAccessInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationNodeType(value: OrganizationNodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortfolioId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortfolioId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageToken")(js.undefined)
        ret
    }
  }
  
}

