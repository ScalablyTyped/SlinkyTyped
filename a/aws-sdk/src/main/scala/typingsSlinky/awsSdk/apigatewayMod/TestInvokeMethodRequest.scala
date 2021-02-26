package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeMethodRequest extends StObject {
  
  /**
    * The simulated request body of an incoming invocation request.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * A ClientCertificate identifier to use in the test invocation. API Gateway will use the certificate when making the HTTPS request to the defined back-end endpoint.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  
  /**
    * A key-value map of headers to simulate an incoming invocation request.
    */
  var headers: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Required] Specifies a test invoke method request's HTTP method.
    */
  var httpMethod: String = js.native
  
  /**
    * The headers as a map from string to list of values to simulate an incoming invocation request.
    */
  var multiValueHeaders: js.UndefOr[MapOfStringToList] = js.native
  
  /**
    * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters and query string parameters.
    */
  var pathWithQueryString: js.UndefOr[String] = js.native
  
  /**
    * [Required] Specifies a test invoke method request's resource ID.
    */
  var resourceId: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * A key-value map of stage variables to simulate an invocation on a deployed Stage.
    */
  var stageVariables: js.UndefOr[MapOfStringToString] = js.native
}
object TestInvokeMethodRequest {
  
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): TestInvokeMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeMethodRequest]
  }
  
  @scala.inline
  implicit class TestInvokeMethodRequestMutableBuilder[Self <: TestInvokeMethodRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
    
    @scala.inline
    def setHeaders(value: MapOfStringToString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueHeaders(value: MapOfStringToList): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
    
    @scala.inline
    def setPathWithQueryString(value: String): Self = StObject.set(x, "pathWithQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathWithQueryStringUndefined: Self = StObject.set(x, "pathWithQueryString", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariables(value: MapOfStringToString): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
  }
}
