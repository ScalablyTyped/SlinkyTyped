package typingsSlinky.apolloDashServerDashCore.distRunHttpQueryMod

import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.debug
import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatError
import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "throwHttpGraphQLError")
@js.native
object throwHttpGraphQLError extends js.Object {
  def apply[E /* <: js.Error */](statusCode: Double, errors: js.Array[E]): scala.Nothing = js.native
  def apply[E /* <: js.Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: Pick[GraphQLServerOptions[Record[String, _], _], debug | formatError]
  ): scala.Nothing = js.native
  def apply[E /* <: js.Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: Pick[GraphQLServerOptions[Record[String, _], _], debug | formatError],
    extensions: Record[String, _]
  ): scala.Nothing = js.native
}

