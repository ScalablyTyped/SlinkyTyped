package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicyHourlyCycle extends StObject {
  
  /** [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario. */
  var duration: js.UndefOr[String] = js.native
  
  /** Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle. */
  var hoursInCycle: js.UndefOr[Double] = js.native
  
  /** Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT. */
  var startTime: js.UndefOr[String] = js.native
}
object ResourcePolicyHourlyCycle {
  
  @scala.inline
  def apply(): ResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyHourlyCycle]
  }
  
  @scala.inline
  implicit class ResourcePolicyHourlyCycleMutableBuilder[Self <: ResourcePolicyHourlyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setHoursInCycle(value: Double): Self = StObject.set(x, "hoursInCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursInCycleUndefined: Self = StObject.set(x, "hoursInCycle", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
