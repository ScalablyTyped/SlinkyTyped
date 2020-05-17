package typingsSlinky.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pagination  :boolean,   filter  :boolean,   sort  :boolean,   cellEdit  :boolean,   search  :boolean}> */
@js.native
trait Partialpaginationbooleanf extends js.Object {
  var cellEdit: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var search: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean] = js.native
}

object Partialpaginationbooleanf {
  @scala.inline
  def apply(): Partialpaginationbooleanf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpaginationbooleanf]
  }
  @scala.inline
  implicit class PartialpaginationbooleanfOps[Self <: Partialpaginationbooleanf] (val x: Self) extends AnyVal {
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

