package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
  /**
    * The client ID (also known as audience) to add to the IAM OpenID Connect provider resource.
    */
  var ClientID: clientIDType = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider resource to add the client ID to. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}

object AddClientIDToOpenIDConnectProviderRequest {
  @scala.inline
  def apply(ClientID: clientIDType, OpenIDConnectProviderArn: arnType): AddClientIDToOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddClientIDToOpenIDConnectProviderRequest]
  }
  @scala.inline
  implicit class AddClientIDToOpenIDConnectProviderRequestOps[Self <: AddClientIDToOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: clientIDType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenIDConnectProviderArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenIDConnectProviderArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

