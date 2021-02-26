package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedInstanceInstanceHealth extends StObject {
  
  /** [Output Only] The current detailed instance health state. */
  var detailedHealthState: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL for the health check that verifies whether the instance is healthy. */
  var healthCheck: js.UndefOr[String] = js.native
}
object ManagedInstanceInstanceHealth {
  
  @scala.inline
  def apply(): ManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceInstanceHealth]
  }
  
  @scala.inline
  implicit class ManagedInstanceInstanceHealthMutableBuilder[Self <: ManagedInstanceInstanceHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedHealthState(value: String): Self = StObject.set(x, "detailedHealthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedHealthStateUndefined: Self = StObject.set(x, "detailedHealthState", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
