package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  defaultCanSort  :boolean,   disableSortBy  :boolean,   sortDescFirst  :boolean,   sortInverted  :boolean,   sortType  :react-table.react-table.SortByFn<D> | react-table.react-table.DefaultSortTypes | string}> */
@js.native
trait UseSortByColumnOptions[D /* <: js.Object */] extends js.Object {
  var defaultCanSort: js.UndefOr[Boolean] = js.native
  var disableSortBy: js.UndefOr[Boolean] = js.native
  var sortDescFirst: js.UndefOr[Boolean] = js.native
  var sortInverted: js.UndefOr[Boolean] = js.native
  var sortType: js.UndefOr[SortByFn[D] | DefaultSortTypes | String] = js.native
}

object UseSortByColumnOptions {
  @scala.inline
  def apply[D](): UseSortByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByColumnOptions[D]]
  }
  @scala.inline
  implicit class UseSortByColumnOptionsOps[Self[d] <: UseSortByColumnOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDefaultCanSort(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCanSort: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSortBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSortBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDescFirst(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDescFirst: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withSortInverted(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortInverted: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withSortTypeFunction4(
      value: (/* rowA */ Row[D], /* rowB */ Row[D], /* columnId */ IdType[D], /* desc */ js.UndefOr[Boolean]) => Double
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSortType(value: SortByFn[D] | DefaultSortTypes | String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortType: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(js.undefined)
        ret
    }
  }
  
}

