package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOpenIDConnectProviderRequest extends js.Object {
  
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.) You can register multiple client IDs with the same provider. For example, you might have multiple applications that use the same OIDC provider. You cannot register more than 100 client IDs with a single IAM OIDC provider. There is no defined format for a client ID. The CreateOpenIDConnectProviderRequest operation accepts client IDs up to 255 characters long.
    */
  var ClientIDList: js.UndefOr[clientIDListType] = js.native
  
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificates. Typically this list includes only one entry. However, IAM lets you have up to five thumbprints for an OIDC provider. This lets you maintain multiple thumbprints if the identity provider is rotating certificates. The server certificate thumbprint is the hex-encoded SHA-1 hash value of the X.509 certificate used by the domain where the OpenID Connect provider makes its keys available. It is always a 40-character string. You must provide at least one thumbprint when creating an IAM OIDC provider. For example, assume that the OIDC provider is server.example.com and the provider stores its keys at https://keys.server.example.com/openid-connect. In that case, the thumbprint string would be the hex-encoded SHA-1 hash value of the certificate used by https://keys.server.example.com. For more information about obtaining the OIDC provider's thumbprint, see Obtaining the Thumbprint for an OpenID Connect Provider in the IAM User Guide.
    */
  var ThumbprintList: thumbprintListType = js.native
  
  /**
    * The URL of the identity provider. The URL must begin with https:// and should correspond to the iss claim in the provider's OpenID Connect ID tokens. Per the OIDC standard, path components are allowed but query parameters are not. Typically the URL consists of only a hostname, like https://server.example.org or https://example.com. You cannot register the same provider multiple times in a single AWS account. If you try to submit a URL that has already been used for an OpenID Connect provider in the AWS account, you will get an error.
    */
  var Url: OpenIDConnectProviderUrlType = js.native
}
object CreateOpenIDConnectProviderRequest {
  
  @scala.inline
  def apply(ThumbprintList: thumbprintListType, Url: OpenIDConnectProviderUrlType): CreateOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(ThumbprintList = ThumbprintList.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpenIDConnectProviderRequest]
  }
  
  @scala.inline
  implicit class CreateOpenIDConnectProviderRequestOps[Self <: CreateOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThumbprintListVarargs(value: thumbprintType*): Self = this.set("ThumbprintList", js.Array(value :_*))
    
    @scala.inline
    def setThumbprintList(value: thumbprintListType): Self = this.set("ThumbprintList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: OpenIDConnectProviderUrlType): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIDListVarargs(value: clientIDType*): Self = this.set("ClientIDList", js.Array(value :_*))
    
    @scala.inline
    def setClientIDList(value: clientIDListType): Self = this.set("ClientIDList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIDList: Self = this.set("ClientIDList", js.undefined)
  }
}
