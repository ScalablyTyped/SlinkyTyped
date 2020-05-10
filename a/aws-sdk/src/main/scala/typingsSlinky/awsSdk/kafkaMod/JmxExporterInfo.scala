package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JmxExporterInfo extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var EnabledInBroker: boolean = js.native
}

object JmxExporterInfo {
  @scala.inline
  def apply(EnabledInBroker: boolean): JmxExporterInfo = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JmxExporterInfo]
  }
  @scala.inline
  implicit class JmxExporterInfoOps[Self <: JmxExporterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabledInBroker(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledInBroker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

