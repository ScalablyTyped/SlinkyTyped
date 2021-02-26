package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsListResponse extends StObject {
  
  /** Account collection. */
  var accounts: js.UndefOr[js.Array[Account]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object AccountsListResponse {
  
  @scala.inline
  def apply(): AccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsListResponse]
  }
  
  @scala.inline
  implicit class AccountsListResponseMutableBuilder[Self <: AccountsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
