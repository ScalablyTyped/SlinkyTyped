package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMonitoringInfo extends js.Object {
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: PrometheusInfo = js.native
}

object OpenMonitoringInfo {
  @scala.inline
  def apply(Prometheus: PrometheusInfo): OpenMonitoringInfo = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoringInfo]
  }
  @scala.inline
  implicit class OpenMonitoringInfoOps[Self <: OpenMonitoringInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrometheus(value: PrometheusInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prometheus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

