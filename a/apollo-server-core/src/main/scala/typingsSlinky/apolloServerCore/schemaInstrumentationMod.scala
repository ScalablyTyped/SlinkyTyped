package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerCore.anon.GraphQLSchemasymbolPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/utils/schemaInstrumentation", JSImport.Namespace)
@js.native
object schemaInstrumentationMod extends js.Object {
  
  def enablePluginsForSchemaResolvers(schema: GraphQLSchemasymbolPlugin): GraphQLSchemasymbolPlugin = js.native
  
  val symbolExecutionDispatcherWillResolveField: js.Symbol = js.native
  
  val symbolPluginsEnabled: js.Symbol = js.native
  
  val symbolUserFieldResolver: js.Symbol = js.native
  
  def whenResultIsFinished(
    result: js.Any,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}
