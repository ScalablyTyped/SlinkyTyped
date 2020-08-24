package typingsSlinky.graphqlToolsDelegate.mod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected ()
  extends typingsSlinky.graphqlToolsDelegate.transformsMod.AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}

