package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOpenIDConnectProvidersResponse extends js.Object {
  /**
    * The list of IAM OIDC provider resource objects defined in the AWS account.
    */
  var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.native
}

object ListOpenIDConnectProvidersResponse {
  @scala.inline
  def apply(): ListOpenIDConnectProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
  }
  @scala.inline
  implicit class ListOpenIDConnectProvidersResponseOps[Self <: ListOpenIDConnectProvidersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenIDConnectProviderList(value: OpenIDConnectProviderListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIDConnectProviderList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIDConnectProviderList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIDConnectProviderList")(js.undefined)
        ret
    }
  }
  
}

