package typingsSlinky.ngTable.ngTableParamsMod

import typingsSlinky.ngTable.filterFuncMod.IFilterValues
import typingsSlinky.ngTable.groupingFuncMod.Grouping
import typingsSlinky.ngTable.sortingMod.ISortingValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParamValues[T] extends js.Object {
  /**
    * The number of data rows per page
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The filter that should be applied to restrict the set of data rows
    */
  var filter: js.UndefOr[IFilterValues] = js.native
  /**
    * The grouping that should be applied to the data rows
    */
  var group: js.UndefOr[String | Grouping[T]] = js.native
  /**
    * The index of the "slice" of data rows, starting at 1, to be displayed by the table.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * The sort order that should be applied to the data rows.
    */
  var sorting: js.UndefOr[ISortingValues] = js.native
}

object IParamValues {
  @scala.inline
  def apply[T](): IParamValues[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParamValues[T]]
  }
  @scala.inline
  implicit class IParamValuesOps[Self[t] <: IParamValues[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: IFilterValues): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String | Grouping[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: ISortingValues): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
  }
  
}

