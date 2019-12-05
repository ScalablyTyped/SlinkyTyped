package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libStoreRelayModernEnvironmentMod.EnvironmentConfig
import typingsSlinky.relayDashRuntime.libStoreRelayModernEnvironmentMod.RelayModernEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends RelayModernEnvironment {
  def this(config: EnvironmentConfig) = this()
}

