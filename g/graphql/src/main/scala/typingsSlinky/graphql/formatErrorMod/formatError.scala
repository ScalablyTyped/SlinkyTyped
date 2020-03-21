package typingsSlinky.graphql.formatErrorMod

import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/formatError", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

