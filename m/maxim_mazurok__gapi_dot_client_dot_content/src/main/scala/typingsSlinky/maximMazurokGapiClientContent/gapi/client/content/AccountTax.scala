package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTax extends StObject {
  
  /** Required. The ID of the account to which these account tax settings belong. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountTax". */
  var kind: js.UndefOr[String] = js.native
  
  /** Tax rules. Updating the tax rules will enable US taxes (not reversible). Defining no rules is equivalent to not charging tax at all. */
  var rules: js.UndefOr[js.Array[AccountTaxTaxRule]] = js.native
}
object AccountTax {
  
  @scala.inline
  def apply(): AccountTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTax]
  }
  
  @scala.inline
  implicit class AccountTaxMutableBuilder[Self <: AccountTax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[AccountTaxTaxRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AccountTaxTaxRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
