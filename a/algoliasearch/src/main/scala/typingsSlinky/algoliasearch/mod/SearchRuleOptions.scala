package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes options used when searching for query rules
  */
@js.native
trait SearchRuleOptions extends js.Object {
  /**
    * When specified, restricts matches to rules with a specific anchoring type.
    * When omitted, all anchoring types may match.
    */
  var anchoring: js.UndefOr[String] = js.native
  /**
    * When specified, restricts matches to contextual rules with a specific context (exact match).
    * When omitted, any generic or contextual rule (with any context) may match.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
  /**
    * Requested page (zero-based)
    * default: 0
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * The actual search query to find synonyms
    */
  var query: js.UndefOr[String] = js.native
}

object SearchRuleOptions {
  @scala.inline
  def apply(): SearchRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRuleOptions]
  }
  @scala.inline
  implicit class SearchRuleOptionsOps[Self <: SearchRuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchoring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchoring")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
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
  }
  
}

