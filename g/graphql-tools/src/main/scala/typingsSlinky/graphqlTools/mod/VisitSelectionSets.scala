package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "VisitSelectionSets")
@js.native
class VisitSelectionSets protected ()
  extends typingsSlinky.graphqlToolsDelegate.mod.VisitSelectionSets {
  def this(
    schema: GraphQLSchema,
    initialType: GraphQLOutputType,
    visitor: js.Function2[/* node */ SelectionSetNode, /* typeInfo */ TypeInfo, SelectionSetNode]
  ) = this()
}
