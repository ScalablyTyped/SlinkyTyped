package typingsSlinky.reactRelay.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TSubscription /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
}
