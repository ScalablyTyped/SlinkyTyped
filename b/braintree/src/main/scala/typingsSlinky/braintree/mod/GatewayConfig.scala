package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintree.mod.KeyGatewayConfig
  - typingsSlinky.braintree.mod.ClientGatewayConfig
  - typingsSlinky.braintree.mod.AccessTokenGatewayConfig
*/
trait GatewayConfig extends js.Object

object GatewayConfig {
  @scala.inline
  implicit def apply(value: AccessTokenGatewayConfig): GatewayConfig = value.asInstanceOf[GatewayConfig]
  @scala.inline
  implicit def apply(value: ClientGatewayConfig): GatewayConfig = value.asInstanceOf[GatewayConfig]
  @scala.inline
  implicit def apply(value: KeyGatewayConfig): GatewayConfig = value.asInstanceOf[GatewayConfig]
}

