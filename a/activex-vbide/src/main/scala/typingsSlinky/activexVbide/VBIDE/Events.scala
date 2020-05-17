package typingsSlinky.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  @JSName("VBIDE.Events_typekey")
  var VBIDEDotEvents_typekey: Events = js.native
  def CommandBarEvents(CommandBarControl: js.Any): typingsSlinky.activexVbide.VBIDE.CommandBarEvents = js.native
  def ReferencesEvents(VBProject: VBProject): typingsSlinky.activexVbide.VBIDE.ReferencesEvents = js.native
}

object Events {
  @scala.inline
  def apply(
    CommandBarEvents: js.Any => CommandBarEvents,
    ReferencesEvents: VBProject => ReferencesEvents,
    VBIDEDotEvents_typekey: Events
  ): Events = {
    val __obj = js.Dynamic.literal(CommandBarEvents = js.Any.fromFunction1(CommandBarEvents), ReferencesEvents = js.Any.fromFunction1(ReferencesEvents))
    __obj.updateDynamic("VBIDE.Events_typekey")(VBIDEDotEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandBarEvents(value: js.Any => CommandBarEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandBarEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReferencesEvents(value: VBProject => ReferencesEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencesEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVBIDEDotEvents_typekey(value: Events): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBIDE.Events_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

