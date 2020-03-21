package typingsSlinky.reactRelay.mod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "requestSubscription")
@js.native
object requestSubscription extends js.Object {
  def apply[TSubscriptionPayload](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

