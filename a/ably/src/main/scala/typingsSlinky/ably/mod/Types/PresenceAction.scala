package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.absent
import typingsSlinky.ably.ablyStrings.enter
import typingsSlinky.ably.ablyStrings.leave
import typingsSlinky.ably.ablyStrings.present
import typingsSlinky.ably.ablyStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.mod.Types.PresenceAction.ABSENT
  - typingsSlinky.ably.mod.Types.PresenceAction.PRESENT
  - typingsSlinky.ably.mod.Types.PresenceAction.ENTER
  - typingsSlinky.ably.mod.Types.PresenceAction.LEAVE
  - typingsSlinky.ably.mod.Types.PresenceAction.UPDATE
*/
trait PresenceAction extends js.Object

@JSImport("ably", "Types.PresenceAction")
@js.native
object PresenceAction extends js.Object {
  type ABSENT = absent
  type ENTER = enter
  type LEAVE = leave
  type PRESENT = present
  type UPDATE = update
}

