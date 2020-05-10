package typingsSlinky.instagramPrivateApi.mediaEntityOembedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEntityOembedResponse extends js.Object {
  var author_id: Double = js.native
  var author_name: String = js.native
  var author_url: String = js.native
  var height: Null = js.native
  var html: String = js.native
  var media_id: String = js.native
  var provider_name: String = js.native
  var provider_url: String = js.native
  var thumbnail_height: Double = js.native
  var thumbnail_url: String = js.native
  var thumbnail_width: Double = js.native
  var title: String = js.native
  var `type`: String = js.native
  var version: String = js.native
  var width: Double = js.native
}

object MediaEntityOembedResponse {
  @scala.inline
  def apply(
    author_id: Double,
    author_name: String,
    author_url: String,
    height: Null,
    html: String,
    media_id: String,
    provider_name: String,
    provider_url: String,
    thumbnail_height: Double,
    thumbnail_url: String,
    thumbnail_width: Double,
    title: String,
    `type`: String,
    version: String,
    width: Double
  ): MediaEntityOembedResponse = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_url = thumbnail_url.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEntityOembedResponse]
  }
  @scala.inline
  implicit class MediaEntityOembedResponseOps[Self <: MediaEntityOembedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

