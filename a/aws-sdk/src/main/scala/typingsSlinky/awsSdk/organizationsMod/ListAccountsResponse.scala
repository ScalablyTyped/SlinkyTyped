package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountsResponse extends js.Object {
  
  /**
    * A list of objects in the organization.
    */
  var Accounts: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Accounts] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
}
object ListAccountsResponse {
  
  @scala.inline
  def apply(): ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsResponse]
  }
  
  @scala.inline
  implicit class ListAccountsResponseOps[Self <: ListAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: Account*): Self = this.set("Accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: Accounts): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
