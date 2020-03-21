package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getRequest")
@js.native
object getRequest extends js.Object {
  def apply(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
}

