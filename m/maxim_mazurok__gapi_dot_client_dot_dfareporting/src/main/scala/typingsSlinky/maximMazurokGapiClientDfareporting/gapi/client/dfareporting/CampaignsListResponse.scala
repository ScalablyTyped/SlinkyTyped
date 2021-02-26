package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsListResponse extends StObject {
  
  /** Campaign collection. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CampaignsListResponse {
  
  @scala.inline
  def apply(): CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignsListResponse]
  }
  
  @scala.inline
  implicit class CampaignsListResponseMutableBuilder[Self <: CampaignsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaigns(value: js.Array[Campaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    @scala.inline
    def setCampaignsVarargs(value: Campaign*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
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
