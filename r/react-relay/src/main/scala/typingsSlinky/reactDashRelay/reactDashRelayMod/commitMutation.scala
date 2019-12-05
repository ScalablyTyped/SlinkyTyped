package typingsSlinky.reactDashRelay.reactDashRelayMod

import typingsSlinky.relayDashRuntime.libMutationsCommitMutationMod.MutationConfig
import typingsSlinky.relayDashRuntime.libMutationsCommitMutationMod.MutationParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "commitMutation")
@js.native
object commitMutation extends js.Object {
  def apply[TOperation /* <: MutationParameters */](
    environment: typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}

