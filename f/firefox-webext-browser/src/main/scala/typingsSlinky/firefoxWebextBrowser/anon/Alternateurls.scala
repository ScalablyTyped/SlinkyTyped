package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alternateurls extends js.Object {
  /** @deprecated Unsupported on Firefox at this time. */
  var alternate_urls: js.UndefOr[js.Array[String]] = js.native
  /** Encoding of the search term. */
  var encoding: js.UndefOr[String] = js.native
  var favicon_url: js.UndefOr[String] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url: js.UndefOr[String] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  var image_url_post_params: js.UndefOr[String] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url: js.UndefOr[String] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  var instant_url_post_params: js.UndefOr[String] = js.native
  /** Sets the default engine to a built-in engine only. */
  var is_default: js.UndefOr[Boolean] = js.native
  var keyword: js.UndefOr[String] = js.native
  var name: String = js.native
  /**
    * A list of optional search url parameters. This allows the additon of search url parameters based on
    * how the search is performed in Firefox.
    */
  var params: js.UndefOr[js.Array[Condition]] = js.native
  /** @deprecated Unsupported on Firefox. */
  var prepopulated_id: js.UndefOr[Double] = js.native
  var search_form: js.UndefOr[String] = js.native
  var search_url: String = js.native
  /** GET parameters to the search_url as a query string. */
  var search_url_get_params: js.UndefOr[String] = js.native
  /** POST parameters to the search_url as a query string. */
  var search_url_post_params: js.UndefOr[String] = js.native
  var suggest_url: js.UndefOr[String] = js.native
  /** GET parameters to the suggest_url as a query string. */
  var suggest_url_get_params: js.UndefOr[String] = js.native
  /** POST parameters to the suggest_url as a query string. */
  var suggest_url_post_params: js.UndefOr[String] = js.native
}

object Alternateurls {
  @scala.inline
  def apply(name: String, search_url: String): Alternateurls = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternateurls]
  }
  @scala.inline
  implicit class AlternateurlsOps[Self <: Alternateurls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withParams(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepopulated_id(value: Double): Self = {
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
    def withSearch_form(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_form: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_form")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_url_get_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_url_get_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_url_get_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_url_get_params")(js.undefined)
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
    def withSuggest_url_get_params(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url_get_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggest_url_get_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest_url_get_params")(js.undefined)
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

