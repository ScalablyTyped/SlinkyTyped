package typingsSlinky.reactRelay.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.anon.RelayRelayRefetchProp
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createRefetchContainer")
@js.native
object createRefetchContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
}

