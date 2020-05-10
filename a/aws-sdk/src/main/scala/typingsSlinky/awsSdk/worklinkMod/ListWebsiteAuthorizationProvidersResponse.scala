package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteAuthorizationProvidersResponse extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.NextToken] = js.native
  /**
    * The website authorization providers.
    */
  var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.native
}

object ListWebsiteAuthorizationProvidersResponse {
  @scala.inline
  def apply(): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
  @scala.inline
  implicit class ListWebsiteAuthorizationProvidersResponseOps[Self <: ListWebsiteAuthorizationProvidersResponse] (val x: Self) extends AnyVal {
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
    def withWebsiteAuthorizationProviders(value: WebsiteAuthorizationProvidersSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteAuthorizationProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteAuthorizationProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteAuthorizationProviders")(js.undefined)
        ret
    }
  }
  
}

