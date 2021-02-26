package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerRequest extends StObject {
  
  /**
    * The custom authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  
  /**
    * Specifies a test HTTP authorization request.
    */
  var httpContext: js.UndefOr[HttpContext] = js.native
  
  /**
    * Specifies a test MQTT authorization request.
    */
  var mqttContext: js.UndefOr[MqttContext] = js.native
  
  /**
    * Specifies a test TLS authorization request.
    */
  var tlsContext: js.UndefOr[TlsContext] = js.native
  
  /**
    * The token returned by your custom authentication service.
    */
  var token: js.UndefOr[Token] = js.native
  
  /**
    * The signature made with the token and your custom authentication service's private key. This value must be Base-64-encoded.
    */
  var tokenSignature: js.UndefOr[TokenSignature] = js.native
}
object TestInvokeAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerName: AuthorizerName): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  
  @scala.inline
  implicit class TestInvokeAuthorizerRequestMutableBuilder[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpContext(value: HttpContext): Self = StObject.set(x, "httpContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpContextUndefined: Self = StObject.set(x, "httpContext", js.undefined)
    
    @scala.inline
    def setMqttContext(value: MqttContext): Self = StObject.set(x, "mqttContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqttContextUndefined: Self = StObject.set(x, "mqttContext", js.undefined)
    
    @scala.inline
    def setTlsContext(value: TlsContext): Self = StObject.set(x, "tlsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsContextUndefined: Self = StObject.set(x, "tlsContext", js.undefined)
    
    @scala.inline
    def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenSignature(value: TokenSignature): Self = StObject.set(x, "tokenSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenSignatureUndefined: Self = StObject.set(x, "tokenSignature", js.undefined)
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
