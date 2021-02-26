package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiMappingsResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfApiMapping] = js.native
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.NextToken] = js.native
}
object GetApiMappingsResponse {
  
  @scala.inline
  def apply(): GetApiMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiMappingsResponse]
  }
  
  @scala.inline
  implicit class GetApiMappingsResponseMutableBuilder[Self <: GetApiMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfApiMapping): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ApiMapping*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
