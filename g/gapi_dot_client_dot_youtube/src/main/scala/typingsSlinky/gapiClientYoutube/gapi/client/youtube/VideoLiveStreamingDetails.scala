package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoLiveStreamingDetails extends js.Object {
  /**
    * The ID of the currently active live chat attached to this video. This field is filled only if the video is a currently live broadcast that has live
    * chat. Once the broadcast transitions to complete this field will be removed and the live chat closed down. For persistent broadcasts that live chat id
    * will no longer be tied to this video but rather to the new video being displayed at the persistent page.
    */
  var activeLiveChatId: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually ended. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available until
    * the broadcast is over.
    */
  var actualEndTime: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast actually started. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available
    * until the broadcast begins.
    */
  var actualStartTime: js.UndefOr[String] = js.native
  /**
    * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the
    * broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the
    * broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
    */
  var concurrentViewers: js.UndefOr[String] = js.native
  /**
    * The time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. If the value is empty or the
    * property is not present, then the broadcast is scheduled to continue indefinitely.
    */
  var scheduledEndTime: js.UndefOr[String] = js.native
  /** The time that the broadcast is scheduled to begin. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
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

