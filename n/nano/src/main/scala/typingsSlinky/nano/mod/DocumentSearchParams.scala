package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://console.bluemix.net/docs/services/Cloudant/api/search.html#queries
@js.native
trait DocumentSearchParams extends js.Object {
  // A bookmark that was received from a previous search. Used for pagination.
  var bookmark: js.UndefOr[String] = js.native
  // An array of field names for which facet counts are requested.
  var counts: js.UndefOr[js.Array[String]] = js.native
  // Filters the result set using key value pairs supplied to the drilldown parameter.
  var drilldown: js.UndefOr[js.Array[String]] = js.native
  // The name of a string field to group results by.
  var group_field: js.UndefOr[String] = js.native
  // The maximum group count when used in conjunction with group_field.
  var group_limit: js.UndefOr[Double] = js.native
  // Defines the order of the groups in a search when used with group_field.
  var group_sort: js.UndefOr[String | js.Array[String]] = js.native
  // Which fields are to be highlighted.
  var highlight_fields: js.UndefOr[js.Array[String]] = js.native
  // The number of gradments that are returned in highlights. Defaults to 1.
  var highlight_number: js.UndefOr[Double] = js.native
  // String used after a highlighted word. Defaults to </em>.
  var highlight_post_tag: js.UndefOr[String] = js.native
  // String used before a highlighted word. Defaults to <em>.
  var highlight_pre_tag: js.UndefOr[String] = js.native
  // The number of characters in each fragment for highlight. Defaults to 100.
  var highlight_size: js.UndefOr[Double] = js.native
  // Include the full document bodies in the response. Defaults to false
  var include_docs: js.UndefOr[Boolean] = js.native
  // An array of fields to include in the search results.
  var include_fields: js.UndefOr[js.Array[String]] = js.native
  // The maximum number of returned documents. Positive integer up to 200.
  var limit: js.UndefOr[Double] = js.native
  // Alias of 'query'. One of q or query must be present.
  var q: js.UndefOr[String] = js.native
  // The Lucene query to perform. One of q or query must be present.
  var query: js.UndefOr[String] = js.native
  // Defines ranges for faceted numeric search fields.
  var ranges: js.UndefOr[js.Object] = js.native
  // Specifies the sort order of the results.
  var sort: js.UndefOr[String | js.Array[String]] = js.native
  // Do not wait for the index to finish building to return results.
  var stale: js.UndefOr[Boolean] = js.native
}

object DocumentSearchParams {
  @scala.inline
  def apply(): DocumentSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSearchParams]
  }
  @scala.inline
  implicit class DocumentSearchParamsOps[Self <: DocumentSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(js.undefined)
        ret
    }
    @scala.inline
    def withCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldown(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_field")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_sort(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_sort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_sort")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight_fields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_number")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight_post_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_post_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight_post_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_post_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight_pre_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_pre_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight_pre_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_pre_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_size")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_fields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
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
    def withRanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String | js.Array[String]): Self = {
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
    def withStale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(js.undefined)
        ret
    }
  }
  
}

