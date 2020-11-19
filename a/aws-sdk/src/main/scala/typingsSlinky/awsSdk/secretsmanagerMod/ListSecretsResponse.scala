package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecretsResponse extends js.Object {
  
  /**
    * If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the NextToken request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the NextToken response element comes back empty (as null).
    */
  var NextToken: js.UndefOr[NextTokenType] = js.native
  
  /**
    * A list of the secrets in the account.
    */
  var SecretList: js.UndefOr[SecretListType] = js.native
}
object ListSecretsResponse {
  
  @scala.inline
  def apply(): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsResponse]
  }
  
  @scala.inline
  implicit class ListSecretsResponseOps[Self <: ListSecretsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextTokenType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSecretListVarargs(value: SecretListEntry*): Self = this.set("SecretList", js.Array(value :_*))
    
    @scala.inline
    def setSecretList(value: SecretListType): Self = this.set("SecretList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretList: Self = this.set("SecretList", js.undefined)
  }
}
