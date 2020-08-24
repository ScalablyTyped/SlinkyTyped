package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.getDirectivesMod.DirectableGraphQLObject
import typingsSlinky.graphqlToolsUtils.getDirectivesMod.DirectiveUseMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "getDirectives")
@js.native
object getDirectives extends js.Object {
  def apply(schema: GraphQLSchema, node: DirectableGraphQLObject): DirectiveUseMap = js.native
}

