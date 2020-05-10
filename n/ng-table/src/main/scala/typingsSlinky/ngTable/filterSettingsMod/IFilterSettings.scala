package typingsSlinky.ngTable.filterSettingsMod

import typingsSlinky.ngTable.filterComparatorMod.FilterComparator
import typingsSlinky.ngTable.filterFuncMod.IFilterFunc
import typingsSlinky.ngTable.filterFuncMod.IFilterValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterSettings[T] extends js.Object {
  /**
    * Use this to determine how items are matched against the filter values.
    * This setting is identical to the `comparator` parameter supported by the angular
    * `$filter` filter service
    *
    * Defaults to `undefined` which will result in a case insensitive susbstring match when
    * `IDefaultGetData` service is supplying the implementation for the
    * `ISettings.getData` function
    */
  var filterComparator: js.UndefOr[FilterComparator[T]] = js.native
  /**
    * A duration to wait for the user to stop typing before applying the filter.
    * - Defaults to 0 for small managed inmemory arrays ie where a `ISettings.dataset` argument is
    *   supplied to `NgTableParams.settings`.
    * - Defaults to 500 milliseconds otherwise.
    */
  var filterDelay: js.UndefOr[Double] = js.native
  /**
    * The number of elements up to which a managed inmemory array is considered small. Defaults to 10000.
    */
  var filterDelayThreshold: js.UndefOr[Double] = js.native
  /**
    * Overrides `IDefaultGetDataProvider.filterFilterName`.
    * The value supplied should be the name of the angular `$filter` service that will be selected to perform
    * the actual filter logic.
    * Defaults to 'filter'.
    */
  var filterFilterName: js.UndefOr[String] = js.native
  /**
    * Tells `IDefaultGetData` to use this function supplied to perform the filtering instead of selecting an angular $filter.
    */
  var filterFn: js.UndefOr[IFilterFunc[T]] = js.native
  /**
    * The layout to use when multiple html templates are to rendered in a single table header column.
    */
  var filterLayout: js.UndefOr[FilterLayout] = js.native
}

object IFilterSettings {
  @scala.inline
  def apply[T](): IFilterSettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterSettings[T]]
  }
  @scala.inline
  implicit class IFilterSettingsOps[Self[t] <: IFilterSettings[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilterComparatorFunction2(value: (T, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilterComparator(value: FilterComparator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterComparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterComparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDelayThreshold(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelayThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDelayThreshold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDelayThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFilterName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFilterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFilterName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFilterName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFn(
      value: (/* data */ js.Array[T], /* filter */ IFilterValues, /* filterComparator */ FilterComparator[T]) => js.Array[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilterFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterLayout(value: FilterLayout): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterLayout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLayout")(js.undefined)
        ret
    }
  }
  
}

