package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archive extends js.Object {
  var createdAt: Double = js.native
  var duration: String = js.native
  var hasAudio: Boolean = js.native
  var hasVideo: Boolean = js.native
  var id: String = js.native
  var name: String = js.native
  var outputMode: OutputMode = js.native
  var partnerId: String = js.native
  var reason: String = js.native
  var sessionId: String = js.native
  var size: Double = js.native
  var status: ArchiveStatus = js.native
  var url: String = js.native
}

object Archive {
  @scala.inline
  def apply(
    createdAt: Double,
    duration: String,
    hasAudio: Boolean,
    hasVideo: Boolean,
    id: String,
    name: String,
    outputMode: OutputMode,
    partnerId: String,
    reason: String,
    sessionId: String,
    size: Double,
    status: ArchiveStatus,
    url: String
  ): Archive = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputMode = outputMode.asInstanceOf[js.Any], partnerId = partnerId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archive]
  }
  @scala.inline
  implicit class ArchiveOps[Self <: Archive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputMode(value: OutputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ArchiveStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

