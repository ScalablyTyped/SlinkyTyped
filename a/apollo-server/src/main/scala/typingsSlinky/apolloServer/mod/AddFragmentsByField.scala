package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected ()
  extends typingsSlinky.apolloServer.exportsMod.AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}
