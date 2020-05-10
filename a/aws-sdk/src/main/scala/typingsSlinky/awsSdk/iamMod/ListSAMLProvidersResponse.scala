package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSAMLProvidersResponse extends js.Object {
  /**
    * The list of SAML provider resource objects defined in IAM for this AWS account.
    */
  var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.native
}

object ListSAMLProvidersResponse {
  @scala.inline
  def apply(): ListSAMLProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSAMLProvidersResponse]
  }
  @scala.inline
  implicit class ListSAMLProvidersResponseOps[Self <: ListSAMLProvidersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSAMLProviderList(value: SAMLProviderListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLProviderList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSAMLProviderList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLProviderList")(js.undefined)
        ret
    }
  }
  
}

