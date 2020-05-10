package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonCompare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnType[RecordType]
  extends typingsSlinky.rcTable.interfaceMod.ColumnType[RecordType] {
  var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  var filterDropdown: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]])] = js.native
  var filterDropdownVisible: js.UndefOr[Boolean] = js.native
  var filterIcon: js.UndefOr[TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]])] = js.native
  var filterMultiple: js.UndefOr[Boolean] = js.native
  var filtered: js.UndefOr[Boolean] = js.native
  var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  var onFilter: js.UndefOr[
    js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
  ] = js.native
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  var sortOrder: js.UndefOr[SortOrder] = js.native
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | AnonCompare[RecordType]] = js.native
}

object ColumnType {
  @scala.inline
  def apply[RecordType](): ColumnType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType[RecordType]]
  }
  @scala.inline
  implicit class ColumnTypeOps[Self[recordtype] <: ColumnType[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withDefaultFilteredValue(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFilteredValue: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilteredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFilteredValueNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilteredValue")(null)
        ret
    }
    @scala.inline
    def withDefaultSortOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortOrder: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortOrder")(null)
        ret
    }
    @scala.inline
    def withFilterDropdownReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterDropdownFunction1(value: /* props */ FilterDropdownProps => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterDropdown(value: TagMod[Any] | (js.Function1[/* props */ FilterDropdownProps, TagMod[Any]])): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropdown: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDropdownVisible(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdownVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDropdownVisible: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDropdownVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterIconReactElement(value: ReactElement): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterIconFunction1(value: /* filtered */ Boolean => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterIcon(value: TagMod[Any] | (js.Function1[/* filtered */ Boolean, TagMod[Any]])): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterIcon: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMultiple(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMultiple: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltered: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredValue(value: js.Array[Key]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredValue: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredValueNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredValue")(null)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[ColumnFilterItem]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterDropdownVisibleChange: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterDropdownVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirections(value: js.Array[SortOrder]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirections: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrderNull: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(null)
        ret
    }
    @scala.inline
    def withSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSorter(value: Boolean | CompareFn[RecordType] | AnonCompare[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorter: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
  }
  
}

