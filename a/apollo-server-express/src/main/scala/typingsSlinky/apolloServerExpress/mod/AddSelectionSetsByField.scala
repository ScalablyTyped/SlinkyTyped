package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected ()
  extends typingsSlinky.graphqlTools.mod.AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}
