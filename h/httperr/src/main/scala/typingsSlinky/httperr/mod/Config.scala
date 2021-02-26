package typingsSlinky.httperr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Configuration object for constructing HttpErrors. */
@js.native
trait Config extends StObject {
  
  /**
    *  The methods allowed for this URL.
    *  This property is only available for 405 Method Not Allowed errors
    *  and can be used to populate the Allow header.
    */
  var allowed: js.UndefOr[js.Array[String]] = js.native
  
  /** The underlying exception that caused the HTTP error. */
  var cause: js.UndefOr[js.Error] = js.native
  
  /** A detailed human-readable description of the error's cause and possible solutions. */
  var details: js.UndefOr[String] = js.native
  
  /**
    *  The location for which the request should be repeated.
    *  This property is only available for 451 Redirect (Microsoft) errors and can be
    *  used to populate the proprietary X-MS-Location response header.
    */
  var location: js.UndefOr[js.Any] = js.native
  
  /** A descriptive human-readable title describing the error's cause. */
  var message: js.UndefOr[String] = js.native
  
  /**
    *  The parameters with which the request should be retried.
    *  This property is only available for 449 Retry With (Microsoft) errors and can be
    *  used to populate the response status message.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  
  /**
    *  The minimum delay before the request should be attempted again.
    *  This property is only available for 429 Too Many Requests and 420 Enhance Your Calm
    *  (Twitter API) errors and can be used to populate the Retry-After header.
    */
  var retryAfter: js.UndefOr[js.Any] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value :_*))
    
    @scala.inline
    def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRetryAfter(value: js.Any): Self = StObject.set(x, "retryAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAfterUndefined: Self = StObject.set(x, "retryAfter", js.undefined)
  }
}
