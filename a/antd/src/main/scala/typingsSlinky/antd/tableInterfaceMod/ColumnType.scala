package typingsSlinky.antd.tableInterfaceMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Compare
import typingsSlinky.antd.responsiveObserveMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnType[RecordType]
  extends typingsSlinky.rcTable.interfaceMod.ColumnType[RecordType] {
  var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var filterDropdown: js.UndefOr[ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filtered: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var onFilter: js.UndefOr[
    js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
  ] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var showSorterTooltip: js.UndefOr[Boolean] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.undefined
}

object ColumnType {
  @scala.inline
  def apply[RecordType](): ColumnType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType[RecordType]]
  }
  @scala.inline
  implicit class ColumnTypeOps[Self <: ColumnType[_], RecordType] (val x: Self with ColumnType[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultFilteredValue(value: js.Array[Key]): Self = this.set("defaultFilteredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFilteredValue: Self = this.set("defaultFilteredValue", js.undefined)
    @scala.inline
    def setDefaultFilteredValueNull: Self = this.set("defaultFilteredValue", null)
    @scala.inline
    def setDefaultSortOrder(value: SortOrder): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    @scala.inline
    def setDefaultSortOrderNull: Self = this.set("defaultSortOrder", null)
    @scala.inline
    def setFilterDropdownReactElement(value: ReactElement): Self = this.set("filterDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactElement): Self = this.set("filterDropdown", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterDropdown(value: ReactElement | (js.Function1[/* props */ FilterDropdownProps, ReactElement])): Self = this.set("filterDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropdown: Self = this.set("filterDropdown", js.undefined)
    @scala.inline
    def setFilterDropdownVisible(value: Boolean): Self = this.set("filterDropdownVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropdownVisible: Self = this.set("filterDropdownVisible", js.undefined)
    @scala.inline
    def setFilterIconReactElement(value: ReactElement): Self = this.set("filterIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterIconFunction1(value: /* filtered */ Boolean => ReactElement): Self = this.set("filterIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterIcon(value: ReactElement | (js.Function1[/* filtered */ Boolean, ReactElement])): Self = this.set("filterIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterIcon: Self = this.set("filterIcon", js.undefined)
    @scala.inline
    def setFilterMultiple(value: Boolean): Self = this.set("filterMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMultiple: Self = this.set("filterMultiple", js.undefined)
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setFilteredValue(value: js.Array[Key]): Self = this.set("filteredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredValue: Self = this.set("filteredValue", js.undefined)
    @scala.inline
    def setFilteredValueNull: Self = this.set("filteredValue", null)
    @scala.inline
    def setFilters(value: js.Array[ColumnFilterItem]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = this.set("onFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterDropdownVisibleChange: Self = this.set("onFilterDropdownVisibleChange", js.undefined)
    @scala.inline
    def setResponsive(value: js.Array[Breakpoint]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setShowSorterTooltip(value: Boolean): Self = this.set("showSorterTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSorterTooltip: Self = this.set("showSorterTooltip", js.undefined)
    @scala.inline
    def setSortDirections(value: js.Array[SortOrder]): Self = this.set("sortDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirections: Self = this.set("sortDirections", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
    @scala.inline
    def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = this.set("sorter", js.Any.fromFunction3(value))
    @scala.inline
    def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = this.set("sorter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
  }
  
}

