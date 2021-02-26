package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsResponse extends StObject {
  
  /**
    * An array of strings, where each string is the unique identifier for a finding that meets the filter criteria specified in the request.
    */
  var findingIds: js.UndefOr[listOfString] = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}
object ListFindingsResponse {
  
  @scala.inline
  def apply(): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  @scala.inline
  implicit class ListFindingsResponseMutableBuilder[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingIds(value: listOfString): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsUndefined: Self = StObject.set(x, "findingIds", js.undefined)
    
    @scala.inline
    def setFindingIdsVarargs(value: string*): Self = StObject.set(x, "findingIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
