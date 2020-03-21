package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAllowClearing
import typingsSlinky.devextreme.AnonColumnColumnIndexComponent
import typingsSlinky.devextreme.AnonDisplayValueOldValue
import typingsSlinky.devextreme.AnonDisplayValueRow
import typingsSlinky.devextreme.AnonGroupInterval
import typingsSlinky.devextreme.AnonSearchMode
import typingsSlinky.devextreme.devextremeStrings.Equalssign
import typingsSlinky.devextreme.devextremeStrings.Greaterthansign
import typingsSlinky.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Lessthansign
import typingsSlinky.devextreme.devextremeStrings.LessthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.LessthansignGreaterthansign
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.adaptive
import typingsSlinky.devextreme.devextremeStrings.add
import typingsSlinky.devextreme.devextremeStrings.asc
import typingsSlinky.devextreme.devextremeStrings.between
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.buttons
import typingsSlinky.devextreme.devextremeStrings.cancel
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.desc
import typingsSlinky.devextreme.devextremeStrings.edit
import typingsSlinky.devextreme.devextremeStrings.endswith
import typingsSlinky.devextreme.devextremeStrings.exclude
import typingsSlinky.devextreme.devextremeStrings.include
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.notcontains
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.save
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.undelete
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListColumn extends GridBaseColumn {
  /** Allows you to customize buttons in the editing column or create a custom command column. Applies only if the column's type is "buttons". */
  var buttons: js.UndefOr[
    js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton]
  ] = js.undefined
  /** Specifies a custom template for data cells. */
  var cellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonDisplayValueOldValue, _])
  ] = js.undefined
  /** Configures columns. */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.undefined
  /** Specifies a custom template for data cells in editing state. */
  var editCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonDisplayValueRow, _])
  ] = js.undefined
  /** Specifies a custom template for column headers. */
  var headerCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ AnonColumnColumnIndexComponent, _])
  ] = js.undefined
  /** Specifies the command column that this object customizes. */
  var `type`: js.UndefOr[adaptive | buttons] = js.undefined
}

object dxTreeListColumn {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowFixing: js.UndefOr[Boolean] = js.undefined,
    allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined,
    allowHiding: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton] = null,
    calculateCellValue: /* rowData */ js.Any => _ = null,
    calculateDisplayValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    calculateFilterExpression: (/* filterValue */ js.Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[_] | js.Function = null,
    calculateSortValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    caption: String = null,
    cellTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonDisplayValueOldValue, _]) = null,
    columns: js.Array[dxTreeListColumn | String] = null,
    cssClass: String = null,
    customizeText: /* cellInfo */ AnonGroupInterval => String = null,
    dataField: String = null,
    dataType: string_ | number | date | boolean_ | `object` | datetime = null,
    editCellTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ AnonDisplayValueRow, _]) = null,
    editorOptions: js.Any = null,
    encodeHtml: js.UndefOr[Boolean] = js.undefined,
    falseText: String = null,
    filterOperations: js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
    ] = null,
    filterType: exclude | include = null,
    filterValue: js.Any = null,
    filterValues: js.Array[_] = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    fixedPosition: left | right = null,
    formItem: dxFormSimpleItem = null,
    format: format = null,
    headerCellTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ AnonColumnColumnIndexComponent, _]) = null,
    headerFilter: AnonSearchMode = null,
    hidingPriority: Int | Double = null,
    isBand: js.UndefOr[Boolean] = js.undefined,
    lookup: AnonAllowClearing = null,
    minWidth: Int | Double = null,
    name: String = null,
    ownerBand: Int | Double = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    selectedFilterOperation: Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith = null,
    setCellValue: (/* newData */ js.Any, /* value */ js.Any, /* currentRowData */ js.Any) => Unit | Promise[Unit] | JQueryPromise[Unit] = null,
    showEditorAlways: js.UndefOr[Boolean] = js.undefined,
    showInColumnChooser: js.UndefOr[Boolean] = js.undefined,
    sortIndex: Int | Double = null,
    sortOrder: asc | desc = null,
    sortingMethod: (/* value1 */ js.Any, /* value2 */ js.Any) => Double = null,
    trueText: String = null,
    `type`: adaptive | buttons = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null,
    width: Double | String = null
  ): dxTreeListColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFixing)) __obj.updateDynamic("allowFixing")(allowFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHeaderFiltering)) __obj.updateDynamic("allowHeaderFiltering")(allowHeaderFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHiding)) __obj.updateDynamic("allowHiding")(allowHiding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (calculateCellValue != null) __obj.updateDynamic("calculateCellValue")(js.Any.fromFunction1(calculateCellValue))
    if (calculateDisplayValue != null) __obj.updateDynamic("calculateDisplayValue")(calculateDisplayValue.asInstanceOf[js.Any])
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction3(calculateFilterExpression))
    if (calculateSortValue != null) __obj.updateDynamic("calculateSortValue")(calculateSortValue.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (editCellTemplate != null) __obj.updateDynamic("editCellTemplate")(editCellTemplate.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeHtml)) __obj.updateDynamic("encodeHtml")(encodeHtml.asInstanceOf[js.Any])
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (filterOperations != null) __obj.updateDynamic("filterOperations")(filterOperations.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fixedPosition != null) __obj.updateDynamic("fixedPosition")(fixedPosition.asInstanceOf[js.Any])
    if (formItem != null) __obj.updateDynamic("formItem")(formItem.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (hidingPriority != null) __obj.updateDynamic("hidingPriority")(hidingPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(isBand)) __obj.updateDynamic("isBand")(isBand.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerBand != null) __obj.updateDynamic("ownerBand")(ownerBand.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (selectedFilterOperation != null) __obj.updateDynamic("selectedFilterOperation")(selectedFilterOperation.asInstanceOf[js.Any])
    if (setCellValue != null) __obj.updateDynamic("setCellValue")(js.Any.fromFunction3(setCellValue))
    if (!js.isUndefined(showEditorAlways)) __obj.updateDynamic("showEditorAlways")(showEditorAlways.asInstanceOf[js.Any])
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser.asInstanceOf[js.Any])
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListColumn]
  }
}

