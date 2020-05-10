package typingsSlinky.nano.mod

import typingsSlinky.nano.nanoBooleans.`false`
import typingsSlinky.nano.nanoStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangoQuery extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[String] = js.native
  // Include execution statistics in the query response. Optional, default: false.
  var execution_stats: js.UndefOr[Boolean] = js.native
  // JSON array specifying which fields of each object should be returned. If it is omitted,
  // the entire object is returned.
  // http://docs.couchdb.org/en/latest/api/database/find.html#filtering-fields
  var fields: js.UndefOr[js.Array[String]] = js.native
  // Maximum number of results returned. Default is 25.
  var limit: js.UndefOr[Double] = js.native
  // Read quorum needed for the result. This defaults to 1.
  var r: js.UndefOr[Double] = js.native
  // JSON object describing criteria used to select documents.
  var selector: MangoSelector = js.native
  // Skip the first 'n' results, where 'n' is the value specified.
  var skip: js.UndefOr[Double] = js.native
  // JSON array following sort syntax.
  var sort: js.UndefOr[js.Array[SortOrder]] = js.native
  // Whether or not the view results should be returned from a “stable” set of shards.
  var stable: js.UndefOr[Boolean] = js.native
  // Combination of update = false and stable = true options.Possible options: "ok", false (default).
  var stale: js.UndefOr[ok | `false`] = js.native
  // Whether to update the index prior to returning the result. Default is true.
  var update: js.UndefOr[Boolean] = js.native
  // Instruct a query to use a specific index.
  // Specified either as "<design_document>" or ["<design_document>", "<index_name>"].
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
}

object MangoQuery {
  @scala.inline
  def apply(selector: MangoSelector): MangoQuery = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoQuery]
  }
  @scala.inline
  implicit class MangoQueryOps[Self <: MangoQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: MangoSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withExecution_stats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution_stats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_stats")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[SortOrder]): Self = {
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
    def withStable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stable")(js.undefined)
        ret
    }
    @scala.inline
    def withStale(value: ok | `false`): Self = {
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
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_index(value: String | (js.Tuple2[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_index")(js.undefined)
        ret
    }
  }
  
}

