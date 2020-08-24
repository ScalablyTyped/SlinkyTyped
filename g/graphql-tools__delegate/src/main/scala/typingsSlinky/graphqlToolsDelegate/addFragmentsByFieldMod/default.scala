package typingsSlinky.graphqlToolsDelegate.addFragmentsByFieldMod

import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms/AddFragmentsByField", JSImport.Default)
@js.native
class default protected () extends AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}

