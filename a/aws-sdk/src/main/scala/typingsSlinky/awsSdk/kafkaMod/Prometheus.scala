package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prometheus extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.JmxExporter] = js.native
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.NodeExporter] = js.native
}

object Prometheus {
  @scala.inline
  def apply(): Prometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prometheus]
  }
  @scala.inline
  implicit class PrometheusOps[Self <: Prometheus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJmxExporter(value: JmxExporter): Self = {
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
    def withNodeExporter(value: NodeExporter): Self = {
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

