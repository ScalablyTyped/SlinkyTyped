package typingsSlinky.graphql.directivesMod

import typingsSlinky.graphql.anon.GraphQLDirectiveConfigarg
import typingsSlinky.graphql.anon.ReadonlyGraphQLDirectiveC
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.directiveLocationMod.DirectiveLocationEnum
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/directives", "GraphQLDirective")
@js.native
class GraphQLDirective protected () extends js.Object {
  def this(config: ReadonlyGraphQLDirectiveC) = this()
  var args: js.Array[GraphQLArgument] = js.native
  var astNode: Maybe[DirectiveDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensions: Maybe[js.Object] = js.native
  var isRepeatable: Boolean = js.native
  var locations: js.Array[DirectiveLocationEnum] = js.native
  var name: String = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLDirectiveConfigarg = js.native
  def toJSON(): String = js.native
}

