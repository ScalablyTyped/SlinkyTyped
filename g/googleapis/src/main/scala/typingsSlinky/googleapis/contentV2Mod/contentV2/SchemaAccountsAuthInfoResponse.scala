package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountsAuthInfoResponse extends StObject {
  
  /**
    * The account identifiers corresponding to the authenticated user. - For an
    * individual account: only the merchant ID is defined - For an aggregator:
    * only the aggregator ID is defined - For a subaccount of an MCA: both the
    * merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[SchemaAccountIdentifier]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsAuthInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccountsAuthInfoResponse {
  
  @scala.inline
  def apply(): SchemaAccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsAuthInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountsAuthInfoResponseMutableBuilder[Self <: SchemaAccountsAuthInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIdentifiers(value: js.Array[SchemaAccountIdentifier]): Self = StObject.set(x, "accountIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdentifiersUndefined: Self = StObject.set(x, "accountIdentifiers", js.undefined)
    
    @scala.inline
    def setAccountIdentifiersVarargs(value: SchemaAccountIdentifier*): Self = StObject.set(x, "accountIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
