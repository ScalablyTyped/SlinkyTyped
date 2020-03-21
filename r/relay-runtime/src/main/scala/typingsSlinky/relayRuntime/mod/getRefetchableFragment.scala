package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getRefetchableFragment")
@js.native
object getRefetchableFragment extends js.Object {
  def apply(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
}

