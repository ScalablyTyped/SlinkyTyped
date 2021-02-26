package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntegrationsResponse extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[listOfIntegration] = js.native
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.NextToken] = js.native
}
object GetIntegrationsResponse {
  
  @scala.inline
  def apply(): GetIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntegrationsResponse]
  }
  
  @scala.inline
  implicit class GetIntegrationsResponseMutableBuilder[Self <: GetIntegrationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfIntegration): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Integration*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
