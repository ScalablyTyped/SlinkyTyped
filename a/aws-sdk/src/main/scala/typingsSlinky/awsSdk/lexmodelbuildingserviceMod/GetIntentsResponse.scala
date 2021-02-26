package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentsResponse extends StObject {
  
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.native
  
  /**
    * If the response is truncated, the response includes a pagination token that you can specify in your next request to fetch the next page of intents. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetIntentsResponse {
  
  @scala.inline
  def apply(): GetIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentsResponse]
  }
  
  @scala.inline
  implicit class GetIntentsResponseMutableBuilder[Self <: GetIntentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: IntentMetadataList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: IntentMetadata*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
