package typingsSlinky.graphqlToolsMerge.mergeSchemasMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge/merge-schemas", "mergeSchemasAsync")
@js.native
object mergeSchemasAsync extends js.Object {
  
  def apply(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): js.Promise[GraphQLSchema] = js.native
}
