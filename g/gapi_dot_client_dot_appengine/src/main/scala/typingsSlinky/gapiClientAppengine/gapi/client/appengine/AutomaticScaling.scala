package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCoolDownPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coolDownPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoolDownPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coolDownPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuUtilization(value: CpuUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskUtilization(value: DiskUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIdleInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIdleInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIdleInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIdleInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPendingLatency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPendingLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTotalInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTotalInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIdleInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIdleInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIdleInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minIdleInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPendingLatency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPendingLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPendingLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPendingLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTotalInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTotalInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTotalInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTotalInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkUtilization(value: NetworkUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestUtilization(value: RequestUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUtilization")(js.undefined)
        ret
    }
  }
  
}

