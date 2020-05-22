package typingsSlinky.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Added extends js.Object {
  var added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]
  var removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]
}

object Added {
  @scala.inline
  def apply(
    added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact],
    removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
}

