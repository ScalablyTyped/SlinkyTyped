package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRouteRequestParameterRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The route request parameter key.
    */
  var RequestParameterKey: string = js.native
  
  /**
    * The route ID.
    */
  var RouteId: string = js.native
}
object DeleteRouteRequestParameterRequest {
  
  @scala.inline
  def apply(ApiId: string, RequestParameterKey: string, RouteId: string): DeleteRouteRequestParameterRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RequestParameterKey = RequestParameterKey.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequestParameterRequest]
  }
  
  @scala.inline
  implicit class DeleteRouteRequestParameterRequestMutableBuilder[Self <: DeleteRouteRequestParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestParameterKey(value: string): Self = StObject.set(x, "RequestParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
  }
}
