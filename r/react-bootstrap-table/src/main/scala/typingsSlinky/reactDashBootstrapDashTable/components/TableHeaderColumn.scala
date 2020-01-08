package typingsSlinky.reactDashBootstrapDashTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashBootstrapDashTable.Anon_Attr
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CSVFieldType
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CustomAttrs
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CustomEditor
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DataAlignType
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditValidatorObject
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.Editable
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.Filter
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SortOrder
import typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TableHeaderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeaderColumn
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TableHeaderColumn
    ] {
  @JSImport("react-bootstrap-table", "TableHeaderColumn")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: colSpan, hidden, rowSpan */
  def apply(
    autoValue: Boolean | js.Function0[_] = null,
    caretRender: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | ReactElement = null,
    className: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]) = null,
    columnClassName: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]) = null,
    columnTitle: Boolean | String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ]) = null,
    csvFieldType: CSVFieldType = null,
    csvFormat: (/* cell */ js.Any, /* row */ js.Any) => String = null,
    csvFormatExtraData: js.Any = null,
    csvHeader: String = null,
    customEditor: CustomEditor[_, _] = null,
    customInsertEditor: Anon_Attr = null,
    dataAlign: DataAlignType = null,
    dataField: String = null,
    dataFormat: (/* cell */ js.Any, /* row */ js.Any, /* formatExtraData */ js.Any, /* rowIndex */ Double) => String | ReactElement = null,
    dataSort: js.UndefOr[Boolean] = js.undefined,
    defaultASC: js.UndefOr[Boolean] = js.undefined,
    editColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String]) = null,
    editTdAttr: CustomAttrs = null,
    editable: Boolean | (Editable[_, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]) = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    export: js.UndefOr[Boolean] = js.undefined,
    filter: Filter = null,
    filterFormatted: js.UndefOr[Boolean] = js.undefined,
    filterValue: (/* cell */ js.Any, /* row */ js.Any) => _ = null,
    formatExtraData: js.Any = null,
    headerAlign: DataAlignType = null,
    headerText: String = null,
    headerTitle: js.UndefOr[Boolean] = js.undefined,
    hiddenOnInsert: js.UndefOr[Boolean] = js.undefined,
    invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String]) = null,
    isKey: js.UndefOr[Boolean] = js.undefined,
    row: Int | Double = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    sortFunc: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* sortField */ String, /* extraData */ js.Any) => Double = null,
    sortFuncExtraData: js.Any = null,
    sortHeaderColumnClassName: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String]) = null,
    tdAttr: CustomAttrs = null,
    tdStyle: CSSProperties | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      CSSProperties
    ]) = null,
    thStyle: CSSProperties = null,
    width: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TableHeaderColumn
  ] = {
    val __obj = js.Dynamic.literal()
    if (autoValue != null) __obj.updateDynamic("autoValue")(autoValue.asInstanceOf[js.Any])
    if (caretRender != null) __obj.updateDynamic("caretRender")(js.Any.fromFunction2(caretRender))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnClassName != null) __obj.updateDynamic("columnClassName")(columnClassName.asInstanceOf[js.Any])
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (csvFieldType != null) __obj.updateDynamic("csvFieldType")(csvFieldType.asInstanceOf[js.Any])
    if (csvFormat != null) __obj.updateDynamic("csvFormat")(js.Any.fromFunction2(csvFormat))
    if (csvFormatExtraData != null) __obj.updateDynamic("csvFormatExtraData")(csvFormatExtraData.asInstanceOf[js.Any])
    if (csvHeader != null) __obj.updateDynamic("csvHeader")(csvHeader.asInstanceOf[js.Any])
    if (customEditor != null) __obj.updateDynamic("customEditor")(customEditor.asInstanceOf[js.Any])
    if (customInsertEditor != null) __obj.updateDynamic("customInsertEditor")(customInsertEditor.asInstanceOf[js.Any])
    if (dataAlign != null) __obj.updateDynamic("dataAlign")(dataAlign.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(js.Any.fromFunction4(dataFormat))
    if (!js.isUndefined(dataSort)) __obj.updateDynamic("dataSort")(dataSort.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultASC)) __obj.updateDynamic("defaultASC")(defaultASC.asInstanceOf[js.Any])
    if (editColumnClassName != null) __obj.updateDynamic("editColumnClassName")(editColumnClassName.asInstanceOf[js.Any])
    if (editTdAttr != null) __obj.updateDynamic("editTdAttr")(editTdAttr.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filterFormatted)) __obj.updateDynamic("filterFormatted")(filterFormatted.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(js.Any.fromFunction2(filterValue))
    if (formatExtraData != null) __obj.updateDynamic("formatExtraData")(formatExtraData.asInstanceOf[js.Any])
    if (headerAlign != null) __obj.updateDynamic("headerAlign")(headerAlign.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitle)) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenOnInsert)) __obj.updateDynamic("hiddenOnInsert")(hiddenOnInsert.asInstanceOf[js.Any])
    if (invalidEditColumnClassName != null) __obj.updateDynamic("invalidEditColumnClassName")(invalidEditColumnClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isKey)) __obj.updateDynamic("isKey")(isKey.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (sortFunc != null) __obj.updateDynamic("sortFunc")(js.Any.fromFunction5(sortFunc))
    if (sortFuncExtraData != null) __obj.updateDynamic("sortFuncExtraData")(sortFuncExtraData.asInstanceOf[js.Any])
    if (sortHeaderColumnClassName != null) __obj.updateDynamic("sortHeaderColumnClassName")(sortHeaderColumnClassName.asInstanceOf[js.Any])
    if (tdAttr != null) __obj.updateDynamic("tdAttr")(tdAttr.asInstanceOf[js.Any])
    if (tdStyle != null) __obj.updateDynamic("tdStyle")(tdStyle.asInstanceOf[js.Any])
    if (thStyle != null) __obj.updateDynamic("thStyle")(thStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TableHeaderColumn
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TableHeaderColumn](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableHeaderColumnProps
}

