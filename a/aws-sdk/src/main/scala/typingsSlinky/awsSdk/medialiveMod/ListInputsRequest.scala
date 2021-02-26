package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputsRequest extends StObject {
  
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object ListInputsRequest {
  
  @scala.inline
  def apply(): ListInputsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsRequest]
  }
  
  @scala.inline
  implicit class ListInputsRequestMutableBuilder[Self <: ListInputsRequest] (val x: Self) extends AnyVal {
    
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
