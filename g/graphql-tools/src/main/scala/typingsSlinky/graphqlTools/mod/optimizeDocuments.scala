package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsRelayOperationOptimizer.mod.OptimizeDocumentsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "optimizeDocuments")
@js.native
object optimizeDocuments extends js.Object {
  
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode]): js.Array[DocumentNode] = js.native
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode], options: OptimizeDocumentsOptions): js.Array[DocumentNode] = js.native
}
