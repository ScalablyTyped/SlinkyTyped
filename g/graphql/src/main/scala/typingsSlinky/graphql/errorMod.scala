package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  def formatError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  
  def locatedError(originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.UndefOr[scala.Nothing],
    path: Maybe[js.Array[String | Double]]
  ): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError, nodes: js.Array[ASTNode]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: Maybe[js.Array[String | Double]]
  ): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError, nodes: ASTNode): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError,
    nodes: ASTNode,
    path: Maybe[js.Array[String | Double]]
  ): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.UndefOr[scala.Nothing], path: Maybe[js.Array[String | Double]]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.Array[ASTNode]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: ASTNode): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  
  def printError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): String = js.native
  
  def syntaxError(source: Source, position: Double, description: String): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  
  @js.native
  class GraphQLError protected ()
    extends typingsSlinky.graphql.graphQLErrorMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]],
      source: js.UndefOr[Maybe[Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[String | Double]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
}
