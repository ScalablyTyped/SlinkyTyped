package typingsSlinky.graphqlToolsDelegate.transformsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.addArgumentsAsVariablesMod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddArgumentsAsVariables")
@js.native
class AddArgumentsAsVariables protected () extends default {
  def this(targetSchema: GraphQLSchema, args: Record[String, _]) = this()
}

