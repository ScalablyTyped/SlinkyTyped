package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheus extends js.Object {
  /**
    * Configuration block for JMX Exporter. See below.
    */
  var jmxExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusJmxExporter]] = js.native
  /**
    * Configuration block for Node Exporter. See below.
    */
  var nodeExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusNodeExporter]] = js.native
}

object ClusterOpenMonitoringPrometheus {
  @scala.inline
  def apply(): ClusterOpenMonitoringPrometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheus]
  }
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusOps[Self <: ClusterOpenMonitoringPrometheus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJmxExporter(value: Input[ClusterOpenMonitoringPrometheusJmxExporter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jmxExporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJmxExporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jmxExporter")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeExporter(value: Input[ClusterOpenMonitoringPrometheusNodeExporter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeExporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExporter")(js.undefined)
        ret
    }
  }
  
}

