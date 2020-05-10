package typingsSlinky.rss.mod.NodeRSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedOptions extends js.Object {
  /**
    * One or more categories this feed belongs to.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Copyright information for this feed.
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Put additional elements in the feed (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.native
  /**
    * Put additional namespaces in element
    * (without 'xmlns:' prefix).
    */
  var custom_namespaces: js.UndefOr[js.Object] = js.native
  /**
    * A short description of the feed.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * URL to documentation on this feed.
    */
  var docs: js.UndefOr[String] = js.native
  /**
    * URL to the rss feed.
    */
  var feed_url: String = js.native
  /**
    * Feed generator.
    */
  var generator: js.UndefOr[String] = js.native
  /**
    * Where is the PubSubHub hub located.
    */
  var hub: js.UndefOr[String] = js.native
  /**
    * Small image for feed readers to use.
    */
  var image_url: js.UndefOr[String] = js.native
  /**
    * The language of the content of this feed.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Who manages content in this feed.
    */
  var managingEditor: js.UndefOr[String] = js.native
  /**
    * The publication date for content in the feed.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var pubDate: js.UndefOr[js.Date | String] = js.native
  /**
    * URL to the site that the feed is for.
    */
  var site_url: String = js.native
  /**
    * Title of your site or feed.
    */
  var title: String = js.native
  /**
    * Number of minutes feed can be cached before refreshing
    * from source.
    */
  var ttl: js.UndefOr[Double] = js.native
  /**
    * Who manages feed availability and technical support.
    */
  var webMaster: js.UndefOr[String] = js.native
}

object FeedOptions {
  @scala.inline
  def apply(feed_url: String, site_url: String, title: String): FeedOptions = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any], site_url = site_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedOptions]
  }
  @scala.inline
  implicit class FeedOptionsOps[Self <: FeedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeed_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSite_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_elements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_elements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_elements")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_namespaces(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_namespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDocs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
    @scala.inline
    def withHub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hub")(js.undefined)
        ret
    }
    @scala.inline
    def withImage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withManagingEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagingEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withPubDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubDate(value: js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebMaster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webMaster")(js.undefined)
        ret
    }
  }
  
}

