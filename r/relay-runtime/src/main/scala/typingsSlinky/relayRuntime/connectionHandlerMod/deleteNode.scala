package typingsSlinky.relayRuntime.connectionHandlerMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/connection/ConnectionHandler", "deleteNode")
@js.native
object deleteNode extends js.Object {
  def apply(record: RecordProxy[js.Object], nodeID: DataID): Unit = js.native
}

