package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticRepliesMailTips extends js.Object {
  // The automatic reply message.
  var message: js.UndefOr[String] = js.native
  // The language that the automatic reply message is in.
  var messageLanguage: js.UndefOr[LocaleInfo] = js.native
  // The date and time that automatic replies are set to end.
  var scheduledEndTime: js.UndefOr[DateTimeTimeZone] = js.native
  // The date and time that automatic replies are set to begin.
  var scheduledStartTime: js.UndefOr[DateTimeTimeZone] = js.native
}

object AutomaticRepliesMailTips {
  @scala.inline
  def apply(): AutomaticRepliesMailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesMailTips]
  }
  @scala.inline
  implicit class AutomaticRepliesMailTipsOps[Self <: AutomaticRepliesMailTips] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageLanguage(value: LocaleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledEndTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledStartTime(value: DateTimeTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledStartTime")(js.undefined)
        ret
    }
  }
  
}

