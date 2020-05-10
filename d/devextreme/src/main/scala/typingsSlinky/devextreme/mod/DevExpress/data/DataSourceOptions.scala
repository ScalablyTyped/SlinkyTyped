package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.AnonChanges
import typingsSlinky.devextreme.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceOptions extends js.Object {
  /** Custom parameters that should be passed to an OData service with the load query. Available only for the ODataStore. */
  var customQueryParams: js.UndefOr[js.Any] = js.native
  /** Specifies the navigation properties to be loaded with the OData entity. Available only for the ODataStore. */
  var expand: js.UndefOr[js.Array[String] | String] = js.native
  /** Specifies data filtering conditions. */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Specifies data grouping options. */
  var group: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Specifies an item mapping function. */
  var map: js.UndefOr[js.Function1[/* dataItem */ js.Any, _]] = js.native
  /** A function that is executed after data is loaded. */
  var onChanged: js.UndefOr[js.Function1[/* e */ AnonChanges, _]] = js.native
  /** A function that is executed when data loading fails. */
  var onLoadError: js.UndefOr[js.Function1[/* error */ AnonMessage, _]] = js.native
  /** A function that is executed when the data loading status changes. */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.native
  /** Specifies the maximum number of data items per page. Applies only if paginate is true. */
  var pageSize: js.UndefOr[Double] = js.native
  /** Specifies whether the DataSource loads data items by pages or all at once. Defaults to false if group is set; otherwise, true. */
  var paginate: js.UndefOr[Boolean] = js.native
  /** Specifies a post processing function. */
  var postProcess: js.UndefOr[js.Function1[/* data */ js.Array[_], js.Array[_]]] = js.native
  /** Specifies the period (in milliseconds) when changes are aggregated before pushing them to the DataSource. */
  var pushAggregationTimeout: js.UndefOr[Double] = js.native
  /** Specifies whether the DataSource requests the total count of data items in the storage. */
  var requireTotalCount: js.UndefOr[Boolean] = js.native
  /** Specifies whether to reapply sorting, filtering, grouping, and other data processing operations after receiving a push. */
  var reshapeOnPush: js.UndefOr[Boolean] = js.native
  /** Specifies the fields to search. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** Specifies the comparison operation used in searching. The following values are accepted: "=", "<>", ">", ">=", "<", "<=", "startswith", "endswith", "contains", "notcontains". */
  var searchOperation: js.UndefOr[String] = js.native
  /** Specifies the value to which the search expression is compared. */
  var searchValue: js.UndefOr[js.Any] = js.native
  /** Specifies the fields to select from data objects. */
  var select: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Specifies data sorting options. */
  var sort: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Configures the store underlying the DataSource. */
  var store: js.UndefOr[Store | StoreOptions[Store] | js.Array[_] | js.Any] = js.native
}

object DataSourceOptions {
  @scala.inline
  def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  @scala.inline
  implicit class DataSourceOptionsOps[Self <: DataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomQueryParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String | js.Array[_] | js.Function): Self = {
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
    def withGroup(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* dataItem */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: /* e */ AnonChanges => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadError(value: /* error */ AnonMessage => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadingChanged(value: /* isLoading */ Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: /* data */ js.Array[_] => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withPushAggregationTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushAggregationTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushAggregationTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushAggregationTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireTotalCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReshapeOnPush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reshapeOnPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReshapeOnPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reshapeOnPush")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String | js.Array[_] | js.Function): Self = {
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
    def withStore(value: Store | StoreOptions[Store] | js.Array[_] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
  }
  
}

