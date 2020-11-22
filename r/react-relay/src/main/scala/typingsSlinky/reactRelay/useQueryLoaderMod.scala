package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.LoadQueryOptions
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useQueryLoader", JSImport.Namespace)
@js.native
object useQueryLoaderMod extends js.Object {
  
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = js.native
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = js.native
  
  type useQueryLoaderHookType[TQuery /* <: OperationType */] = js.Tuple3[
    js.UndefOr[
      (PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, js.Any]]]) | Null
    ], 
    js.Function2[
      /* variables */ VariablesOf[TQuery], 
      /* options */ js.UndefOr[LoadQueryOptions], 
      Unit
    ], 
    DisposeFn
  ]
}
