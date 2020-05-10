package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowupFlag extends js.Object {
  // The date and time that the follow-up was finished.
  var completedDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The date and time that the follow-up is to be finished.
  var dueDateTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
  var flagStatus: js.UndefOr[FollowupFlagStatus] = js.native
  // The date and time that the follow-up is to begin.
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.native
}

object FollowupFlag {
  @scala.inline
  def apply(): FollowupFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FollowupFlag]
  }
  @scala.inline
  implicit class FollowupFlagOps[Self <: FollowupFlag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedDateTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDueDateTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagStatus(value: FollowupFlagStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
        ret
    }
  }
  
}

