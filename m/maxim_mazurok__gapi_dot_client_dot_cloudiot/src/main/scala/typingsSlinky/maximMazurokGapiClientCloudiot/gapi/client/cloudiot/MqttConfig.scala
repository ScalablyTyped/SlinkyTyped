package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MqttConfig extends js.Object {
  
  /** If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail. */
  var mqttEnabledState: js.UndefOr[String] = js.native
}
object MqttConfig {
  
  @scala.inline
  def apply(): MqttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttConfig]
  }
  
  @scala.inline
  implicit class MqttConfigOps[Self <: MqttConfig] (val x: Self) extends AnyVal {
    
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
    def setMqttEnabledState(value: String): Self = this.set("mqttEnabledState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMqttEnabledState: Self = this.set("mqttEnabledState", js.undefined)
  }
}
