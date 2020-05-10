package typingsSlinky.griddleReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.griddleReact.mod.components.CellProps
import typingsSlinky.griddleReact.mod.components.FilterProps
import typingsSlinky.griddleReact.mod.components.RowProps
import typingsSlinky.griddleReact.mod.components.SettingsProps
import typingsSlinky.griddleReact.mod.components.SettingsToggleProps
import typingsSlinky.griddleReact.mod.components.SettingsWrapperProps
import typingsSlinky.griddleReact.mod.components.TableBodyProps
import typingsSlinky.griddleReact.mod.components.TableHeadingCellProps
import typingsSlinky.griddleReact.mod.components.TableHeadingProps
import typingsSlinky.griddleReact.mod.components.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleComponents extends js.Object {
  var Cell: js.UndefOr[GriddleComponent[CellProps]] = js.native
  var CellContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.native
  var CellContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.native
  var CellEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[CellProps], GriddleComponent[CellProps]]
  ] = js.native
  var Filter: js.UndefOr[GriddleComponent[FilterProps]] = js.native
  var FilterContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.native
  var FilterContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.native
  var FilterEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[FilterProps], 
      GriddleComponent[FilterProps]
    ]
  ] = js.native
  var Layout: js.UndefOr[GriddleComponent[_]] = js.native
  var LayoutContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var LayoutContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var LayoutEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NextButton: js.UndefOr[GriddleComponent[_]] = js.native
  var NextButtonContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NextButtonContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NextButtonEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NoResults: js.UndefOr[GriddleComponent[_]] = js.native
  var NoResultsContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NoResultsContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var NoResultsEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PageDropdown: js.UndefOr[GriddleComponent[_]] = js.native
  var PageDropdownContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PageDropdownContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PageDropdownEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var Pagination: js.UndefOr[GriddleComponent[_]] = js.native
  var PaginationContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PaginationContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PaginationEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PreviousButton: js.UndefOr[GriddleComponent[_]] = js.native
  var PreviousButtonContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PreviousButtonContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var PreviousButtonEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var Row: js.UndefOr[GriddleComponent[RowProps]] = js.native
  var RowContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.native
  var RowContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.native
  var RowEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[RowProps], GriddleComponent[RowProps]]
  ] = js.native
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.native
  var SettingsComponents: js.UndefOr[PropertyBag[GriddleComponent[_]]] = js.native
  var SettingsContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.native
  var SettingsContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.native
  var SettingsEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsProps], 
      GriddleComponent[SettingsProps]
    ]
  ] = js.native
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.native
  var SettingsToggleContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.native
  var SettingsToggleContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.native
  var SettingsToggleEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsToggleProps], 
      GriddleComponent[SettingsToggleProps]
    ]
  ] = js.native
  var SettingsWrapper: js.UndefOr[GriddleComponent[SettingsWrapperProps]] = js.native
  var SettingsWrapperContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.native
  var SettingsWrapperContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.native
  var SettingsWrapperEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[SettingsWrapperProps], 
      GriddleComponent[SettingsWrapperProps]
    ]
  ] = js.native
  var Style: js.UndefOr[GriddleComponent[_]] = js.native
  var StyleContainer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var StyleContainerEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var StyleEnhancer: js.UndefOr[js.Function1[/* OriginalComponent */ GriddleComponent[_], GriddleComponent[_]]] = js.native
  var Table: js.UndefOr[GriddleComponent[TableProps]] = js.native
  var TableBody: js.UndefOr[GriddleComponent[TableBodyProps]] = js.native
  var TableBodyContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.native
  var TableBodyContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.native
  var TableBodyEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableBodyProps], 
      GriddleComponent[TableBodyProps]
    ]
  ] = js.native
  var TableContainer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.native
  var TableContainerEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.native
  var TableEnhancer: js.UndefOr[
    js.Function1[/* OriginalComponent */ GriddleComponent[TableProps], GriddleComponent[TableProps]]
  ] = js.native
  var TableHeading: js.UndefOr[GriddleComponent[TableHeadingProps]] = js.native
  var TableHeadingCell: js.UndefOr[GriddleComponent[TableHeadingCellProps]] = js.native
  var TableHeadingCellContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.native
  var TableHeadingCellContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.native
  var TableHeadingCellEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingCellProps], 
      GriddleComponent[TableHeadingCellProps]
    ]
  ] = js.native
  var TableHeadingContainer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.native
  var TableHeadingContainerEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.native
  var TableHeadingEnhancer: js.UndefOr[
    js.Function1[
      /* OriginalComponent */ GriddleComponent[TableHeadingProps], 
      GriddleComponent[TableHeadingProps]
    ]
  ] = js.native
}

