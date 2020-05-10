package typingsSlinky.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoring extends js.Object {
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: ClusterOpenMonitoringPrometheus = js.native
}

object ClusterOpenMonitoring {
  @scala.inline
  def apply(prometheus: ClusterOpenMonitoringPrometheus): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
  @scala.inline
  implicit class ClusterOpenMonitoringOps[Self <: ClusterOpenMonitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrometheus(value: ClusterOpenMonitoringPrometheus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prometheus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

