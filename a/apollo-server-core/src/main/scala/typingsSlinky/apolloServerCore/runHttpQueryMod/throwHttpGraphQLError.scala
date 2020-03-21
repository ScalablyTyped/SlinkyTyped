package typingsSlinky.apolloServerCore.runHttpQueryMod

import typingsSlinky.apolloServerCore.PickdefaultRecordstringan
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "throwHttpGraphQLError")
@js.native
object throwHttpGraphQLError extends js.Object {
  def apply[E /* <: js.Error */](statusCode: Double, errors: js.Array[E]): scala.Nothing = js.native
  def apply[E /* <: js.Error */](statusCode: Double, errors: js.Array[E], options: PickdefaultRecordstringan): scala.Nothing = js.native
  def apply[E /* <: js.Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: PickdefaultRecordstringan,
    extensions: Record[String, _]
  ): scala.Nothing = js.native
}

