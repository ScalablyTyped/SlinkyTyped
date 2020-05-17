package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expand extends js.Object {
  var collapse: String = js.native
  var expand: String = js.native
  var filterConfirm: String = js.native
  var filterReset: String = js.native
  var filterTitle: String = js.native
  var selectAll: String = js.native
  var selectInvert: String = js.native
  var sortTitle: String = js.native
}

object Expand {
  @scala.inline
  def apply(
    collapse: String,
    expand: String,
    filterConfirm: String,
    filterReset: String,
    filterTitle: String,
    selectAll: String,
    selectInvert: String,
    sortTitle: String
  ): Expand = {
    val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], filterConfirm = filterConfirm.asInstanceOf[js.Any], filterReset = filterReset.asInstanceOf[js.Any], filterTitle = filterTitle.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], sortTitle = sortTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  @scala.inline
  implicit class ExpandOps[Self <: Expand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterConfirm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectInvert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectInvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

