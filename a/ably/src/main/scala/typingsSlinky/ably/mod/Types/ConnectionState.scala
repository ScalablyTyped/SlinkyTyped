package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.closed
import typingsSlinky.ably.ablyStrings.closing
import typingsSlinky.ably.ablyStrings.connected
import typingsSlinky.ably.ablyStrings.connecting
import typingsSlinky.ably.ablyStrings.disconnected
import typingsSlinky.ably.ablyStrings.failed_
import typingsSlinky.ably.ablyStrings.initialized
import typingsSlinky.ably.ablyStrings.suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.mod.Types.ConnectionState.INITIALIZED
  - typingsSlinky.ably.mod.Types.ConnectionState.CONNECTED
  - typingsSlinky.ably.mod.Types.ConnectionState.CONNECTING
  - typingsSlinky.ably.mod.Types.ConnectionState.DISCONNECTED
  - typingsSlinky.ably.mod.Types.ConnectionState.SUSPENDED
  - typingsSlinky.ably.mod.Types.ConnectionState.CLOSED
  - typingsSlinky.ably.mod.Types.ConnectionState.CLOSING
  - typingsSlinky.ably.mod.Types.ConnectionState.FAILED
*/
trait ConnectionState extends js.Object

@JSImport("ably", "Types.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  type CLOSED = closed
  type CLOSING = closing
  type CONNECTED = connected
  type CONNECTING = connecting
  type DISCONNECTED = disconnected
  type FAILED = failed_
  type INITIALIZED = initialized
  type SUSPENDED = suspended
}

