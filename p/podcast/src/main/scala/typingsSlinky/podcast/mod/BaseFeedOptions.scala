package typingsSlinky.podcast.mod

import typingsSlinky.podcast.podcastStrings.episodic
import typingsSlinky.podcast.podcastStrings.serial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFeedOptions extends js.Object {
  var author: String = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var copyright: js.UndefOr[String] = js.native
  var customElements: js.UndefOr[js.Array[js.Object]] = js.native
  var customNamespaces: js.UndefOr[js.Object] = js.native
  var description: js.UndefOr[String] = js.native
  var docs: js.UndefOr[String] = js.native
  var generator: js.UndefOr[String] = js.native
  var itunesAuthor: js.UndefOr[String] = js.native
  var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
  var itunesExplicit: js.UndefOr[Boolean] = js.native
  var itunesImage: js.UndefOr[String] = js.native
  var itunesOwner: js.UndefOr[FeedItunesOwner] = js.native
  var itunesSubtitle: js.UndefOr[String] = js.native
  var itunesSummary: js.UndefOr[String] = js.native
  var itunesType: js.UndefOr[episodic | serial] = js.native
  var language: js.UndefOr[String] = js.native
  var managingEditor: js.UndefOr[String] = js.native
  var pubDate: js.UndefOr[js.Date | String] = js.native
  var title: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var webMaster: js.UndefOr[String] = js.native
}

object BaseFeedOptions {
  @scala.inline
  def apply(author: String): BaseFeedOptions = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFeedOptions]
  }
  @scala.inline
  implicit class BaseFeedOptionsOps[Self <: BaseFeedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
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
    def withCustomElements(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customElements")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomNamespaces(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customNamespaces")(js.undefined)
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
    def withItunesAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesCategory(value: js.Array[FeedItunesCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesExplicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesExplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesExplicit")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesImage")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesOwner(value: FeedItunesOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesType(value: episodic | serial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesType")(js.undefined)
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

