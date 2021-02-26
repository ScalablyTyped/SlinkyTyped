package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsRequest extends StObject {
  
  /**
    * The unique application IDs.
    */
  var appIds: js.UndefOr[AppIds] = js.native
  
  /**
    * The maximum number of results to return in a single call. The default value is 100. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAppsRequest {
  
  @scala.inline
  def apply(): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsRequest]
  }
  
  @scala.inline
  implicit class ListAppsRequestMutableBuilder[Self <: ListAppsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppIds(value: AppIds): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdsUndefined: Self = StObject.set(x, "appIds", js.undefined)
    
    @scala.inline
    def setAppIdsVarargs(value: AppId*): Self = StObject.set(x, "appIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
