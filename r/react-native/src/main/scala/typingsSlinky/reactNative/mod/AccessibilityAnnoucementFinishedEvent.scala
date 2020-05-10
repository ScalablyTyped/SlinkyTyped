package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityAnnoucementFinishedEvent extends js.Object {
  var announcement: String = js.native
  var success: Boolean = js.native
}

object AccessibilityAnnoucementFinishedEvent {
  @scala.inline
  def apply(announcement: String, success: Boolean): AccessibilityAnnoucementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAnnoucementFinishedEvent]
  }
  @scala.inline
  implicit class AccessibilityAnnoucementFinishedEventOps[Self <: AccessibilityAnnoucementFinishedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnouncement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

