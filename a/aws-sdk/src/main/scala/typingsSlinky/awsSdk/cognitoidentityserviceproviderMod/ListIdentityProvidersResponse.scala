package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityProvidersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * A list of identity provider objects.
    */
  var Providers: ProvidersListType = js.native
}

object ListIdentityProvidersResponse {
  @scala.inline
  def apply(Providers: ProvidersListType): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  @scala.inline
  implicit class ListIdentityProvidersResponseOps[Self <: ListIdentityProvidersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProviders(value: ProvidersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationKeyType): Self = {
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
  }
  
}

