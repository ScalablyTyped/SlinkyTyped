package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Bulletin
import typingsSlinky.gapiYoutube.anon.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeActivityResource extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity.
    */
  var contentDetails: Bulletin = js.native
  /**
    * The ETag of the activity resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For activity resources, the value will be youtube#activity.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the activity, including the activitys type and group ID.
    */
  var snippet: ChannelId = js.native
}

object GoogleApiYouTubeActivityResource {
  @scala.inline
  def apply(contentDetails: Bulletin, etag: String, id: String, kind: String, snippet: ChannelId): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeActivityResourceOps[Self <: GoogleApiYouTubeActivityResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDetails(value: Bulletin): Self = {
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
    def withSnippet(value: ChannelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

