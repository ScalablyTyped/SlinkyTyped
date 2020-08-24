package typingsSlinky.graphqlToolsDelegate.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "getSubschema")
@js.native
object getSubschema extends js.Object {
  def apply(result: js.Any, responseKey: String): GraphQLSchema | SubschemaConfig = js.native
}

