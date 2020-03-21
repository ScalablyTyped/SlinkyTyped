package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsSlinky.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsHeaderProps extends IDetailsHeaderBaseProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsHeaderProps: js.Array[IColumn]
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsHeaderProps: SelectionMode
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsHeaderProps: ISelection[IObjectWithKey]
}

object IDetailsHeaderProps {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    layoutMode: DetailsListLayoutMode,
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode,
    ariaLabel: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    ariaLabelForToggleAllGroupsButton: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkboxVisibility: CheckboxVisibility = null,
    className: String = null,
    collapseAllVisibility: CollapseAllVisibility = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columnReorderProps: IColumnReorderHeaderProps = null,
    componentRef: IRefObject[IDetailsHeader] = null,
    groupNestingDepth: Int | Double = null,
    indentWidth: Int | Double = null,
    isAllCollapsed: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    minimumPixelsForDrag: Int | Double = null,
    onColumnAutoResized: (/* column */ IColumn, /* columnIndex */ Double) => Unit = null,
    onColumnClick: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onColumnIsSizingChanged: (/* column */ IColumn, /* isSizing */ Boolean) => Unit = null,
    onColumnResized: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null = null,
    onToggleCollapseAll: /* isAllCollapsed */ Boolean => Unit = null,
    ref: LegacyRef[DetailsHeaderBase] = null,
    rowWidth: Int | Double = null,
    selectAllVisibility: SelectAllVisibility = null,
    styles: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IDetailsHeaderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox.asInstanceOf[js.Any])
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn.asInstanceOf[js.Any])
    if (ariaLabelForToggleAllGroupsButton != null) __obj.updateDynamic("ariaLabelForToggleAllGroupsButton")(ariaLabelForToggleAllGroupsButton.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseAllVisibility != null) __obj.updateDynamic("collapseAllVisibility")(collapseAllVisibility.asInstanceOf[js.Any])
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions.asInstanceOf[js.Any])
    if (columnReorderProps != null) __obj.updateDynamic("columnReorderProps")(columnReorderProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllCollapsed)) __obj.updateDynamic("isAllCollapsed")(isAllCollapsed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onColumnAutoResized != null) __obj.updateDynamic("onColumnAutoResized")(js.Any.fromFunction2(onColumnAutoResized))
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onColumnIsSizingChanged != null) __obj.updateDynamic("onColumnIsSizingChanged")(js.Any.fromFunction2(onColumnIsSizingChanged))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction3(onColumnResized))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(onRenderDetailsCheckbox))
    if (onToggleCollapseAll != null) __obj.updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(onToggleCollapseAll))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowWidth != null) __obj.updateDynamic("rowWidth")(rowWidth.asInstanceOf[js.Any])
    if (selectAllVisibility != null) __obj.updateDynamic("selectAllVisibility")(selectAllVisibility.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderProps]
  }
}

