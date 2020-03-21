package typingsSlinky.reactRelay.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.AnonRelay
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  def apply[Props](
    Component: ReactComponentClass[Props with AnonRelay],
    fragmentSpec: Record[String, GraphQLTaggedNode]
  ): Container[Props] = js.native
}

