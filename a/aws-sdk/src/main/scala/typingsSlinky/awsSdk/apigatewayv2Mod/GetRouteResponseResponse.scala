package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteResponseResponse extends StObject {
  
  /**
    * Represents the model selection expression of a route response. Supported only for WebSocket APIs.
    */
  var ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * Represents the response models of a route response.
    */
  var ResponseModels: js.UndefOr[RouteModels] = js.native
  
  /**
    * Represents the response parameters of a route response.
    */
  var ResponseParameters: js.UndefOr[RouteParameters] = js.native
  
  /**
    * Represents the identifier of a route response.
    */
  var RouteResponseId: js.UndefOr[Id] = js.native
  
  /**
    * Represents the route response key of a route response.
    */
  var RouteResponseKey: js.UndefOr[SelectionKey] = js.native
}
object GetRouteResponseResponse {
  
  @scala.inline
  def apply(): GetRouteResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRouteResponseResponse]
  }
  
  @scala.inline
  implicit class GetRouteResponseResponseMutableBuilder[Self <: GetRouteResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ModelSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSelectionExpressionUndefined: Self = StObject.set(x, "ModelSelectionExpression", js.undefined)
    
    @scala.inline
    def setResponseModels(value: RouteModels): Self = StObject.set(x, "ResponseModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModelsUndefined: Self = StObject.set(x, "ResponseModels", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: RouteParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    @scala.inline
    def setRouteResponseId(value: Id): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseIdUndefined: Self = StObject.set(x, "RouteResponseId", js.undefined)
    
    @scala.inline
    def setRouteResponseKey(value: SelectionKey): Self = StObject.set(x, "RouteResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseKeyUndefined: Self = StObject.set(x, "RouteResponseKey", js.undefined)
  }
}
