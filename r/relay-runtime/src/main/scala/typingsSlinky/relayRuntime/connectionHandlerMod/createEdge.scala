package typingsSlinky.relayRuntime.connectionHandlerMod

import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "createEdge")
@js.native
object createEdge extends js.Object {
  
  def apply(
    store: RecordSourceProxy,
    record: RecordProxy[js.Object],
    node: RecordProxy[js.Object],
    edgeType: String
  ): RecordProxy[js.Object] = js.native
}
