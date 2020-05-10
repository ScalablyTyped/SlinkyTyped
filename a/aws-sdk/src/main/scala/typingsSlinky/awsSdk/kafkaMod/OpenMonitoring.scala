package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMonitoring extends js.Object {
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: typingsSlinky.awsSdk.kafkaMod.Prometheus = js.native
}

object OpenMonitoring {
  @scala.inline
  def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
  @scala.inline
  implicit class OpenMonitoringOps[Self <: OpenMonitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrometheus(value: Prometheus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prometheus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

