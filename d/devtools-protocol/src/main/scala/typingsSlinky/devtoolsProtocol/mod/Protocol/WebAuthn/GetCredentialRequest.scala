package typingsSlinky.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialRequest extends js.Object {
  
  var authenticatorId: AuthenticatorId = js.native
  
  var credentialId: String = js.native
}
object GetCredentialRequest {
  
  @scala.inline
  def apply(authenticatorId: AuthenticatorId, credentialId: String): GetCredentialRequest = {
    val __obj = js.Dynamic.literal(authenticatorId = authenticatorId.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialRequest]
  }
  
  @scala.inline
  implicit class GetCredentialRequestOps[Self <: GetCredentialRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthenticatorId(value: AuthenticatorId): Self = this.set("authenticatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialId(value: String): Self = this.set("credentialId", value.asInstanceOf[js.Any])
  }
}
