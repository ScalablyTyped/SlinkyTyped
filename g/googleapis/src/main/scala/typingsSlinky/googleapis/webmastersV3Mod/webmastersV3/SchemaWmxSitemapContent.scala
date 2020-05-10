package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the various content types in the sitemap.
  */
@js.native
trait SchemaWmxSitemapContent extends js.Object {
  /**
    * The number of URLs from the sitemap that were indexed (of the content
    * type).
    */
  var indexed: js.UndefOr[String] = js.native
  /**
    * The number of URLs in the sitemap (of the content type).
    */
  var submitted: js.UndefOr[String] = js.native
  /**
    * The specific type of content in this sitemap. For example: web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaWmxSitemapContent {
  @scala.inline
  def apply(): SchemaWmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSitemapContent]
  }
  @scala.inline
  implicit class SchemaWmxSitemapContentOps[Self <: SchemaWmxSitemapContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexed")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitted")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

