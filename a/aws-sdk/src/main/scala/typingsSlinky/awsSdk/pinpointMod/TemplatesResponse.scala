package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResponse extends StObject {
  
  /**
    * An array of responses, one for each message template that's associated with your Amazon Pinpoint account and meets any filter criteria that you specified in the request.
    */
  var Item: ListOfTemplateResponse = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object TemplatesResponse {
  
  @scala.inline
  def apply(Item: ListOfTemplateResponse): TemplatesResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesResponse]
  }
  
  @scala.inline
  implicit class TemplatesResponseMutableBuilder[Self <: TemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfTemplateResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: TemplateResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
