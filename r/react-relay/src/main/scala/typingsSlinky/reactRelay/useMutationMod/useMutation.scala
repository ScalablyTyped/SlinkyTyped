package typingsSlinky.reactRelay.useMutationMod

import typingsSlinky.relayRuntime.commitMutationMod.MutationConfig
import typingsSlinky.relayRuntime.commitMutationMod.MutationParameters
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useMutation", "useMutation")
@js.native
object useMutation extends js.Object {
  
  def apply[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def apply[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
}
