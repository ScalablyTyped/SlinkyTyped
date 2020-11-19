package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected ()
  extends typingsSlinky.graphqlTools.mod.AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}
