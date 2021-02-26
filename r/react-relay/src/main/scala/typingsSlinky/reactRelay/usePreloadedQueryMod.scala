package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.anon.UNSTABLErenderPolicy
import typingsSlinky.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsSlinky.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePreloadedQueryMod {
  
  @JSImport("react-relay/lib/relay-experimental/usePreloadedQuery", "usePreloadedQuery")
  @js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSImport("react-relay/lib/relay-experimental/usePreloadedQuery", "usePreloadedQuery")
  @js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, _]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
}
