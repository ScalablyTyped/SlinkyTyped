package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationsResponse extends StObject {
  
  /**
    * An array of responses, one for each application that was returned.
    */
  var Item: js.UndefOr[ListOfApplicationResponse] = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ApplicationsResponse {
  
  @scala.inline
  def apply(): ApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationsResponse]
  }
  
  @scala.inline
  implicit class ApplicationsResponseMutableBuilder[Self <: ApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfApplicationResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: ApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
