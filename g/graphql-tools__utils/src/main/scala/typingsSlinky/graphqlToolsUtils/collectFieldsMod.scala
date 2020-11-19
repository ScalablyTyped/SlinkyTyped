package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLExecutionContext
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/collectFields", JSImport.Namespace)
@js.native
object collectFieldsMod extends js.Object {
  
  def collectFields(
    exeContext: GraphQLExecutionContext,
    runtimeType: GraphQLObjectType[_, _],
    selectionSet: SelectionSetNode,
    fields: Record[String, js.Array[FieldNode]],
    visitedFragmentNames: Record[String, Boolean]
  ): Record[String, js.Array[FieldNode]] = js.native
}
