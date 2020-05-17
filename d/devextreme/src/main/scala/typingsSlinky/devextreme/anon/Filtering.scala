package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filtering extends js.Object {
  var filtering: js.UndefOr[Boolean] = js.native
  var groupPaging: js.UndefOr[Boolean] = js.native
  var grouping: js.UndefOr[Boolean] = js.native
  var paging: js.UndefOr[Boolean] = js.native
  var sorting: js.UndefOr[Boolean] = js.native
  var summary: js.UndefOr[Boolean] = js.native
}

object Filtering {
  @scala.inline
  def apply(): Filtering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filtering]
  }
  @scala.inline
  implicit class FilteringOps[Self <: Filtering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

