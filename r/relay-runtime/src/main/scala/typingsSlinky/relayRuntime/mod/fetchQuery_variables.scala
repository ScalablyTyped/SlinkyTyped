package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "fetchQuery")
@js.native
object fetchQuery_variables extends js.Object {
  def apply[T /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def apply[T /* <: OperationType */](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
}

