package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.errorFormatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.languageAstMod.ASTNode
import typingsSlinky.graphql.languageSourceMod.Source
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
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
    extends typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError {
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
  
  def formatError(error: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def printError(error: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError): String = js.native
  def syntaxError(source: Source, position: Double, description: String): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
}

