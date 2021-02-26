package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsPolicy extends StObject {
  
  /**
    * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This translates to the Access-Control-Allow-Credentials
    * header.
    * Default is false.
    */
  var allowCredentials: js.UndefOr[Boolean] = js.native
  
  /** Specifies the content for the Access-Control-Allow-Headers header. */
  var allowHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /** Specifies the content for the Access-Control-Allow-Methods header. */
  var allowMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the regualar expression patterns that match allowed origins. For regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
    * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
    */
  var allowOriginRegexes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the list of origins that will be allowed to do CORS requests.
    * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
    */
  var allowOrigins: js.UndefOr[js.Array[String]] = js.native
  
  /** If true, specifies the CORS policy is disabled. The default value of false, which indicates that the CORS policy is in effect. */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the content for the Access-Control-Expose-Headers header. */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /** Specifies how long results of a preflight request can be cached in seconds. This translates to the Access-Control-Max-Age header. */
  var maxAge: js.UndefOr[Double] = js.native
}
object CorsPolicy {
  
  @scala.inline
  def apply(): CorsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsPolicy]
  }
  
  @scala.inline
  implicit class CorsPolicyMutableBuilder[Self <: CorsPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowOriginRegexes(value: js.Array[String]): Self = StObject.set(x, "allowOriginRegexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOriginRegexesUndefined: Self = StObject.set(x, "allowOriginRegexes", js.undefined)
    
    @scala.inline
    def setAllowOriginRegexesVarargs(value: String*): Self = StObject.set(x, "allowOriginRegexes", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: js.Array[String]): Self = StObject.set(x, "allowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOriginsUndefined: Self = StObject.set(x, "allowOrigins", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: String*): Self = StObject.set(x, "allowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
