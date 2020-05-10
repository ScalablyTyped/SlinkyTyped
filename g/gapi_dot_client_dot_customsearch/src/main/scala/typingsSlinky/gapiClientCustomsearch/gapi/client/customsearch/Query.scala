package typingsSlinky.gapiClientCustomsearch.gapi.client.customsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var cr: js.UndefOr[String] = js.native
  var cx: js.UndefOr[String] = js.native
  var dateRestrict: js.UndefOr[String] = js.native
  var disableCnTwTranslation: js.UndefOr[String] = js.native
  var exactTerms: js.UndefOr[String] = js.native
  var excludeTerms: js.UndefOr[String] = js.native
  var fileType: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var gl: js.UndefOr[String] = js.native
  var googleHost: js.UndefOr[String] = js.native
  var highRange: js.UndefOr[String] = js.native
  var hl: js.UndefOr[String] = js.native
  var hq: js.UndefOr[String] = js.native
  var imgColorType: js.UndefOr[String] = js.native
  var imgDominantColor: js.UndefOr[String] = js.native
  var imgSize: js.UndefOr[String] = js.native
  var imgType: js.UndefOr[String] = js.native
  var inputEncoding: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var linkSite: js.UndefOr[String] = js.native
  var lowRange: js.UndefOr[String] = js.native
  var orTerms: js.UndefOr[String] = js.native
  var outputEncoding: js.UndefOr[String] = js.native
  var relatedSite: js.UndefOr[String] = js.native
  var rights: js.UndefOr[String] = js.native
  var safe: js.UndefOr[String] = js.native
  var searchTerms: js.UndefOr[String] = js.native
  var searchType: js.UndefOr[String] = js.native
  var siteSearch: js.UndefOr[String] = js.native
  var siteSearchFilter: js.UndefOr[String] = js.native
  var sort: js.UndefOr[String] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var startPage: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var totalResults: js.UndefOr[String] = js.native
}

object Query {
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cr")(js.undefined)
        ret
    }
    @scala.inline
    def withCx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRestrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRestrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRestrict")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCnTwTranslation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCnTwTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCnTwTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCnTwTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withExactTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleHost")(js.undefined)
        ret
    }
    @scala.inline
    def withHighRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highRange")(js.undefined)
        ret
    }
    @scala.inline
    def withHl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(js.undefined)
        ret
    }
    @scala.inline
    def withHq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hq")(js.undefined)
        ret
    }
    @scala.inline
    def withImgColorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgColorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgColorType")(js.undefined)
        ret
    }
    @scala.inline
    def withImgDominantColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgDominantColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgDominantColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgDominantColor")(js.undefined)
        ret
    }
    @scala.inline
    def withImgSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSize")(js.undefined)
        ret
    }
    @scala.inline
    def withImgType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEncoding")(js.undefined)
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
    def withLinkSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSite")(js.undefined)
        ret
    }
    @scala.inline
    def withLowRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedSite")(js.undefined)
        ret
    }
    @scala.inline
    def withRights(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteSearchFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteSearchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteSearchFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(js.undefined)
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
    def withTotalResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
  }
  
}

