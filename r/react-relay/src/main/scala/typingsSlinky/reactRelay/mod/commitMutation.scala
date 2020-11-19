package typingsSlinky.reactRelay.mod

import typingsSlinky.relayRuntime.commitMutationMod.MutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationParameters
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay", "commitMutation")
@js.native
object commitMutation extends js.Object {
  
  def apply[TOperation /* <: MutationParameters */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}
