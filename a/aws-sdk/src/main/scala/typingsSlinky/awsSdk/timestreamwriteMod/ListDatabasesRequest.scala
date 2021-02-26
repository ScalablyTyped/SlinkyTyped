package typingsSlinky.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatabasesRequest extends StObject {
  
  /**
    * The total number of items to return in the output. If the total number of items available is more than the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var MaxResults: js.UndefOr[PaginationLimit] = js.native
  
  /**
    * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDatabasesRequest {
  
  @scala.inline
  def apply(): ListDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesRequest]
  }
  
  @scala.inline
  implicit class ListDatabasesRequestMutableBuilder[Self <: ListDatabasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PaginationLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
