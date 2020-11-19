package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected ()
  extends typingsSlinky.apolloServer.exportsMod.AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}
