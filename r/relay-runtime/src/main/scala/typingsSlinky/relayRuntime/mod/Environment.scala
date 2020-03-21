package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typingsSlinky.relayRuntime.relayModernEnvironmentMod.RelayModernEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends RelayModernEnvironment {
  def this(config: EnvironmentConfig) = this()
}

