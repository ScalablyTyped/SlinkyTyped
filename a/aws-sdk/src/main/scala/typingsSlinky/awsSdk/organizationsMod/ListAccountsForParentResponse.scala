package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccountsForParentResponse extends StObject {
  
  /**
    * A list of the accounts in the specified root or OU.
    */
  var Accounts: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Accounts] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
}
object ListAccountsForParentResponse {
  
  @scala.inline
  def apply(): ListAccountsForParentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsForParentResponse]
  }
  
  @scala.inline
  implicit class ListAccountsForParentResponseMutableBuilder[Self <: ListAccountsForParentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: Accounts): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
