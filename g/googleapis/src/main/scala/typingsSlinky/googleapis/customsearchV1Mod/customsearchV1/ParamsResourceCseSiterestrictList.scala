package typingsSlinky.googleapis.customsearchV1Mod.customsearchV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCseSiterestrictList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Turns off the translation between zh-CN and zh-TW.
    */
  var c2coff: js.UndefOr[String] = js.native
  /**
    * Country restrict(s).
    */
  var cr: js.UndefOr[String] = js.native
  /**
    * The custom search engine ID to scope this search query
    */
  var cx: js.UndefOr[String] = js.native
  /**
    * Specifies all search results are from a time period
    */
  var dateRestrict: js.UndefOr[String] = js.native
  /**
    * Identifies a phrase that all documents in the search results must contain
    */
  var exactTerms: js.UndefOr[String] = js.native
  /**
    * Identifies a word or phrase that should not appear in any documents in
    * the search results
    */
  var excludeTerms: js.UndefOr[String] = js.native
  /**
    * Returns images of a specified type. Some of the allowed values are: bmp,
    * gif, png, jpg, svg, pdf, ...
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * Controls turning on or off the duplicate content filter.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Geolocation of end user.
    */
  var gl: js.UndefOr[String] = js.native
  /**
    * The local Google domain to use to perform the search.
    */
  var googlehost: js.UndefOr[String] = js.native
  /**
    * Creates a range in form as_nlo value..as_nhi value and attempts to append
    * it to query
    */
  var highRange: js.UndefOr[String] = js.native
  /**
    * Sets the user interface language.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * Appends the extra query terms to the query.
    */
  var hq: js.UndefOr[String] = js.native
  /**
    * Returns black and white, grayscale, or color images: mono, gray, and
    * color.
    */
  var imgColorType: js.UndefOr[String] = js.native
  /**
    * Returns images of a specific dominant color: red, orange, yellow, green,
    * teal, blue, purple, pink, white, gray, black and brown.
    */
  var imgDominantColor: js.UndefOr[String] = js.native
  /**
    * Returns images of a specified size, where size can be one of: icon,
    * small, medium, large, xlarge, xxlarge, and huge.
    */
  var imgSize: js.UndefOr[String] = js.native
  /**
    * Returns images of a type, which can be one of: clipart, face, lineart,
    * news, and photo.
    */
  var imgType: js.UndefOr[String] = js.native
  /**
    * Specifies that all search results should contain a link to a particular
    * URL
    */
  var linkSite: js.UndefOr[String] = js.native
  /**
    * Creates a range in form as_nlo value..as_nhi value and attempts to append
    * it to query
    */
  var lowRange: js.UndefOr[String] = js.native
  /**
    * The language restriction for the search results
    */
  var lr: js.UndefOr[String] = js.native
  /**
    * Number of search results to return
    */
  var num: js.UndefOr[Double] = js.native
  /**
    * Provides additional search terms to check for in a document, where each
    * document in the search results must contain at least one of the
    * additional search terms
    */
  var orTerms: js.UndefOr[String] = js.native
  /**
    * Query
    */
  var q: js.UndefOr[String] = js.native
  /**
    * Specifies that all search results should be pages that are related to the
    * specified URL
    */
  var relatedSite: js.UndefOr[String] = js.native
  /**
    * Filters based on licensing. Supported values include: cc_publicdomain,
    * cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and
    * combinations of these.
    */
  var rights: js.UndefOr[String] = js.native
  /**
    * Search safety level
    */
  var safe: js.UndefOr[String] = js.native
  /**
    * Specifies the search type: image.
    */
  var searchType: js.UndefOr[String] = js.native
  /**
    * Specifies all search results should be pages from a given site
    */
  var siteSearch: js.UndefOr[String] = js.native
  /**
    * Controls whether to include or exclude results from the site named in the
    * as_sitesearch parameter
    */
  var siteSearchFilter: js.UndefOr[String] = js.native
  /**
    * The sort expression to apply to the results
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * The index of the first result to return
    */
  var start: js.UndefOr[Double] = js.native
}

object ParamsResourceCseSiterestrictList {
  @scala.inline
  def apply(): ParamsResourceCseSiterestrictList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCseSiterestrictList]
  }
  @scala.inline
  implicit class ParamsResourceCseSiterestrictListOps[Self <: ParamsResourceCseSiterestrictList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withC2coff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c2coff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC2coff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c2coff")(js.undefined)
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
    def withGooglehost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlehost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglehost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlehost")(js.undefined)
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
    def withLr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lr")(js.undefined)
        ret
    }
    @scala.inline
    def withNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num")(js.undefined)
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
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
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
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

