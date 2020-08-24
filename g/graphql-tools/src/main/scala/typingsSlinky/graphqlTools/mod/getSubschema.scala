package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "getSubschema")
@js.native
object getSubschema extends js.Object {
  def apply(result: js.Any, responseKey: String): GraphQLSchema | SubschemaConfig = js.native
}

