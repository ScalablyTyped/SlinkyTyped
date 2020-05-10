package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes options used when searching for synonyms
  */
@js.native
trait SearchSynonymOptions extends js.Object {
  /**
    * Number of hits per page
    * default: 100
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
  /**
    * The page to fetch when browsing through several pages of results
    * default: 0
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * The actual search query to find synonyms
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Restrict the search to a specific type of synonym
    * Use an empty string to search all types (default behavior)
    */
  var `type`: js.UndefOr[String] = js.native
}

object SearchSynonymOptions {
  @scala.inline
  def apply(): SearchSynonymOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSynonymOptions]
  }
  @scala.inline
  implicit class SearchSynonymOptionsOps[Self <: SearchSynonymOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHitsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
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

