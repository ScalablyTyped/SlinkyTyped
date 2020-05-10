package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveBroadcastStatus extends js.Object {
  /**
    * The broadcast&#39;s status. The status can be updated using the API&#39;s
    * liveBroadcasts.transition method.
    */
  var lifeCycleStatus: js.UndefOr[String] = js.native
  /**
    * Priority of the live broadcast event (internal state).
    */
  var liveBroadcastPriority: js.UndefOr[String] = js.native
  /**
    * The broadcast&#39;s privacy status. Note that the broadcast represents
    * exactly one YouTube video, so the privacy settings are identical to those
    * supported for videos. In addition, you can set this field by modifying
    * the broadcast resource or by setting the privacyStatus field of the
    * corresponding video resource.
    */
  var privacyStatus: js.UndefOr[String] = js.native
  /**
    * The broadcast&#39;s recording status.
    */
  var recordingStatus: js.UndefOr[String] = js.native
}

object SchemaLiveBroadcastStatus {
  @scala.inline
  def apply(): SchemaLiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastStatus]
  }
  @scala.inline
  implicit class SchemaLiveBroadcastStatusOps[Self <: SchemaLiveBroadcastStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifeCycleStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifeCycleStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifeCycleStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifeCycleStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveBroadcastPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveBroadcastPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingStatus")(js.undefined)
        ret
    }
  }
  
}

