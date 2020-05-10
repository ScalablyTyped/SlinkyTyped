package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubePlaylistItemResource extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the video.
    */
  var contentDetails: AnonEndAt = js.native
  /**
    * The ETag for the playlist item resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For playlist item resources, the value will be youtube#playlistItem.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the playlist item, such as its title and position in the playlist.
    */
  var snippet: AnonPosition = js.native
  /**
    * The status object contains information about the playlist items privacy status.
    */
  var status: AnonPrivacyStatus = js.native
}

object GoogleApiYouTubePlaylistItemResource {
  @scala.inline
  def apply(
    contentDetails: AnonEndAt,
    etag: String,
    id: String,
    kind: String,
    snippet: AnonPosition,
    status: AnonPrivacyStatus
  ): GoogleApiYouTubePlaylistItemResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePlaylistItemResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubePlaylistItemResourceOps[Self <: GoogleApiYouTubePlaylistItemResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: AnonEndAt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: AnonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AnonPrivacyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

