package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactListsRequest extends StObject {
  
  /**
    * A string token indicating that there might be additional contact lists available to be listed. Use the token provided in the Response to use in the subsequent call to ListContactLists with the same parameters to retrieve the next page of contact lists.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.NextToken] = js.native
  
  /**
    * Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional contact lists exist beyond the specified limit, the NextToken element is sent in the response. Use the NextToken value in subsequent requests to retrieve additional lists.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}
object ListContactListsRequest {
  
  @scala.inline
  def apply(): ListContactListsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactListsRequest]
  }
  
  @scala.inline
  implicit class ListContactListsRequestMutableBuilder[Self <: ListContactListsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
