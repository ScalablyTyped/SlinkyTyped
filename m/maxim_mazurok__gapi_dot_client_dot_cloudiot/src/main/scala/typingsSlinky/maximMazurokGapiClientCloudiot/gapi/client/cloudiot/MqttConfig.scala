package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MqttConfig extends StObject {
  
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
  implicit class MqttConfigMutableBuilder[Self <: MqttConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMqttEnabledState(value: String): Self = StObject.set(x, "mqttEnabledState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqttEnabledStateUndefined: Self = StObject.set(x, "mqttEnabledState", js.undefined)
  }
}
