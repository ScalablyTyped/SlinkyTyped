package typingsSlinky.entriaRelayExperimental

import typingsSlinky.entriaRelayExperimental.anon.NetworkCacheConfig
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/fetchQuery", JSImport.Namespace)
@js.native
object fetchQueryMod extends js.Object {
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
}

