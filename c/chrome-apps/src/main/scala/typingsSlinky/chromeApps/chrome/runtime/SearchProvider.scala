package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProvider extends js.Object {
  var alternate_urls: js.UndefOr[js.Array[String]] = js.native
  var encoding: js.UndefOr[String] = js.native
  var favicon_url: js.UndefOr[String] = js.native
  var image_url: js.UndefOr[String] = js.native
  var image_url_post_params: js.UndefOr[String] = js.native
  var instant_url: js.UndefOr[String] = js.native
  var instant_url_post_params: js.UndefOr[String] = js.native
  var is_default: js.UndefOr[Boolean] = js.native
  var keyword: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var prepopulated_id: js.UndefOr[integer] = js.native
  var search_url: String = js.native
  var search_url_post_params: js.UndefOr[String] = js.native
  var suggest_url: js.UndefOr[String] = js.native
  var suggest_url_post_params: js.UndefOr[String] = js.native
}

object SearchProvider {
  @scala.inline
  def apply(search_url: String): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvider]
  }
  @scala.inline
  implicit class SearchProviderOps[Self <: SearchProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternate_urls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFavicon_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavicon_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favicon_url")(js.undefined)
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
    def withImage_url_post_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url_post_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage_url_post_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url_post_params")(js.undefined)
        ret
    }
    @scala.inline
    def withInstant_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instant_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstant_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instant_url")(js.undefined)
        ret
    }
    @scala.inline
    def withInstant_url_post_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instant_url_post_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstant_url_post_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instant_url_post_params")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepopulated_id(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepopulated_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepopulated_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepopulated_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_url_post_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_url_post_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_url_post_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_url_post_params")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggest_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggest_url_post_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url_post_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest_url_post_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url_post_params")(js.undefined)
        ret
    }
  }
  
}

