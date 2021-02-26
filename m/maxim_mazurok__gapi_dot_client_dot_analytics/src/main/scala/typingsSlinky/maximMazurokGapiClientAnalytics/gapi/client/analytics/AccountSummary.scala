package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSummary extends StObject {
  
  /** Account ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics AccountSummary. */
  var kind: js.UndefOr[String] = js.native
  
  /** Account name. */
  var name: js.UndefOr[String] = js.native
  
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[Boolean] = js.native
  
  /** List of web properties under this account. */
  var webProperties: js.UndefOr[js.Array[WebPropertySummary]] = js.native
}
object AccountSummary {
  
  @scala.inline
  def apply(): AccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSummary]
  }
  
  @scala.inline
  implicit class AccountSummaryMutableBuilder[Self <: AccountSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setWebProperties(value: js.Array[WebPropertySummary]): Self = StObject.set(x, "webProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertiesUndefined: Self = StObject.set(x, "webProperties", js.undefined)
    
    @scala.inline
    def setWebPropertiesVarargs(value: WebPropertySummary*): Self = StObject.set(x, "webProperties", js.Array(value :_*))
  }
}
