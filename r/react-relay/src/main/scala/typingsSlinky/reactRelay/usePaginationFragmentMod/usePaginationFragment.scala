package typingsSlinky.reactRelay.usePaginationFragmentMod

import typingsSlinky.reactRelay.helpersMod.KeyType
import typingsSlinky.reactRelay.helpersMod.KeyTypeData
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/usePaginationFragment", "usePaginationFragment")
@js.native
object usePaginationFragment extends js.Object {
  
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey, KeyTypeData[TKey, _]] = js.native
}
