package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaveUnmerged extends js.Object {
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.native
  var leaveUnmerged: js.UndefOr[Boolean] = js.native
}

object LeaveUnmerged {
  @scala.inline
  def apply(): LeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveUnmerged]
  }
  @scala.inline
  implicit class LeaveUnmergedOps[Self <: LeaveUnmerged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoNotResetEntireContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotResetEntireContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotResetEntireContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotResetEntireContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaveUnmerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveUnmerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveUnmerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveUnmerged")(js.undefined)
        ret
    }
  }
  
}

