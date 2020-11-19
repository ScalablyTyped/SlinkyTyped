package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLExecutionContext
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express", "collectFields")
@js.native
object collectFields extends js.Object {
  
  def apply(
    exeContext: GraphQLExecutionContext,
    runtimeType: GraphQLObjectType[_, _],
    selectionSet: SelectionSetNode,
    fields: Record[String, js.Array[FieldNode]],
    visitedFragmentNames: Record[String, Boolean]
  ): Record[String, js.Array[FieldNode]] = js.native
}
