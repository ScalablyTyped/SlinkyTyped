package typingsSlinky.reactDashRelay.reactDashRelayMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.Anon_RelayRelayPaginationProp
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with Anon_RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}

