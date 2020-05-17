package typingsSlinky.gapiYoutube

import typingsSlinky.gapiYoutube.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeVideoCategoryResource extends js.Object {
  /**
    * The ETag of the videoCategory resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video category.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For video category resources, the value will be youtube#videoCategory.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the video category, including its title.
    */
  var snippet: Title = js.native
}

object GoogleApiYouTubeVideoCategoryResource {
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: Title): GoogleApiYouTubeVideoCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoCategoryResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeVideoCategoryResourceOps[Self <: GoogleApiYouTubeVideoCategoryResource] (val x: Self) extends AnyVal {
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
    def withSnippet(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

