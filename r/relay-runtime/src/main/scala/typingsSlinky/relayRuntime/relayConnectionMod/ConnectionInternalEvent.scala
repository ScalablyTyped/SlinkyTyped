package typingsSlinky.relayRuntime.relayConnectionMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.anon.Args
  - typingsSlinky.relayRuntime.anon.ConnectionID
*/
trait ConnectionInternalEvent extends js.Object

object ConnectionInternalEvent {
  @scala.inline
  def Args(
    args: Variables,
    connectionID: ConnectionID,
    edgeIDs: js.Array[String],
    kind: String,
    pageInfo: PageInfo,
    request: RequestDescriptor
  ): ConnectionInternalEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeIDs = edgeIDs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInternalEvent]
  }
  @scala.inline
  def ConnectionID(
    args: Variables,
    connectionID: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID,
    edgeID: String,
    kind: String,
    request: RequestDescriptor
  ): ConnectionInternalEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeID = edgeID.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInternalEvent]
  }
}

