package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerCore.anon.GraphQLSchemasymbolPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/schemaInstrumentation", JSImport.Namespace)
@js.native
object schemaInstrumentationMod extends js.Object {
  val symbolExecutionDispatcherWillResolveField: js.Symbol = js.native
  val symbolPluginsEnabled: js.Symbol = js.native
  val symbolUserFieldResolver: js.Symbol = js.native
  def enablePluginsForSchemaResolvers(schema: GraphQLSchemasymbolPlugin): GraphQLSchemasymbolPlugin = js.native
  def whenResultIsFinished(
    result: js.Any,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

