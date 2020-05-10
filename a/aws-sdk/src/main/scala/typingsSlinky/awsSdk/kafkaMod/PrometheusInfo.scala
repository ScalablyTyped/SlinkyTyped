package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrometheusInfo extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[JmxExporterInfo] = js.native
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[NodeExporterInfo] = js.native
}

object PrometheusInfo {
  @scala.inline
  def apply(): PrometheusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrometheusInfo]
  }
  @scala.inline
  implicit class PrometheusInfoOps[Self <: PrometheusInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJmxExporter(value: JmxExporterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JmxExporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJmxExporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JmxExporter")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeExporter(value: NodeExporterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeExporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeExporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeExporter")(js.undefined)
        ret
    }
  }
  
}

