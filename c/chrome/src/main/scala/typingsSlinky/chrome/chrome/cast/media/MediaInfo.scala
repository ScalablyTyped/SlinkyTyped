package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaInfo extends js.Object {
  var contentId: String = js.native
  var contentType: String = js.native
  var customData: js.Object = js.native
  var duration: Double = js.native
  var metadata: js.Object = js.native
  var streamType: StreamType = js.native
  var textTrackStyle: TextTrackStyle = js.native
  var tracks: js.Array[Track] = js.native
}

object MediaInfo {
  @scala.inline
  def apply(
    contentId: String,
    contentType: String,
    customData: js.Object,
    duration: Double,
    metadata: js.Object,
    streamType: StreamType,
    textTrackStyle: TextTrackStyle,
    tracks: js.Array[Track]
  ): MediaInfo = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfo]
  }
  @scala.inline
  implicit class MediaInfoOps[Self <: MediaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamType(value: StreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTrackStyle(value: TextTrackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTrackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[Track]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

