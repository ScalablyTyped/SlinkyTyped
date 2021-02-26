package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientGatewayConfig extends GatewayConfig {
  
  var clientId: String = js.native
  
  var clientSecret: String = js.native
}
object ClientGatewayConfig {
  
  @scala.inline
  def apply(clientId: String, clientSecret: String): ClientGatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGatewayConfig]
  }
  
  @scala.inline
  implicit class ClientGatewayConfigMutableBuilder[Self <: ClientGatewayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
