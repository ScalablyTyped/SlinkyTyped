package typingsSlinky.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.wireMod.ExternalConfig with typingsSlinky.openfin.wireMod.ConfigWithRuntime
  - typingsSlinky.openfin.wireMod.NewConnectConfig
*/
trait PortDiscoveryConfig extends js.Object

object PortDiscoveryConfig {
  @scala.inline
  implicit def apply(value: ExternalConfig with ConfigWithRuntime): PortDiscoveryConfig = value.asInstanceOf[PortDiscoveryConfig]
  @scala.inline
  implicit def apply(value: NewConnectConfig): PortDiscoveryConfig = value.asInstanceOf[PortDiscoveryConfig]
}

