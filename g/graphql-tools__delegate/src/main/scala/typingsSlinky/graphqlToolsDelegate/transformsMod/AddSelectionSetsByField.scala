package typingsSlinky.graphqlToolsDelegate.transformsMod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.addSelectionSetsByFieldMod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/transforms", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected () extends default {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}
