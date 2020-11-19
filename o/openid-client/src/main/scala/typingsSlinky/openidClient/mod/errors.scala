package typingsSlinky.openidClient.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "errors")
@js.native
object errors extends js.Object {
  
  /**
    * Error class thrown when a regular OAuth 2.0 / OIDC style error is returned by the AS or an
    * unexpected response is sent by the OP.
    */
  @js.native
  class OPError () extends Error {
    
    /**
      * The 'error' parameter from the AS response.
      */
    var error: js.UndefOr[String] = js.native
    
    /**
      * The 'error_description' parameter from the AS response.
      */
    var error_description: js.UndefOr[String] = js.native
    
    /**
      * The 'error_uri' parameter from the AS response.
      */
    var error_uri: js.UndefOr[String] = js.native
    
    /**
      * When the error is related to an http(s) request this propetty will hold the  response object
      * from got.
      */
    var response: js.UndefOr[js.Any] = js.native
    
    /**
      * The 'scope' parameter from the AS response.
      */
    var scope: js.UndefOr[String] = js.native
    
    /**
      * The 'session_state' parameter from the AS response.
      */
    var session_state: js.UndefOr[String] = js.native
    
    /**
      * The 'state' parameter from the AS response.
      */
    var state: js.UndefOr[String] = js.native
  }
  
  /**
    * Error class thrown when client-side response expectations/validations fail to pass.
    * Depending on the context it may or may not have additional context-based properties like
    * checks, jwt, params or body.
    */
  @js.native
  class RPError () extends Error {
    
    var auth_time: js.UndefOr[Double] = js.native
    
    var body: js.UndefOr[js.Object] = js.native
    
    var checks: js.UndefOr[js.Object] = js.native
    
    var exp: js.UndefOr[Double] = js.native
    
    var iat: js.UndefOr[Double] = js.native
    
    var jwt: js.UndefOr[String] = js.native
    
    var nbf: js.UndefOr[Double] = js.native
    
    var now: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    /**
      * When the error is related to an http(s) request this propetty will hold the response object
      * from got.
      */
    var response: js.UndefOr[js.Any] = js.native
    
    var tolerance: js.UndefOr[Double] = js.native
  }
}
