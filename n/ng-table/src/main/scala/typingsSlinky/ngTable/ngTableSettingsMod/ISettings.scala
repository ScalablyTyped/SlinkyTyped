package typingsSlinky.ngTable.ngTableSettingsMod

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.ngTable.dataSettingsMod.IDataSettings
import typingsSlinky.ngTable.filterSettingsMod.IFilterSettings
import typingsSlinky.ngTable.getDataMod.IGetDataFunc
import typingsSlinky.ngTable.getDataMod.IInterceptableGetDataFunc
import typingsSlinky.ngTable.getGroupMod.IGetGroupFunc
import typingsSlinky.ngTable.groupSettingsMod.IGroupSettings
import typingsSlinky.ngTable.interceptorMod.IInterceptor
import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import typingsSlinky.ngTable.resultsMod.IDataRowGroup
import typingsSlinky.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettings[T] extends js.Object {
  /**
    * Returns true whenever a call to `getData` is in progress
    */
  @JSName("$loading")
  var $loading: js.UndefOr[Boolean] = js.native
  /**
    * The page size buttons that should be displayed. Each value defined in the array
    * determines the possible values that can be supplied to {@link NgTableParams} `page`
    */
  var counts: js.UndefOr[js.Array[Double]] = js.native
  var dataOptions: js.UndefOr[IDataSettings] = js.native
  /**
    * An array that contains all the data rows that table should manage.
    * The `gateData` function will be used to manage the data rows
    * that ultimately will be displayed.
    */
  var dataset: js.UndefOr[js.Array[T]] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  /**
    * The default sort direction that will be used whenever a sorting is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.native
  var filterOptions: js.UndefOr[IFilterSettings[T]] = js.native
  /**
    * The function that will be used fetch data rows. Leave undefined to let the {@link IDefaultGetData}
    * service provide a default implementation that will work with the `dataset` array you supply.
    *
    * Typically you will supply a custom function when you need to execute filtering, paging and sorting
    * on the server
    */
  var getData: js.UndefOr[IGetDataFunc[T] | IInterceptableGetDataFunc[T]] = js.native
  /**
    * The function that will be used group data rows according to the groupings returned by {@link NgTableParams} `group`
    */
  var getGroups: js.UndefOr[IGetGroupFunc[T]] = js.native
  var groupOptions: js.UndefOr[IGroupSettings] = js.native
  /**
    * The collection of interceptors that should apply to the results of a call to
    * the `getData` function before the data rows are displayed in the table
    */
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.native
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMaxBlocks: js.UndefOr[Double] = js.native
  /**
    * Configuration for the template that will display the page size buttons
    */
  var paginationMinBlocks: js.UndefOr[Double] = js.native
  /**
    * The html tag that will be used to display the sorting indicator in the table header
    */
  var sortingIndicator: js.UndefOr[String] = js.native
  /**
    * The total number of data rows before paging has been applied.
    * Typically you will not need to supply this yourself
    */
  var total: js.UndefOr[Double] = js.native
}

object ISettings {
  @scala.inline
  def apply[T](): ISettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISettings[T]]
  }
  @scala.inline
  implicit class ISettingsOps[Self[t] <: ISettings[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$loading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$loading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$loading")(js.undefined)
        ret
    }
    @scala.inline
    def withCounts(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOptions(value: IDataSettings): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSort(value: SortDirection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: IFilterSettings[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: /* params */ NgTableParams[T] => js.Any | js.Array[T] | IPromise[js.Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroups(
      value: /* params */ NgTableParams[T] => js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroups: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOptions(value: IGroupSettings): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptors(value: js.Array[IInterceptor[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationMaxBlocks(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationMaxBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationMaxBlocks: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationMaxBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationMinBlocks(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationMinBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationMinBlocks: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationMinBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingIndicator(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingIndicator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

