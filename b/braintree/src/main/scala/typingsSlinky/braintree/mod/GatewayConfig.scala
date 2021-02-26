package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.mod.KeyGatewayConfig
  - typingsSlinky.braintree.mod.ClientGatewayConfig
  - typingsSlinky.braintree.mod.AccessTokenGatewayConfig
*/
trait GatewayConfig extends StObject
object GatewayConfig {
  
  @scala.inline
  def AccessTokenGatewayConfig(accessToken: String): typingsSlinky.braintree.mod.AccessTokenGatewayConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.AccessTokenGatewayConfig]
  }
  
  @scala.inline
  def ClientGatewayConfig(clientId: String, clientSecret: String): typingsSlinky.braintree.mod.ClientGatewayConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.ClientGatewayConfig]
  }
  
  @scala.inline
  def KeyGatewayConfig(environment: Environment, merchantId: String, privateKey: String, publicKey: String): typingsSlinky.braintree.mod.KeyGatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintree.mod.KeyGatewayConfig]
  }
}
