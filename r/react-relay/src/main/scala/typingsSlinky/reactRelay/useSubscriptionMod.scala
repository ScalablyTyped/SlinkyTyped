package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.anon.FnCall
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useSubscription", JSImport.Namespace)
@js.native
object useSubscriptionMod extends js.Object {
  
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}
