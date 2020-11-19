package typingsSlinky.apolloServerErrors.mod

import typingsSlinky.apolloServerErrors.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-errors", "formatApolloErrors")
@js.native
object formatApolloErrors extends js.Object {
  
  def apply(errors: js.Array[js.Error]): js.Array[ApolloError] = js.native
  def apply(errors: js.Array[js.Error], options: Debug): js.Array[ApolloError] = js.native
}
