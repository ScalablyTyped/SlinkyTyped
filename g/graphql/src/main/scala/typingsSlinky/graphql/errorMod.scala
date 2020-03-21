package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.std.Error
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class GraphQLError protected ()
    extends typingsSlinky.graphql.graphQLErrorMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  def formatError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def printError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def syntaxError(source: Source, position: Double, description: String): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
}

