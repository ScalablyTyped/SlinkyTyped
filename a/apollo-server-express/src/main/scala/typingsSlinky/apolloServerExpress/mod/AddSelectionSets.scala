package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "AddSelectionSets")
@js.native
class AddSelectionSets protected ()
  extends typingsSlinky.graphqlTools.mod.AddSelectionSets {
  def this(
    sourceSchema: GraphQLSchema,
    initialType: GraphQLOutputType,
    selectionSetsByType: Record[String, SelectionSetNode],
    selectionSetsByField: Record[String, Record[String, SelectionSetNode]],
    dynamicSelectionSetsByField: Record[
        String, 
        Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
      ]
  ) = this()
}

