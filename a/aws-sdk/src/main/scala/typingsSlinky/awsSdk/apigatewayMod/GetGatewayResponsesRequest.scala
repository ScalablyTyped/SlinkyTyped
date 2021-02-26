package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGatewayResponsesRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The GatewayResponses collection does not support pagination and the limit does not apply here.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The current pagination position in the paged result set. The GatewayResponse collection does not support pagination and the position does not apply here.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object GetGatewayResponsesRequest {
  
  @scala.inline
  def apply(restApiId: String): GetGatewayResponsesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayResponsesRequest]
  }
  
  @scala.inline
  implicit class GetGatewayResponsesRequestMutableBuilder[Self <: GetGatewayResponsesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
