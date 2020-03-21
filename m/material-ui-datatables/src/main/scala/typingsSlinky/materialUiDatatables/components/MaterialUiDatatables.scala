package typingsSlinky.materialUiDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialUiDatatables.PartialDataTableProps
import typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsSlinky.materialUiDatatables.mod.Column
import typingsSlinky.materialUiDatatables.mod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialUiDatatables
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui-datatables", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    columns: js.Array[Column] = null,
    count: Int | Double = null,
    data: js.Array[_] = null,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    filterHintText: String = null,
    filterValue: String = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerToolbarStyle: CSSProperties = null,
    headerToolbarMode: typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default | filter | String = null,
    height: js.Any = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit = null,
    onCellDoubleClick: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit = null,
    onFilterValueChange: /* value */ String => Unit = null,
    onNextPageClick: /* event */ js.Any => Unit = null,
    onPreviousPageClick: /* event */ js.Any => Unit = null,
    onRowSelection: /* selectedRows */ js.Any => Unit = null,
    onRowSizeChange: (/* index */ Double, /* value */ js.Any) => Unit = null,
    onSortOrderChange: (/* key */ String, /* order */ String) => Unit = null,
    page: Int | Double = null,
    rowSize: Int | Double = null,
    rowSizeLabel: String = null,
    rowSizeList: js.Array[Double] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showCheckboxes: js.UndefOr[Boolean] = js.undefined,
    showFooterToolbar: js.UndefOr[Boolean] = js.undefined,
    showHeaderToolbar: js.UndefOr[Boolean] = js.undefined,
    showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    showRowSizeControls: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined,
    summaryLabelTemplate: (/* start */ Double, /* end */ Double, /* count */ Double) => _ = null,
    tableBodyStyle: CSSProperties = null,
    tableHeaderColumnStyle: CSSProperties = null,
    tableHeaderStyle: CSSProperties = null,
    tableRowColumnStyle: CSSProperties = null,
    tableRowStyle: CSSProperties = null,
    tableStyle: CSSProperties = null,
    tableWrapperStyle: CSSProperties = null,
    titleStyle: CSSProperties = null,
    toolbarIconRight: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (filterHintText != null) __obj.updateDynamic("filterHintText")(filterHintText.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerToolbarStyle != null) __obj.updateDynamic("footerToolbarStyle")(footerToolbarStyle.asInstanceOf[js.Any])
    if (headerToolbarMode != null) __obj.updateDynamic("headerToolbarMode")(headerToolbarMode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction5(onCellClick))
    if (onCellDoubleClick != null) __obj.updateDynamic("onCellDoubleClick")(js.Any.fromFunction5(onCellDoubleClick))
    if (onFilterValueChange != null) __obj.updateDynamic("onFilterValueChange")(js.Any.fromFunction1(onFilterValueChange))
    if (onNextPageClick != null) __obj.updateDynamic("onNextPageClick")(js.Any.fromFunction1(onNextPageClick))
    if (onPreviousPageClick != null) __obj.updateDynamic("onPreviousPageClick")(js.Any.fromFunction1(onPreviousPageClick))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1(onRowSelection))
    if (onRowSizeChange != null) __obj.updateDynamic("onRowSizeChange")(js.Any.fromFunction2(onRowSizeChange))
    if (onSortOrderChange != null) __obj.updateDynamic("onSortOrderChange")(js.Any.fromFunction2(onSortOrderChange))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (rowSizeLabel != null) __obj.updateDynamic("rowSizeLabel")(rowSizeLabel.asInstanceOf[js.Any])
    if (rowSizeList != null) __obj.updateDynamic("rowSizeList")(rowSizeList.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckboxes)) __obj.updateDynamic("showCheckboxes")(showCheckboxes.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooterToolbar)) __obj.updateDynamic("showFooterToolbar")(showFooterToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderToolbar)) __obj.updateDynamic("showHeaderToolbar")(showHeaderToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderToolbarFilterIcon)) __obj.updateDynamic("showHeaderToolbarFilterIcon")(showHeaderToolbarFilterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowSizeControls)) __obj.updateDynamic("showRowSizeControls")(showRowSizeControls.asInstanceOf[js.Any])
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows.asInstanceOf[js.Any])
    if (summaryLabelTemplate != null) __obj.updateDynamic("summaryLabelTemplate")(js.Any.fromFunction3(summaryLabelTemplate))
    if (tableBodyStyle != null) __obj.updateDynamic("tableBodyStyle")(tableBodyStyle.asInstanceOf[js.Any])
    if (tableHeaderColumnStyle != null) __obj.updateDynamic("tableHeaderColumnStyle")(tableHeaderColumnStyle.asInstanceOf[js.Any])
    if (tableHeaderStyle != null) __obj.updateDynamic("tableHeaderStyle")(tableHeaderStyle.asInstanceOf[js.Any])
    if (tableRowColumnStyle != null) __obj.updateDynamic("tableRowColumnStyle")(tableRowColumnStyle.asInstanceOf[js.Any])
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (tableWrapperStyle != null) __obj.updateDynamic("tableWrapperStyle")(tableWrapperStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (toolbarIconRight != null) __obj.updateDynamic("toolbarIconRight")(toolbarIconRight.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUiDatatables.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialDataTableProps
}

