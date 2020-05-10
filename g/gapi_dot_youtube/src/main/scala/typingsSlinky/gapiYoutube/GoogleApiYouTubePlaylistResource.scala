package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubePlaylistResource extends js.Object {
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: AnonItemCount = js.native
  /**
    * The ETag for the playlist resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For video resources, the value will be youtube#playlist.
    */
  var kind: String = js.native
  /**
    * The player object contains information that you would use to play the playlist in an embedded player.
    */
  var player: AnonEmbedHtml = js.native
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: AnonPublishedAt = js.native
  /**
    * The status object contains status information for the playlist.
    */
  var status: AnonPrivacyStatus = js.native
}

object GoogleApiYouTubePlaylistResource {
  @scala.inline
  def apply(
    contentDetails: AnonItemCount,
    etag: String,
    id: String,
    kind: String,
    player: AnonEmbedHtml,
    snippet: AnonPublishedAt,
    status: AnonPrivacyStatus
  ): GoogleApiYouTubePlaylistResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePlaylistResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubePlaylistResourceOps[Self <: GoogleApiYouTubePlaylistResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: AnonItemCount): Self = {
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
    def withPlayer(value: AnonEmbedHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippet(value: AnonPublishedAt): Self = {
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

