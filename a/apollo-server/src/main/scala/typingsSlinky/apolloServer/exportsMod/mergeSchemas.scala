package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsMerge.mergeSchemasMod.MergeSchemasConfig
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "mergeSchemas")
@js.native
object mergeSchemas extends js.Object {
  
  def apply(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): GraphQLSchema = js.native
}
