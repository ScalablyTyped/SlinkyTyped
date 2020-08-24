package typingsSlinky.apolloTracing.mod

import typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin
import typingsSlinky.apolloServerTypes.mod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-tracing", "plugin")
@js.native
object plugin extends js.Object {
  def apply(): js.Function0[ApolloServerPlugin[BaseContext]] = js.native
  def apply(_futureOptions: js.Object): js.Function0[ApolloServerPlugin[BaseContext]] = js.native
}

