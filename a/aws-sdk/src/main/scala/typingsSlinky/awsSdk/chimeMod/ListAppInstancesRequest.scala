package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstancesRequest extends StObject {
  
  /**
    * The maximum number of app instances that you want to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token passed by previous API requests until you reach the maximum number of app instances.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.chimeMod.NextToken] = js.native
}
object ListAppInstancesRequest {
  
  @scala.inline
  def apply(): ListAppInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstancesRequest]
  }
  
  @scala.inline
  implicit class ListAppInstancesRequestMutableBuilder[Self <: ListAppInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
