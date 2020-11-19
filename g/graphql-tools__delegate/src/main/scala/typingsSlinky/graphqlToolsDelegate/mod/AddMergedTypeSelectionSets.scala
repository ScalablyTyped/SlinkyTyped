package typingsSlinky.graphqlToolsDelegate.mod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate", "AddMergedTypeSelectionSets")
@js.native
class AddMergedTypeSelectionSets protected ()
  extends typingsSlinky.graphqlToolsDelegate.transformsMod.AddMergedTypeSelectionSets {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}
