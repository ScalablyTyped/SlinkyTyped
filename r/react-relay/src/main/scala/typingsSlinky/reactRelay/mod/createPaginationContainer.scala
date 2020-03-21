package typingsSlinky.reactRelay.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.AnonRelayRelayPaginationProp
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with AnonRelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}

