package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.anon.Payload
import typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerAuthSchemeObject extends StObject {
  
  /**
    * optional object which is exposed via the [server.auth.api](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.api) object.
    */
  var api: js.UndefOr[ServerAuthSchemeObjectApi] = js.native
  
  /**
    * A lifecycle method function called for each incoming request configured with the authentication scheme. The
    * method is provided with two special toolkit methods for returning an authenticated or an unauthenticate result:
    * * h.authenticated() - indicate request authenticated successfully.
    * * h.unauthenticated() - indicate request failed to authenticate.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  def authenticate(request: Request, h: ResponseToolkit): ReturnValue = js.native
  
  /**
    * An object with the following keys:
    * * payload
    */
  var options: js.UndefOr[Payload] = js.native
  
  /**
    * A lifecycle method to authenticate the request payload.
    * When the scheme payload() method returns an error with a message, it means payload validation failed due to bad
    * payload. If the error has no message but includes a scheme name (e.g. Boom.unauthorized(null, 'Custom')),
    * authentication may still be successful if the route auth.payload configuration is set to 'optional'.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var payload: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.native
  
  /**
    * A lifecycle method to decorate the response with authentication headers before the response headers or payload is written.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var response: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.native
  
  /**
    * a method used to verify the authentication credentials provided
    * are still valid (e.g. not expired or revoked after the initial authentication).
    * the method throws an `Error` when the credentials passed are no longer valid (e.g. expired or
    * revoked). Note that the method does not have access to the original request, only to the
    * credentials and artifacts produced by the `authenticate()` method.
    */
  var verify: js.UndefOr[js.Function1[/* auth */ RequestAuth, js.Promise[Unit]]] = js.native
}
object ServerAuthSchemeObject {
  
  @scala.inline
  def apply(authenticate: (Request, ResponseToolkit) => ReturnValue): ServerAuthSchemeObject = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    __obj.asInstanceOf[ServerAuthSchemeObject]
  }
  
  @scala.inline
  implicit class ServerAuthSchemeObjectMutableBuilder[Self <: ServerAuthSchemeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: ServerAuthSchemeObjectApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setAuthenticate(value: (Request, ResponseToolkit) => ReturnValue): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Payload): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPayload(value: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue): Self = StObject.set(x, "payload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setResponse(value: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setVerify(value: /* auth */ RequestAuth => js.Promise[Unit]): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
