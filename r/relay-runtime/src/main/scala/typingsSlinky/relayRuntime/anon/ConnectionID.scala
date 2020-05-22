package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionID extends ConnectionInternalEvent {
  var args: Variables
  var connectionID: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID
  var edgeID: String
  var kind: String
  var request: RequestDescriptor
}

object ConnectionID {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): ConnectionID = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionID]
  }
}

