package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsMessageTypes extends js.Object {
  var all: StatsMessageCount = js.native
  var messages: StatsMessageCount = js.native
  var presence: StatsMessageCount = js.native
}

object StatsMessageTypes {
  @scala.inline
  def apply(all: StatsMessageCount, messages: StatsMessageCount, presence: StatsMessageCount): StatsMessageTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsMessageTypes]
  }
  @scala.inline
  implicit class StatsMessageTypesOps[Self <: StatsMessageTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: StatsMessageCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: StatsMessageCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresence(value: StatsMessageCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

