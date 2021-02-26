package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
  /** Output only. App Engine release this instance is running on. */
  var appEngineRelease: js.UndefOr[String] = js.native
  
  /** Output only. Availability of the instance. */
  var availability: js.UndefOr[String] = js.native
  
  /** Output only. Average latency (ms) over the last minute. */
  var averageLatency: js.UndefOr[Double] = js.native
  
  /** Output only. Number of errors since this instance was started. */
  var errors: js.UndefOr[Double] = js.native
  
  /** Output only. Relative name of the instance within the version. Example: instance-1. */
  var id: js.UndefOr[String] = js.native
  
  /** Output only. Total memory in use (bytes). */
  var memoryUsage: js.UndefOr[String] = js.native
  
  /** Output only. Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Average queries per second (QPS) over the last minute. */
  var qps: js.UndefOr[Double] = js.native
  
  /** Output only. Number of requests since this instance was started. */
  var requests: js.UndefOr[Double] = js.native
  
  /** Output only. Time that this instance was started.@OutputOnly */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment. */
  var vmDebugEnabled: js.UndefOr[Boolean] = js.native
  
  /** Output only. Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment. */
  var vmId: js.UndefOr[String] = js.native
  
  /** Output only. The IP address of this instance. Only applicable for instances in App Engine flexible environment. */
  var vmIp: js.UndefOr[String] = js.native
  
  /** Output only. Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment. */
  var vmName: js.UndefOr[String] = js.native
  
  /** Output only. Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment. */
  var vmStatus: js.UndefOr[String] = js.native
  
  /** Output only. Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment. */
  var vmZoneName: js.UndefOr[String] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineRelease(value: String): Self = StObject.set(x, "appEngineRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineReleaseUndefined: Self = StObject.set(x, "appEngineRelease", js.undefined)
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setAverageLatency(value: Double): Self = StObject.set(x, "averageLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageLatencyUndefined: Self = StObject.set(x, "averageLatency", js.undefined)
    
    @scala.inline
    def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMemoryUsage(value: String): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQps(value: Double): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQpsUndefined: Self = StObject.set(x, "qps", js.undefined)
    
    @scala.inline
    def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVmDebugEnabled(value: Boolean): Self = StObject.set(x, "vmDebugEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmDebugEnabledUndefined: Self = StObject.set(x, "vmDebugEnabled", js.undefined)
    
    @scala.inline
    def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    @scala.inline
    def setVmIp(value: String): Self = StObject.set(x, "vmIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIpUndefined: Self = StObject.set(x, "vmIp", js.undefined)
    
    @scala.inline
    def setVmName(value: String): Self = StObject.set(x, "vmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmNameUndefined: Self = StObject.set(x, "vmName", js.undefined)
    
    @scala.inline
    def setVmStatus(value: String): Self = StObject.set(x, "vmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmStatusUndefined: Self = StObject.set(x, "vmStatus", js.undefined)
    
    @scala.inline
    def setVmZoneName(value: String): Self = StObject.set(x, "vmZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmZoneNameUndefined: Self = StObject.set(x, "vmZoneName", js.undefined)
  }
}
