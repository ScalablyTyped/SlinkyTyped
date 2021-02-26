package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Readiness checking configuration for VM instances. Unhealthy instances are
  * removed from traffic rotation.
  */
@js.native
trait SchemaReadinessCheck extends StObject {
  
  /**
    * A maximum time limit on application initialization, measured from moment
    * the application successfully replies to a healthcheck until it is ready
    * to serve traffic.
    */
  var appStartTimeout: js.UndefOr[String] = js.native
  
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive failed checks required before removing traffic.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Host header to send when performing a HTTP Readiness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive successful checks required before receiving
    * traffic.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}
object SchemaReadinessCheck {
  
  @scala.inline
  def apply(): SchemaReadinessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadinessCheck]
  }
  
  @scala.inline
  implicit class SchemaReadinessCheckMutableBuilder[Self <: SchemaReadinessCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStartTimeout(value: String): Self = StObject.set(x, "appStartTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStartTimeoutUndefined: Self = StObject.set(x, "appStartTimeout", js.undefined)
    
    @scala.inline
    def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
