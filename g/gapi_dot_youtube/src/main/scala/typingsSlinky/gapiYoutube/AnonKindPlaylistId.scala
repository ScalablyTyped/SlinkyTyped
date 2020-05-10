package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKindPlaylistId extends js.Object {
  /**
    * If the id.type propertys value is youtube#channel, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a channel that matches the search query.
    */
  var channelId: String = js.native
  /**
    * The type of the API resource.
    */
  var kind: String = js.native
  /**
    * If the id.type propertys value is youtube#playlist, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a playlist that matches the search query.
    */
  var playlistId: String = js.native
  /**
    * If the id.type propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a video that matches the search query.
    */
  var videoId: String = js.native
}

object AnonKindPlaylistId {
  @scala.inline
  def apply(channelId: String, kind: String, playlistId: String, videoId: String): AnonKindPlaylistId = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], playlistId = playlistId.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKindPlaylistId]
  }
  @scala.inline
  implicit class AnonKindPlaylistIdOps[Self <: AnonKindPlaylistId] (val x: Self) extends AnyVal {
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
    def withPlaylistId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(value.asInstanceOf[js.Any])
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

