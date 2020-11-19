package typingsSlinky.graphqlToolsMerge.mergeTypedefsMod

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge/typedefs-mergers/merge-typedefs", "mergeGraphQLTypes")
@js.native
object mergeGraphQLTypes extends js.Object {
  
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: Config): js.Array[DefinitionNode] = js.native
}
