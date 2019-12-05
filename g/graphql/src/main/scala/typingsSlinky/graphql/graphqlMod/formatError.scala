package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.errorFormatErrorMod.GraphQLFormattedError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

