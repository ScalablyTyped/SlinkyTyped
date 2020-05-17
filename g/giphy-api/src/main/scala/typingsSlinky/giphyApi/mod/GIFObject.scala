package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GIFObject extends js.Object {
  var bitly_url: String = js.native
  var content_url: String = js.native
  var create_datetime: String = js.native
  var embed_url: String = js.native
  var id: String = js.native
  var images: Images = js.native
  var import_datetime: String = js.native
  var rating: Rating = js.native
  var slug: String = js.native
  var source: String = js.native
  var source_post_url: String = js.native
  var source_tld: String = js.native
  var title: String = js.native
  var trending_datetime: String = js.native
  var `type`: String = js.native
  var update_datetime: String = js.native
  var url: String = js.native
  var user: js.UndefOr[Avatarurl] = js.native
  var username: String = js.native
}

object GIFObject {
  @scala.inline
  def apply(
    bitly_url: String,
    content_url: String,
    create_datetime: String,
    embed_url: String,
    id: String,
    images: Images,
    import_datetime: String,
    rating: Rating,
    slug: String,
    source: String,
    source_post_url: String,
    source_tld: String,
    title: String,
    trending_datetime: String,
    `type`: String,
    update_datetime: String,
    url: String,
    username: String
  ): GIFObject = {
    val __obj = js.Dynamic.literal(bitly_url = bitly_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], create_datetime = create_datetime.asInstanceOf[js.Any], embed_url = embed_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], import_datetime = import_datetime.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_post_url = source_post_url.asInstanceOf[js.Any], source_tld = source_tld.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trending_datetime = trending_datetime.asInstanceOf[js.Any], update_datetime = update_datetime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIFObject]
  }
  @scala.inline
  implicit class GIFObjectOps[Self <: GIFObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitly_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitly_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate_datetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: Images): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport_datetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import_datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: Rating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_post_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_post_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_tld(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_tld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrending_datetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trending_datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate_datetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Avatarurl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

