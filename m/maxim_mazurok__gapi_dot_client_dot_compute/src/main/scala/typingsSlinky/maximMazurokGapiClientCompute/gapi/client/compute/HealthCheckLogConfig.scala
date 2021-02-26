package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckLogConfig extends StObject {
  
  /** Indicates whether or not to export logs. This is false by default, which means no health check logging will be done. */
  var enable: js.UndefOr[Boolean] = js.native
}
object HealthCheckLogConfig {
  
  @scala.inline
  def apply(): HealthCheckLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckLogConfig]
  }
  
  @scala.inline
  implicit class HealthCheckLogConfigMutableBuilder[Self <: HealthCheckLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
