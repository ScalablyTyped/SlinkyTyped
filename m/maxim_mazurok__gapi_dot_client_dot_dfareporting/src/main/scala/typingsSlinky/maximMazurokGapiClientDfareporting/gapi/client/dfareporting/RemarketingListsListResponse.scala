package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingListsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Remarketing list collection. */
  var remarketingLists: js.UndefOr[js.Array[RemarketingList]] = js.native
}
object RemarketingListsListResponse {
  
  @scala.inline
  def apply(): RemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingListsListResponse]
  }
  
  @scala.inline
  implicit class RemarketingListsListResponseMutableBuilder[Self <: RemarketingListsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRemarketingLists(value: js.Array[RemarketingList]): Self = StObject.set(x, "remarketingLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingListsUndefined: Self = StObject.set(x, "remarketingLists", js.undefined)
    
    @scala.inline
    def setRemarketingListsVarargs(value: RemarketingList*): Self = StObject.set(x, "remarketingLists", js.Array(value :_*))
  }
}
