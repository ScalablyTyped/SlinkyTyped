package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.closed
import typingsSlinky.ably.ablyStrings.closing
import typingsSlinky.ably.ablyStrings.connected
import typingsSlinky.ably.ablyStrings.connecting
import typingsSlinky.ably.ablyStrings.disconnected
import typingsSlinky.ably.ablyStrings.failed_
import typingsSlinky.ably.ablyStrings.initialized
import typingsSlinky.ably.ablyStrings.suspended
import typingsSlinky.ably.ablyStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.mod.Types.ConnectionEvent.INITIALIZED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.CONNECTED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.CONNECTING
  - typingsSlinky.ably.mod.Types.ConnectionEvent.DISCONNECTED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.SUSPENDED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.CLOSED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.CLOSING
  - typingsSlinky.ably.mod.Types.ConnectionEvent.FAILED
  - typingsSlinky.ably.mod.Types.ConnectionEvent.UPDATE
*/
trait ConnectionEvent extends js.Object

@JSImport("ably", "Types.ConnectionEvent")
@js.native
object ConnectionEvent extends js.Object {
  type CLOSED = closed
  type CLOSING = closing
  type CONNECTED = connected
  type CONNECTING = connecting
  type DISCONNECTED = disconnected
  type FAILED = failed_
  type INITIALIZED = initialized
  type SUSPENDED = suspended
  type UPDATE = update
}

