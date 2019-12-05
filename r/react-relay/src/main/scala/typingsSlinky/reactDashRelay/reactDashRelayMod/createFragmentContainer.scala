package typingsSlinky.reactDashRelay.reactDashRelayMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashRelay.Anon_Relay
import typingsSlinky.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with Anon_Relay],
    fragmentSpec: Record[String, GraphQLTaggedNode]
  ): Container[Props] = js.native
}

