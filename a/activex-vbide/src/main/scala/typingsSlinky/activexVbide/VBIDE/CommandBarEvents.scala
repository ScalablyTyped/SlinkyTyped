package typingsSlinky.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBarEvents extends js.Object {
  @JSName("VBIDE.CommandBarEvents_typekey")
  var VBIDEDotCommandBarEvents_typekey: CommandBarEvents = js.native
}

object CommandBarEvents {
  @scala.inline
  def apply(VBIDEDotCommandBarEvents_typekey: CommandBarEvents): CommandBarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VBIDE.CommandBarEvents_typekey")(VBIDEDotCommandBarEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandBarEvents]
  }
  @scala.inline
  implicit class CommandBarEventsOps[Self <: CommandBarEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVBIDEDotCommandBarEvents_typekey(value: CommandBarEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBIDE.CommandBarEvents_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

