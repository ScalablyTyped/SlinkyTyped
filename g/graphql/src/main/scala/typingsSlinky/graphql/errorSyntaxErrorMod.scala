package typingsSlinky.graphql

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/syntaxError", JSImport.Namespace)
@js.native
object errorSyntaxErrorMod extends js.Object {
  def syntaxError(source: Source, position: Double, description: String): GraphQLError = js.native
}

