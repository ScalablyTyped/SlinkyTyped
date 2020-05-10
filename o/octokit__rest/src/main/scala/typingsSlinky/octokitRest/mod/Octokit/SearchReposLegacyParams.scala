package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.asc
import typingsSlinky.octokitRest.octokitRestStrings.desc
import typingsSlinky.octokitRest.octokitRestStrings.forks
import typingsSlinky.octokitRest.octokitRestStrings.stars
import typingsSlinky.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReposLegacyParams extends js.Object {
  /**
    * The search term.
    */
  var keyword: String = js.native
  /**
    * Filter results by language.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The sort field. if `sort` param is provided. Can be either `asc` or `desc`.
    */
  var order: js.UndefOr[asc | desc] = js.native
  /**
    * The sort field. One of `stars`, `forks`, or `updated`. Default: results are sorted by best match.
    */
  var sort: js.UndefOr[stars | forks | updated] = js.native
  /**
    * The page number to fetch.
    */
  var start_page: js.UndefOr[String] = js.native
}

object SearchReposLegacyParams {
  @scala.inline
  def apply(keyword: String): SearchReposLegacyParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposLegacyParams]
  }
  @scala.inline
  implicit class SearchReposLegacyParamsOps[Self <: SearchReposLegacyParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
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
    def withOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: stars | forks | updated): Self = {
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
    def withStart_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_page")(js.undefined)
        ret
    }
  }
  
}

