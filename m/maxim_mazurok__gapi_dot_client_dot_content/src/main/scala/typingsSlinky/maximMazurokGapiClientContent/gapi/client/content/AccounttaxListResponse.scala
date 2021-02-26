package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccounttaxListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The token for the retrieval of the next page of account tax settings. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[AccountTax]] = js.native
}
object AccounttaxListResponse {
  
  @scala.inline
  def apply(): AccounttaxListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccounttaxListResponse]
  }
  
  @scala.inline
  implicit class AccounttaxListResponseMutableBuilder[Self <: AccounttaxListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[AccountTax]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: AccountTax*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
