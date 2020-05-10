package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.MessageEventID
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentTime extends js.Object {
  var currentTime: js.UndefOr[Timestamp] = js.native
  var fullSyncBefore: js.UndefOr[Timestamp] = js.native
  var updateCount: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
  var userLastUpdated: js.UndefOr[Timestamp] = js.native
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.native
}

object AnonCurrentTime {
  @scala.inline
  def apply(): AnonCurrentTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrentTime]
  }
  @scala.inline
  implicit class AnonCurrentTimeOps[Self <: AnonCurrentTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFullSyncBefore(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullSyncBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullSyncBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullSyncBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLastUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMaxMessageEventId(value: MessageEventID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMaxMessageEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMaxMessageEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMaxMessageEventId")(js.undefined)
        ret
    }
  }
  
}

