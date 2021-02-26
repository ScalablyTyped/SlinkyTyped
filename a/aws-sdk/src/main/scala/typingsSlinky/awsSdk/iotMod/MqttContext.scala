package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MqttContext extends StObject {
  
  /**
    * The value of the clientId key in an MQTT authorization request.
    */
  var clientId: js.UndefOr[MqttClientId] = js.native
  
  /**
    * The value of the password key in an MQTT authorization request.
    */
  var password: js.UndefOr[MqttPassword] = js.native
  
  /**
    * The value of the username key in an MQTT authorization request.
    */
  var username: js.UndefOr[MqttUsername] = js.native
}
object MqttContext {
  
  @scala.inline
  def apply(): MqttContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttContext]
  }
  
  @scala.inline
  implicit class MqttContextMutableBuilder[Self <: MqttContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: MqttClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setPassword(value: MqttPassword): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: MqttUsername): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
