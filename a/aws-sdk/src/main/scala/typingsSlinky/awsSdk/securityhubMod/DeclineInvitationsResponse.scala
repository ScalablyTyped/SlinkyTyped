package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclineInvitationsResponse extends StObject {
  
  /**
    * The list of AWS accounts that were not processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}
object DeclineInvitationsResponse {
  
  @scala.inline
  def apply(): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
  
  @scala.inline
  implicit class DeclineInvitationsResponseMutableBuilder[Self <: DeclineInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedAccounts(value: ResultList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: Result*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
