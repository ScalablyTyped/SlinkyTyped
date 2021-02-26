package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings controlling the volume of connections to a backend service.
  */
@js.native
trait SchemaCircuitBreakers extends StObject {
  
  /**
    * The timeout for new network connections to hosts.
    */
  var connectTimeout: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * The maximum number of connections to the backend cluster. If not
    * specified, the default is 1024.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of pending requests allowed to the backend cluster. If
    * not specified, the default is 1024.
    */
  var maxPendingRequests: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of parallel requests that allowed to the backend
    * cluster. If not specified, the default is 1024.
    */
  var maxRequests: js.UndefOr[Double] = js.native
  
  /**
    * Maximum requests for a single backend connection. This parameter is
    * respected by both the HTTP/1.1 and HTTP/2 implementations. If not
    * specified, there is no limit. Setting this parameter to 1 will
    * effectively disable keep alive.
    */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of parallel retries allowed to the backend cluster. If
    * not specified, the default is 3.
    */
  var maxRetries: js.UndefOr[Double] = js.native
}
object SchemaCircuitBreakers {
  
  @scala.inline
  def apply(): SchemaCircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCircuitBreakers]
  }
  
  @scala.inline
  implicit class SchemaCircuitBreakersMutableBuilder[Self <: SchemaCircuitBreakers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectTimeout(value: SchemaDuration): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    @scala.inline
    def setMaxPendingRequests(value: Double): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
    
    @scala.inline
    def setMaxRequests(value: Double): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRequestsPerConnection(value: Double): Self = StObject.set(x, "maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRequestsPerConnectionUndefined: Self = StObject.set(x, "maxRequestsPerConnection", js.undefined)
    
    @scala.inline
    def setMaxRequestsUndefined: Self = StObject.set(x, "maxRequests", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
