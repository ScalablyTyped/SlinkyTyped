package typingsSlinky.relayDashRuntime.libHandlersConnectionRelayConnectionHandlerMod

import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/RelayConnectionHandler", "createEdge")
@js.native
object createEdge extends js.Object {
  def apply(
    store: RecordSourceProxy,
    record: RecordProxy[js.Object],
    node: RecordProxy[js.Object],
    edgeType: String
  ): RecordProxy[js.Object] = js.native
}

