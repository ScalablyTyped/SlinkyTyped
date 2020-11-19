package typingsSlinky.graphqlToolsDelegate.addSelectionSetsByTypeMod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/transforms/AddSelectionSetsByType", JSImport.Default)
@js.native
class default protected () extends AddSelectionSetsByType {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}
