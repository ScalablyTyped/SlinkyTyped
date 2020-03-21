package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wireMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.wireMod.ExistingConnectConfig
    - typingsSlinky.openfin.wireMod.NewConnectConfig
    - typingsSlinky.openfin.wireMod.ExternalConfig
  */
  type ConnectConfig = typingsSlinky.openfin.wireMod._ConnectConfig | typingsSlinky.openfin.wireMod.NewConnectConfig
  type InternalConnectConfig = typingsSlinky.openfin.wireMod.ExistingConnectConfig | typingsSlinky.openfin.wireMod.NewConnectConfig
  type NewConnectConfig = typingsSlinky.openfin.wireMod.ConfigWithUuid with typingsSlinky.openfin.wireMod.ConfigWithRuntime
  type PortDiscoveryConfig = (typingsSlinky.openfin.wireMod.ExternalConfig with typingsSlinky.openfin.wireMod.ConfigWithRuntime) | typingsSlinky.openfin.wireMod.NewConnectConfig
}
