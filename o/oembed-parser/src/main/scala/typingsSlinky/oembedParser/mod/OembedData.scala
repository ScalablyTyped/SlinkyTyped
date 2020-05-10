package typingsSlinky.oembedParser.mod

import typingsSlinky.oembedParser.oembedParserStrings.link
import typingsSlinky.oembedParser.oembedParserStrings.photo
import typingsSlinky.oembedParser.oembedParserStrings.rich
import typingsSlinky.oembedParser.oembedParserStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OembedData extends js.Object {
  /** The name of the author/owner of the resource. */
  var author_name: js.UndefOr[String] = js.native
  /** A URL for the author/owner of the resource. */
  var author_url: js.UndefOr[String] = js.native
  /** The suggested cache lifetime for this resource, in seconds. Consumers may choose to use this value or not. */
  var cache_age: js.UndefOr[String] = js.native
  /** The name of the resource provider. */
  var provider_name: js.UndefOr[String] = js.native
  /** The url of the resource provider. */
  var provider_url: js.UndefOr[String] = js.native
  /**
    * The height of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_width must also be present.
    */
  var thumbnail_height: js.UndefOr[Double] = js.native
  /**
    * A URL to a thumbnail image representing the resource.
    * The thumbnail must respect any maxwidth and maxheight parameters.
    * If this parameter is present, thumbnail_width and thumbnail_height must also be present.
    */
  var thumbnail_url: js.UndefOr[String] = js.native
  /**
    * The width of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_height must also be present.
    */
  var thumbnail_width: js.UndefOr[Double] = js.native
  /** A text title, describing the resource. */
  var title: js.UndefOr[String] = js.native
  var `type`: rich | video | photo | link = js.native
  var version: String = js.native
}

object OembedData {
  @scala.inline
  def apply(`type`: rich | video | photo | link, version: String): OembedData = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OembedData]
  }
  @scala.inline
  implicit class OembedDataOps[Self <: OembedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: rich | video | photo | link): Self = {
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
    def withAuthor_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_name")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_url")(js.undefined)
        ret
    }
    @scala.inline
    def withCache_age(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache_age: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache_age")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_name")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_url")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_height")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_url")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_width")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

