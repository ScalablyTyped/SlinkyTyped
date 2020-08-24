package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "formatError")
@js.native
object formatError extends js.Object {
  def apply(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
}