object GriddleComponents {
  @scala.inline
  def apply(): GriddleComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleComponents]
  }
  @scala.inline
  implicit class GriddleComponentsOps[Self <: GriddleComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellFunctionComponent(value: ReactComponentClass[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponentClass(value: ReactComponentClass[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCell(value: GriddleComponent[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCellContainer(value: /* OriginalComponent */ GriddleComponent[CellProps] => GriddleComponent[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[CellProps] => GriddleComponent[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEnhancer(value: /* OriginalComponent */ GriddleComponent[CellProps] => GriddleComponent[CellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunctionComponent(value: ReactComponentClass[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterComponentClass(value: ReactComponentClass[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: GriddleComponent[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterContainer(value: /* OriginalComponent */ GriddleComponent[FilterProps] => GriddleComponent[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[FilterProps] => GriddleComponent[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterEnhancer(value: /* OriginalComponent */ GriddleComponent[FilterProps] => GriddleComponent[FilterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilterEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextButtonComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextButton(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextButtonContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextButtonContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextButtonEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextButtonEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResultsComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResults(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoResultsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoResultsContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNoResultsEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoResultsEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDropdownFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageDropdownComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageDropdown(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDropdownContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageDropdownContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDropdownContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageDropdownContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDropdownEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageDropdownEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDropdownEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaginationContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaginationContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaginationEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButtonFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousButtonComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousButton(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButtonContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousButtonContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButtonContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousButtonContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousButtonEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousButtonEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousButtonEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFunctionComponent(value: ReactComponentClass[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowComponentClass(value: ReactComponentClass[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: GriddleComponent[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowContainer(value: /* OriginalComponent */ GriddleComponent[RowProps] => GriddleComponent[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[RowProps] => GriddleComponent[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowEnhancer(value: /* OriginalComponent */ GriddleComponent[RowProps] => GriddleComponent[RowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsFunctionComponent(value: ReactComponentClass[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsComponentClass(value: ReactComponentClass[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: GriddleComponent[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsComponents(value: PropertyBag[GriddleComponent[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsContainer(value: /* OriginalComponent */ GriddleComponent[SettingsProps] => GriddleComponent[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[SettingsProps] => GriddleComponent[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsEnhancer(value: /* OriginalComponent */ GriddleComponent[SettingsProps] => GriddleComponent[SettingsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggleFunctionComponent(value: ReactComponentClass[SettingsToggleProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsToggleComponentClass(value: ReactComponentClass[SettingsToggleProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsToggle(value: GriddleComponent[SettingsToggleProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggleContainer(
      value: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => GriddleComponent[SettingsToggleProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsToggleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggleContainerEnhancer(
      value: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => GriddleComponent[SettingsToggleProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsToggleContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggleEnhancer(
      value: /* OriginalComponent */ GriddleComponent[SettingsToggleProps] => GriddleComponent[SettingsToggleProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsToggleEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsToggleEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsWrapperFunctionComponent(value: ReactComponentClass[SettingsWrapperProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsWrapperComponentClass(value: ReactComponentClass[SettingsWrapperProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsWrapper(value: GriddleComponent[SettingsWrapperProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsWrapperContainer(
      value: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => GriddleComponent[SettingsWrapperProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsWrapperContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsWrapperContainerEnhancer(
      value: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => GriddleComponent[SettingsWrapperProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsWrapperContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsWrapperEnhancer(
      value: /* OriginalComponent */ GriddleComponent[SettingsWrapperProps] => GriddleComponent[SettingsWrapperProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSettingsWrapperEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsWrapperEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleContainer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyleContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleEnhancer(value: /* OriginalComponent */ GriddleComponent[_] => GriddleComponent[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyleEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StyleEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableFunctionComponent(value: ReactComponentClass[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableComponentClass(value: ReactComponentClass[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: GriddleComponent[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyFunctionComponent(value: ReactComponentClass[TableBodyProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBodyComponentClass(value: ReactComponentClass[TableBodyProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBody(value: GriddleComponent[TableBodyProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyContainer(
      value: /* OriginalComponent */ GriddleComponent[TableBodyProps] => GriddleComponent[TableBodyProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableBodyContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyContainerEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableBodyProps] => GriddleComponent[TableBodyProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableBodyContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableBodyProps] => GriddleComponent[TableBodyProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableBodyEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBodyEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableContainer(value: /* OriginalComponent */ GriddleComponent[TableProps] => GriddleComponent[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableContainerEnhancer(value: /* OriginalComponent */ GriddleComponent[TableProps] => GriddleComponent[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableEnhancer(value: /* OriginalComponent */ GriddleComponent[TableProps] => GriddleComponent[TableProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingFunctionComponent(value: ReactComponentClass[TableHeadingProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeadingComponentClass(value: ReactComponentClass[TableHeadingProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeading(value: GriddleComponent[TableHeadingProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellFunctionComponent(value: ReactComponentClass[TableHeadingCellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeadingCellComponentClass(value: ReactComponentClass[TableHeadingCellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeadingCell(value: GriddleComponent[TableHeadingCellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeadingCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellContainer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => GriddleComponent[TableHeadingCellProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingCellContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellContainerEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => GriddleComponent[TableHeadingCellProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingCellContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingCellEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingCellProps] => GriddleComponent[TableHeadingCellProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingCellEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCellEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingContainer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => GriddleComponent[TableHeadingProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingContainerEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => GriddleComponent[TableHeadingProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingContainerEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingContainerEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingContainerEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeadingEnhancer(
      value: /* OriginalComponent */ GriddleComponent[TableHeadingProps] => GriddleComponent[TableHeadingProps]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingEnhancer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTableHeadingEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingEnhancer")(js.undefined)
        ret
    }
  }
  
}

