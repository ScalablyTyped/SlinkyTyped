package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbFoxxGraphqlMod {
  import typingsSlinky.graphql.errorFormatErrorMod.GraphQLFormattedError
  import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
  import typingsSlinky.std.Record

  type GraphQLFormatErrorFunction = js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, js.Any]]]
  type GraphQLModule = js.Object
}
