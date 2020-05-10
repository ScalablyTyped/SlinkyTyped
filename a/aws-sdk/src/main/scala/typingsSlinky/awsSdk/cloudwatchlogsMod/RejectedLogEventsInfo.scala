package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectedLogEventsInfo extends js.Object {
  /**
    * The expired log events.
    */
  var expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
  /**
    * The log events that are too new.
    */
  var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.native
  /**
    * The log events that are too old.
    */
  var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
}

object RejectedLogEventsInfo {
  @scala.inline
  def apply(): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
  @scala.inline
  implicit class RejectedLogEventsInfoOps[Self <: RejectedLogEventsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiredLogEventEndIndex(value: LogEventIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredLogEventEndIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredLogEventEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredLogEventEndIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTooNewLogEventStartIndex(value: LogEventIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooNewLogEventStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooNewLogEventStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooNewLogEventStartIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTooOldLogEventEndIndex(value: LogEventIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooOldLogEventEndIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooOldLogEventEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooOldLogEventEndIndex")(js.undefined)
        ret
    }
  }
  
}

