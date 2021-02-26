package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerRequest extends StObject {
  
  /**
    * [Optional] A key-value map of additional context variables.
    */
  var additionalContext: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Required] Specifies a test invoke authorizer request's Authorizer ID.
    */
  var authorizerId: String = js.native
  
  /**
    * [Optional] The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * [Required] A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, should be specified.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Optional] The headers as a map from string to list of values to simulate an incoming invocation request. This is where the incoming authorization token, or identity source, may be specified.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  
  /**
    * [Optional] The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.native
}
object TestInvokeAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerId: String, restApiId: String): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  
  @scala.inline
  implicit class TestInvokeAuthorizerRequestMutableBuilder[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalContext(value: MapOfStringToString): Self = StObject.set(x, "additionalContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalContextUndefined: Self = StObject.set(x, "additionalContext", js.undefined)
    
    @scala.inline
    def setAuthorizerId(value: String): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    @scala.inline
    def setPathWithQueryString(value: String): Self = StObject.set(x, "pathWithQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathWithQueryStringUndefined: Self = StObject.set(x, "pathWithQueryString", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariables(value: MapOfStringToString): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
  }
}
