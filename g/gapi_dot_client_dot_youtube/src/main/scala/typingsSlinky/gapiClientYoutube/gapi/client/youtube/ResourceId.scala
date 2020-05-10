package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the
    * resourceId.kind value is youtube#channel.
    */
  var channelId: js.UndefOr[String] = js.native
  /** The type of the API resource. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the
    * resourceId.kind value is youtube#playlist.
    */
  var playlistId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind
    * value is youtube#video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object ResourceId {
  @scala.inline
  def apply(): ResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceId]
  }
  @scala.inline
  implicit class ResourceIdOps[Self <: ResourceId] (val x: Self) extends AnyVal {
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
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

