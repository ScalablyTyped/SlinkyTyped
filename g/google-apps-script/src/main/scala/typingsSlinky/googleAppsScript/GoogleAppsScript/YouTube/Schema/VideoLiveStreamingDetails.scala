package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoLiveStreamingDetails extends js.Object {
  var activeLiveChatId: js.UndefOr[String] = js.native
  var actualEndTime: js.UndefOr[String] = js.native
  var actualStartTime: js.UndefOr[String] = js.native
  var concurrentViewers: js.UndefOr[String] = js.native
  var scheduledEndTime: js.UndefOr[String] = js.native
  var scheduledStartTime: js.UndefOr[String] = js.native
}

object VideoLiveStreamingDetails {
  @scala.inline
  def apply(): VideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoLiveStreamingDetails]
  }
  @scala.inline
  implicit class VideoLiveStreamingDetailsOps[Self <: VideoLiveStreamingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLiveChatId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLiveChatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLiveChatId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLiveChatId")(js.undefined)
        ret
    }
    @scala.inline
    def withActualEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withActualStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrentViewers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentViewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentViewers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentViewers")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledEndTime(value: String): Self = {
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
    def withScheduledStartTime(value: String): Self = {
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

