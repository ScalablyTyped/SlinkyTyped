package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonField
import typingsSlinky.primereact.columnColumnMod.ColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.columnMod.Column] {
  @JSImport("primereact/column", "Column")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, colSpan, rowSpan */
  def apply(
    body: js.Any = null,
    bodyClassName: String = null,
    bodyStyle: js.Object = null,
    columnKey: String = null,
    editor: /* props */ js.Any => js.UndefOr[ReactElement] = null,
    editorValidator: /* props */ js.Any => Boolean = null,
    editorValidatorEvent: String = null,
    excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined,
    expander: js.UndefOr[Boolean] = js.undefined,
    exportable: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterElement: js.Object = null,
    filterFunction: (/* value */ js.Any, /* filter */ js.Any) => Unit = null,
    filterMatchMode: String = null,
    filterMaxLength: Int | Double = null,
    filterPlaceholder: String = null,
    filterType: String = null,
    footer: js.Any = null,
    footerClassName: String = null,
    footerStyle: js.Object = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null,
    loadingBody: js.Any = null,
    onEditorCancel: /* props */ js.Any => Unit = null,
    onEditorSubmit: /* props */ js.Any => Unit = null,
    rowEditor: js.UndefOr[Boolean] = js.undefined,
    rowReorder: js.UndefOr[Boolean] = js.undefined,
    rowReorderIcon: String = null,
    selectionMode: String = null,
    sortField: String = null,
    sortFunction: /* e */ AnonField => Unit = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.columnMod.Column] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(js.Any.fromFunction1(editor))
    if (editorValidator != null) __obj.updateDynamic("editorValidator")(js.Any.fromFunction1(editorValidator))
    if (editorValidatorEvent != null) __obj.updateDynamic("editorValidatorEvent")(editorValidatorEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeGlobalFilter)) __obj.updateDynamic("excludeGlobalFilter")(excludeGlobalFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(expander)) __obj.updateDynamic("expander")(expander.asInstanceOf[js.Any])
    if (!js.isUndefined(exportable)) __obj.updateDynamic("exportable")(exportable.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterElement != null) __obj.updateDynamic("filterElement")(filterElement.asInstanceOf[js.Any])
    if (filterFunction != null) __obj.updateDynamic("filterFunction")(js.Any.fromFunction2(filterFunction))
    if (filterMatchMode != null) __obj.updateDynamic("filterMatchMode")(filterMatchMode.asInstanceOf[js.Any])
    if (filterMaxLength != null) __obj.updateDynamic("filterMaxLength")(filterMaxLength.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (loadingBody != null) __obj.updateDynamic("loadingBody")(loadingBody.asInstanceOf[js.Any])
    if (onEditorCancel != null) __obj.updateDynamic("onEditorCancel")(js.Any.fromFunction1(onEditorCancel))
    if (onEditorSubmit != null) __obj.updateDynamic("onEditorSubmit")(js.Any.fromFunction1(onEditorSubmit))
    if (!js.isUndefined(rowEditor)) __obj.updateDynamic("rowEditor")(rowEditor.asInstanceOf[js.Any])
    if (!js.isUndefined(rowReorder)) __obj.updateDynamic("rowReorder")(rowReorder.asInstanceOf[js.Any])
    if (rowReorderIcon != null) __obj.updateDynamic("rowReorderIcon")(rowReorderIcon.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction1(sortFunction))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.columnMod.Column] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.columnMod.Column](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ColumnProps
}

