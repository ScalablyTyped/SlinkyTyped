package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.attached
import typingsSlinky.ably.ablyStrings.attaching
import typingsSlinky.ably.ablyStrings.detached
import typingsSlinky.ably.ablyStrings.detaching
import typingsSlinky.ably.ablyStrings.failed_
import typingsSlinky.ably.ablyStrings.initialized
import typingsSlinky.ably.ablyStrings.suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.mod.Types.ChannelState.FAILED
  - typingsSlinky.ably.mod.Types.ChannelState.INITIALIZED
  - typingsSlinky.ably.mod.Types.ChannelState.SUSPENDED
  - typingsSlinky.ably.mod.Types.ChannelState.ATTACHED
  - typingsSlinky.ably.mod.Types.ChannelState.ATTACHING
  - typingsSlinky.ably.mod.Types.ChannelState.DETACHED
  - typingsSlinky.ably.mod.Types.ChannelState.DETACHING
*/
trait ChannelState extends js.Object

@JSImport("ably", "Types.ChannelState")
@js.native
object ChannelState extends js.Object {
  type ATTACHED = attached
  type ATTACHING = attaching
  type DETACHED = detached
  type DETACHING = detaching
  type FAILED = failed_
  type INITIALIZED = initialized
  type SUSPENDED = suspended
}

