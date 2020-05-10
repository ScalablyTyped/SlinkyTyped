package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastStatus extends js.Object {
  var lifeCycleStatus: js.UndefOr[String] = js.native
  var liveBroadcastPriority: js.UndefOr[String] = js.native
  var privacyStatus: js.UndefOr[String] = js.native
  var recordingStatus: js.UndefOr[String] = js.native
}

object LiveBroadcastStatus {
  @scala.inline
  def apply(): LiveBroadcastStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatus]
  }
  @scala.inline
  implicit class LiveBroadcastStatusOps[Self <: LiveBroadcastStatus] (val x: Self) extends AnyVal {
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

