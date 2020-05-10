package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /** App Engine release this instance is running on.@OutputOnly */
  var appEngineRelease: js.UndefOr[String] = js.native
  /** Availability of the instance.@OutputOnly */
  var availability: js.UndefOr[String] = js.native
  /** Average latency (ms) over the last minute.@OutputOnly */
  var averageLatency: js.UndefOr[Double] = js.native
  /** Number of errors since this instance was started.@OutputOnly */
  var errors: js.UndefOr[Double] = js.native
  /** Relative name of the instance within the version. Example: instance-1.@OutputOnly */
  var id: js.UndefOr[String] = js.native
  /** Total memory in use (bytes).@OutputOnly */
  var memoryUsage: js.UndefOr[String] = js.native
  /** Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly */
  var name: js.UndefOr[String] = js.native
  /** Average queries per second (QPS) over the last minute.@OutputOnly */
  var qps: js.UndefOr[Double] = js.native
  /** Number of requests since this instance was started.@OutputOnly */
  var requests: js.UndefOr[Double] = js.native
  /** Time that this instance was started.@OutputOnly */
  var startTime: js.UndefOr[String] = js.native
  /** Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmDebugEnabled: js.UndefOr[Boolean] = js.native
  /** Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmId: js.UndefOr[String] = js.native
  /** The IP address of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmIp: js.UndefOr[String] = js.native
  /** Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmName: js.UndefOr[String] = js.native
  /** Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmStatus: js.UndefOr[String] = js.native
  /** Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmZoneName: js.UndefOr[String] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEngineRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qps")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVmDebugEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmDebugEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmDebugEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmDebugEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVmId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(js.undefined)
        ret
    }
    @scala.inline
    def withVmIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmIp")(js.undefined)
        ret
    }
    @scala.inline
    def withVmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmName")(js.undefined)
        ret
    }
    @scala.inline
    def withVmStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVmZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmZoneName")(js.undefined)
        ret
    }
  }
  
}

