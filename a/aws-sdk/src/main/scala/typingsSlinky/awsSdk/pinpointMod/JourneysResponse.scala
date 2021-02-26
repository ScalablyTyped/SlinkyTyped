package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneysResponse extends StObject {
  
  /**
    * An array of responses, one for each journey that's associated with the application.
    */
  var Item: ListOfJourneyResponse = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object JourneysResponse {
  
  @scala.inline
  def apply(Item: ListOfJourneyResponse): JourneysResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneysResponse]
  }
  
  @scala.inline
  implicit class JourneysResponseMutableBuilder[Self <: JourneysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfJourneyResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: JourneyResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
