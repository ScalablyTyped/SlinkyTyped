package typingsSlinky.apolloServerErrors.mod

import typingsSlinky.apolloServerErrors.AnonDebug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "formatApolloErrors")
@js.native
object formatApolloErrors extends js.Object {
  def apply(errors: js.Array[js.Error]): js.Array[ApolloError] = js.native
  def apply(errors: js.Array[js.Error], options: AnonDebug): js.Array[ApolloError] = js.native
}

