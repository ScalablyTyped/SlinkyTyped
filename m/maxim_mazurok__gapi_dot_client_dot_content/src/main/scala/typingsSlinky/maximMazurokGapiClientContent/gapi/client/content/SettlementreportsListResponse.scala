package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementreportsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#settlementreportsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The token for the retrieval of the next page of returns. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[js.Array[SettlementReport]] = js.native
}
object SettlementreportsListResponse {
  
  @scala.inline
  def apply(): SettlementreportsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementreportsListResponse]
  }
  
  @scala.inline
  implicit class SettlementreportsListResponseMutableBuilder[Self <: SettlementreportsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SettlementReport]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SettlementReport*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
