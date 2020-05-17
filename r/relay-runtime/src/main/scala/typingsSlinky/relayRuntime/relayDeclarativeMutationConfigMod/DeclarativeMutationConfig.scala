package typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig
  - typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig
  - typingsSlinky.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig
*/
trait DeclarativeMutationConfig extends js.Object

object DeclarativeMutationConfig {
  @scala.inline
  implicit def apply(value: NodeDeleteConfig): DeclarativeMutationConfig = value.asInstanceOf[DeclarativeMutationConfig]
  @scala.inline
  implicit def apply(value: RangeAddConfig): DeclarativeMutationConfig = value.asInstanceOf[DeclarativeMutationConfig]
  @scala.inline
  implicit def apply(value: RangeDeleteConfig): DeclarativeMutationConfig = value.asInstanceOf[DeclarativeMutationConfig]
}

