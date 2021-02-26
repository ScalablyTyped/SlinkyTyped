package typingsSlinky.entriaRelayExperimental

import typingsSlinky.entriaRelayExperimental.anon.NetworkCacheConfig
import typingsSlinky.relayRuntime.mod.Observable
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchQueryMod {
  
  @JSImport("@entria/relay-experimental/lib/fetchQuery", "fetchQuery")
  @js.native
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSImport("@entria/relay-experimental/lib/fetchQuery", "fetchQuery")
  @js.native
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
}
