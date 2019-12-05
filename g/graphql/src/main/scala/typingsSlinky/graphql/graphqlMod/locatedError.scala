package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.ASTNode
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "locatedError")
@js.native
object locatedError extends js.Object {
  def apply(
    originalError: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
}

