package typingsSlinky.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDoNotResetEntireContent extends js.Object {
  var doNotResetEntireContent: Boolean = js.native
  var leaveUnmerged: Boolean = js.native
}

object AnonDoNotResetEntireContent {
  @scala.inline
  def apply(doNotResetEntireContent: Boolean, leaveUnmerged: Boolean): AnonDoNotResetEntireContent = {
    val __obj = js.Dynamic.literal(doNotResetEntireContent = doNotResetEntireContent.asInstanceOf[js.Any], leaveUnmerged = leaveUnmerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoNotResetEntireContent]
  }
  @scala.inline
  implicit class AnonDoNotResetEntireContentOps[Self <: AnonDoNotResetEntireContent] (val x: Self) extends AnyVal {
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
    def withLeaveUnmerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveUnmerged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

