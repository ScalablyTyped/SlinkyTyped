package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "AddSelectionSets")
@js.native
class AddSelectionSets protected ()
  extends typingsSlinky.apolloServer.exportsMod.AddSelectionSets {
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
