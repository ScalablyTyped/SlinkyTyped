package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/error/locatedError", JSImport.Namespace)
@js.native
object locatedErrorMod extends js.Object {
  
  def locatedError(originalError: GraphQLError): GraphQLError = js.native
  def locatedError(
    originalError: GraphQLError,
    nodes: js.UndefOr[scala.Nothing],
    path: Maybe[js.Array[String | Double]]
  ): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: js.Array[ASTNode]): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: ASTNode): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: js.Error): GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.UndefOr[scala.Nothing], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.Array[ASTNode]): GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: ASTNode): GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
}
