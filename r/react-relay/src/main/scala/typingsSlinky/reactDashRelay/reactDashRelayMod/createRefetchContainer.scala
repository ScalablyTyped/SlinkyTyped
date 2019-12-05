package typingsSlinky.reactDashRelay.reactDashRelayMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.Anon_RelayRelayRefetchProp
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createRefetchContainer")
@js.native
object createRefetchContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with Anon_RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
}

