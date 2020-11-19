package typingsSlinky.graphqlToolsDelegate.mod

import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected ()
  extends typingsSlinky.graphqlToolsDelegate.transformsMod.AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}
