package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticScaling extends js.Object {
  
  /**
    * Amount of time that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait between changes to the number of virtual machines.
    * Only applicable for VM runtimes.
    */
  var coolDownPeriod: js.UndefOr[String] = js.native
  
  /** Target scaling by CPU usage. */
  var cpuUtilization: js.UndefOr[CpuUtilization] = js.native
  
  /** Target scaling by disk usage. */
  var diskUtilization: js.UndefOr[DiskUtilization] = js.native
  
  /** Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value. */
  var maxConcurrentRequests: js.UndefOr[Double] = js.native
  
  /** Maximum number of idle instances that should be maintained for this version. */
  var maxIdleInstances: js.UndefOr[Double] = js.native
  
  /** Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it. */
  var maxPendingLatency: js.UndefOr[String] = js.native
  
  /** Maximum number of instances that should be started to handle requests. */
  var maxTotalInstances: js.UndefOr[Double] = js.native
  
  /** Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service. */
  var minIdleInstances: js.UndefOr[Double] = js.native
  
  /** Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it. */
  var minPendingLatency: js.UndefOr[String] = js.native
  
  /** Minimum number of instances that should be maintained for this version. */
  var minTotalInstances: js.UndefOr[Double] = js.native
  
  /** Target scaling by network usage. */
  var networkUtilization: js.UndefOr[NetworkUtilization] = js.native
  
  /** Target scaling by request utilization. */
  var requestUtilization: js.UndefOr[RequestUtilization] = js.native
}
object AutomaticScaling {
  
  @scala.inline
  def apply(): AutomaticScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticScaling]
  }
  
  @scala.inline
  implicit class AutomaticScalingOps[Self <: AutomaticScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoolDownPeriod(value: String): Self = this.set("coolDownPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoolDownPeriod: Self = this.set("coolDownPeriod", js.undefined)
    
    @scala.inline
    def setCpuUtilization(value: CpuUtilization): Self = this.set("cpuUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuUtilization: Self = this.set("cpuUtilization", js.undefined)
    
    @scala.inline
    def setDiskUtilization(value: DiskUtilization): Self = this.set("diskUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskUtilization: Self = this.set("diskUtilization", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = this.set("maxConcurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentRequests: Self = this.set("maxConcurrentRequests", js.undefined)
    
    @scala.inline
    def setMaxIdleInstances(value: Double): Self = this.set("maxIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIdleInstances: Self = this.set("maxIdleInstances", js.undefined)
    
    @scala.inline
    def setMaxPendingLatency(value: String): Self = this.set("maxPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPendingLatency: Self = this.set("maxPendingLatency", js.undefined)
    
    @scala.inline
    def setMaxTotalInstances(value: Double): Self = this.set("maxTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTotalInstances: Self = this.set("maxTotalInstances", js.undefined)
    
    @scala.inline
    def setMinIdleInstances(value: Double): Self = this.set("minIdleInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinIdleInstances: Self = this.set("minIdleInstances", js.undefined)
    
    @scala.inline
    def setMinPendingLatency(value: String): Self = this.set("minPendingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPendingLatency: Self = this.set("minPendingLatency", js.undefined)
    
    @scala.inline
    def setMinTotalInstances(value: Double): Self = this.set("minTotalInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTotalInstances: Self = this.set("minTotalInstances", js.undefined)
    
    @scala.inline
    def setNetworkUtilization(value: NetworkUtilization): Self = this.set("networkUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUtilization: Self = this.set("networkUtilization", js.undefined)
    
    @scala.inline
    def setRequestUtilization(value: RequestUtilization): Self = this.set("requestUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestUtilization: Self = this.set("requestUtilization", js.undefined)
  }
}
