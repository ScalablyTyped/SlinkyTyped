package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteObjSpec extends js.Object {
  /**
  	 * If set, cell edits will be handled remotely
  	 */
  var cellEdit: js.UndefOr[Boolean] = js.native
  /**
  	 * If set deletion will be handled remotely
  	 */
  var dropRow: js.UndefOr[Boolean] = js.native
  /**
  	 * If set, exporting CSV will be handled remotely
  	 */
  var exportCSV: js.UndefOr[Boolean] = js.native
  /**
  	 * If set filters will be handled remotely
  	 */
  var filter: js.UndefOr[Boolean] = js.native
  /**
  	 * If set insertions will be handled remotely
  	 */
  var insertRow: js.UndefOr[Boolean] = js.native
  /**
  	 * If set pagination will be handled remotely
  	 */
  var pagination: js.UndefOr[Boolean] = js.native
  /**
  	 * If set search will be handled remotely
  	 */
  var search: js.UndefOr[Boolean] = js.native
  /**
  	 * If set sorting will be handled remotely
  	 */
  var sort: js.UndefOr[Boolean] = js.native
}

object RemoteObjSpec {
  @scala.inline
  def apply(): RemoteObjSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteObjSpec]
  }
  @scala.inline
  implicit class RemoteObjSpecOps[Self <: RemoteObjSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withDropRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExportCSV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportCSV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
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
    def withInsertRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
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
  }
  
}

