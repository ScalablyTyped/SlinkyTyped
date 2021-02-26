package typingsSlinky.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackagingGroupsRequest extends StObject {
  
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.mediapackagevodMod.MaxResults] = js.native
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListPackagingGroupsRequest {
  
  @scala.inline
  def apply(): ListPackagingGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsRequest]
  }
  
  @scala.inline
  implicit class ListPackagingGroupsRequestMutableBuilder[Self <: ListPackagingGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
