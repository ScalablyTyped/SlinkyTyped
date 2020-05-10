package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains detailed information about a specific URL submitted as a sitemap.
  */
@js.native
trait SchemaWmxSitemap extends js.Object {
  /**
    * The various content types in the sitemap.
    */
  var contents: js.UndefOr[js.Array[SchemaWmxSitemapContent]] = js.native
  /**
    * Number of errors in the sitemap. These are issues with the sitemap itself
    * that need to be fixed before it can be processed correctly.
    */
  var errors: js.UndefOr[String] = js.native
  /**
    * If true, the sitemap has not been processed.
    */
  var isPending: js.UndefOr[Boolean] = js.native
  /**
    * If true, the sitemap is a collection of sitemaps.
    */
  var isSitemapsIndex: js.UndefOr[Boolean] = js.native
  /**
    * Date &amp; time in which this sitemap was last downloaded. Date format is
    * in RFC 3339 format (yyyy-mm-dd).
    */
  var lastDownloaded: js.UndefOr[String] = js.native
  /**
    * Date &amp; time in which this sitemap was submitted. Date format is in
    * RFC 3339 format (yyyy-mm-dd).
    */
  var lastSubmitted: js.UndefOr[String] = js.native
  /**
    * The url of the sitemap.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The type of the sitemap. For example: rssFeed.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Number of warnings for the sitemap. These are generally non-critical
    * issues with URLs in the sitemaps.
    */
  var warnings: js.UndefOr[String] = js.native
}

object SchemaWmxSitemap {
  @scala.inline
  def apply(): SchemaWmxSitemap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSitemap]
  }
  @scala.inline
  implicit class SchemaWmxSitemapOps[Self <: SchemaWmxSitemap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: js.Array[SchemaWmxSitemapContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPending")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSitemapsIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSitemapsIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSitemapsIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSitemapsIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDownloaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDownloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDownloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDownloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSubmitted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSubmitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSubmitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSubmitted")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    @scala.inline
    def withWarnings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

