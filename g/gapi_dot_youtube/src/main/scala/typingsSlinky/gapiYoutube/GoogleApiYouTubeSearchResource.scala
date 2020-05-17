package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.KindPlaylistId
import typingsSlinky.gapiYoutube.anon.Thumbnails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeSearchResource extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: String = js.native
  /**
    * The id object contains information that can be used to uniquely identify the resource that matches the search request.
    */
  var id: KindPlaylistId = js.native
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: Thumbnails = js.native
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(etag: String, id: KindPlaylistId, kind: String, snippet: Thumbnails): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeSearchResourceOps[Self <: GoogleApiYouTubeSearchResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KindPlaylistId): Self = {
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
    def withSnippet(value: Thumbnails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

