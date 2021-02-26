package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityGroupsListResponse extends StObject {
  
  /** Floodlight activity group collection. */
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroupsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object FloodlightActivityGroupsListResponse {
  
  @scala.inline
  def apply(): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
  
  @scala.inline
  implicit class FloodlightActivityGroupsListResponseMutableBuilder[Self <: FloodlightActivityGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityGroups(value: js.Array[FloodlightActivityGroup]): Self = StObject.set(x, "floodlightActivityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupsUndefined: Self = StObject.set(x, "floodlightActivityGroups", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupsVarargs(value: FloodlightActivityGroup*): Self = StObject.set(x, "floodlightActivityGroups", js.Array(value :_*))
    
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
