package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannelIdKind extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel, if the recommended resource is a channel. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: String = js.native
  /**
    * The type of the API resource.
    */
  var kind: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video, if the recommended resource is a video. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: String = js.native
}

object AnonChannelIdKind {
  @scala.inline
  def apply(channelId: String, kind: String, videoId: String): AnonChannelIdKind = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelIdKind]
  }
  @scala.inline
  implicit class AnonChannelIdKindOps[Self <: AnonChannelIdKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

