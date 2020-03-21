package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.AnonCallback
import typingsSlinky.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsGroupRenderProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsList
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.std.Event_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsListBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.DetailsListBase] {
  @JSImport("office-ui-fabric-react", "DetailsListBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    items: js.Array[_],
    ariaLabel: String = null,
    ariaLabelForGrid: String = null,
    ariaLabelForListHeader: String = null,
    ariaLabelForSelectAllCheckbox: String = null,
    ariaLabelForSelectionColumn: String = null,
    cellStyleProps: ICellStyleProps = null,
    checkButtonAriaLabel: String = null,
    checkboxCellClassName: String = null,
    checkboxVisibility: CheckboxVisibility = null,
    columnReorderOptions: IColumnReorderOptions = null,
    columns: js.Array[IColumn] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IDetailsList] = null,
    constrainMode: ConstrainMode = null,
    disableSelectionZone: js.UndefOr[Boolean] = js.undefined,
    dragDropEvents: IDragDropEvents = null,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.undefined,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String = null,
    getGroupHeight: (/* group */ IGroup, /* groupIndex */ Double) => Double = null,
    getKey: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => String = null,
    getRowAriaDescribedBy: /* item */ js.Any => String = null,
    getRowAriaLabel: /* item */ js.Any => String = null,
    groupProps: IDetailsGroupRenderProps = null,
    groups: js.Array[IGroup] = null,
    indentWidth: Int | Double = null,
    initialFocusedIndex: Int | Double = null,
    isHeaderVisible: js.UndefOr[Boolean] = js.undefined,
    isPlaceholderData: js.UndefOr[Boolean] = js.undefined,
    layoutMode: DetailsListLayoutMode = null,
    listProps: IListProps[_] = null,
    minimumPixelsForDrag: Int | Double = null,
    onActiveItemChanged: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]]) => Unit = null,
    onColumnHeaderClick: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Unit = null,
    onColumnHeaderContextMenu: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit = null,
    onColumnResize: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onDidUpdate: /* detailsList */ js.UndefOr[typingsSlinky.officeUiFabricReact.detailsListBaseMod.DetailsListBase] => Unit = null,
    onItemContextMenu: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Unit | Boolean = null,
    onItemInvoked: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Unit = null,
    onRenderCheckbox: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    onRenderDetailsFooter: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderDetailsHeader: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => TagMod[Any] = null,
    onRenderMissingItem: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => TagMod[Any] = null,
    onRenderRow: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRowDidMount: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit = null,
    onRowWillUnmount: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit = null,
    onShouldVirtualize: /* props */ IListProps[_] => Boolean = null,
    rowElementEventMap: js.Array[AnonCallback] = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined,
    selectionZoneProps: ISelectionZoneProps = null,
    setKey: String = null,
    shouldApplyApplicationRole: js.UndefOr[Boolean] = js.undefined,
    skipViewportMeasures: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    usePageCache: js.UndefOr[Boolean] = js.undefined,
    useReducedRowRenderer: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.DetailsListBase] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelForGrid != null) __obj.updateDynamic("ariaLabelForGrid")(ariaLabelForGrid.asInstanceOf[js.Any])
    if (ariaLabelForListHeader != null) __obj.updateDynamic("ariaLabelForListHeader")(ariaLabelForListHeader.asInstanceOf[js.Any])
    if (ariaLabelForSelectAllCheckbox != null) __obj.updateDynamic("ariaLabelForSelectAllCheckbox")(ariaLabelForSelectAllCheckbox.asInstanceOf[js.Any])
    if (ariaLabelForSelectionColumn != null) __obj.updateDynamic("ariaLabelForSelectionColumn")(ariaLabelForSelectionColumn.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (checkButtonAriaLabel != null) __obj.updateDynamic("checkButtonAriaLabel")(checkButtonAriaLabel.asInstanceOf[js.Any])
    if (checkboxCellClassName != null) __obj.updateDynamic("checkboxCellClassName")(checkboxCellClassName.asInstanceOf[js.Any])
    if (checkboxVisibility != null) __obj.updateDynamic("checkboxVisibility")(checkboxVisibility.asInstanceOf[js.Any])
    if (columnReorderOptions != null) __obj.updateDynamic("columnReorderOptions")(columnReorderOptions.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (constrainMode != null) __obj.updateDynamic("constrainMode")(constrainMode.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSelectionZone)) __obj.updateDynamic("disableSelectionZone")(disableSelectionZone.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(enterModalSelectionOnTouch)) __obj.updateDynamic("enterModalSelectionOnTouch")(enterModalSelectionOnTouch.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3(getCellValueKey))
    if (getGroupHeight != null) __obj.updateDynamic("getGroupHeight")(js.Any.fromFunction2(getGroupHeight))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2(getKey))
    if (getRowAriaDescribedBy != null) __obj.updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1(getRowAriaDescribedBy))
    if (getRowAriaLabel != null) __obj.updateDynamic("getRowAriaLabel")(js.Any.fromFunction1(getRowAriaLabel))
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (initialFocusedIndex != null) __obj.updateDynamic("initialFocusedIndex")(initialFocusedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderVisible)) __obj.updateDynamic("isHeaderVisible")(isHeaderVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlaceholderData)) __obj.updateDynamic("isPlaceholderData")(isPlaceholderData.asInstanceOf[js.Any])
    if (layoutMode != null) __obj.updateDynamic("layoutMode")(layoutMode.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    if (onActiveItemChanged != null) __obj.updateDynamic("onActiveItemChanged")(js.Any.fromFunction3(onActiveItemChanged))
    if (onColumnHeaderClick != null) __obj.updateDynamic("onColumnHeaderClick")(js.Any.fromFunction2(onColumnHeaderClick))
    if (onColumnHeaderContextMenu != null) __obj.updateDynamic("onColumnHeaderContextMenu")(js.Any.fromFunction2(onColumnHeaderContextMenu))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction3(onColumnResize))
    if (onDidUpdate != null) __obj.updateDynamic("onDidUpdate")(js.Any.fromFunction1(onDidUpdate))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3(onItemContextMenu))
    if (onItemInvoked != null) __obj.updateDynamic("onItemInvoked")(js.Any.fromFunction3(onItemInvoked))
    if (onRenderCheckbox != null) __obj.updateDynamic("onRenderCheckbox")(js.Any.fromFunction2(onRenderCheckbox))
    if (onRenderDetailsFooter != null) __obj.updateDynamic("onRenderDetailsFooter")(js.Any.fromFunction2(onRenderDetailsFooter))
    if (onRenderDetailsHeader != null) __obj.updateDynamic("onRenderDetailsHeader")(js.Any.fromFunction2(onRenderDetailsHeader))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(onRenderItemColumn))
    if (onRenderMissingItem != null) __obj.updateDynamic("onRenderMissingItem")(js.Any.fromFunction2(onRenderMissingItem))
    if (onRenderRow != null) __obj.updateDynamic("onRenderRow")(js.Any.fromFunction2(onRenderRow))
    if (onRowDidMount != null) __obj.updateDynamic("onRowDidMount")(js.Any.fromFunction2(onRowDidMount))
    if (onRowWillUnmount != null) __obj.updateDynamic("onRowWillUnmount")(js.Any.fromFunction2(onRowWillUnmount))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(onShouldVirtualize))
    if (rowElementEventMap != null) __obj.updateDynamic("rowElementEventMap")(rowElementEventMap.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionPreservedOnEmptyClick)) __obj.updateDynamic("selectionPreservedOnEmptyClick")(selectionPreservedOnEmptyClick.asInstanceOf[js.Any])
    if (selectionZoneProps != null) __obj.updateDynamic("selectionZoneProps")(selectionZoneProps.asInstanceOf[js.Any])
    if (setKey != null) __obj.updateDynamic("setKey")(setKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldApplyApplicationRole)) __obj.updateDynamic("shouldApplyApplicationRole")(shouldApplyApplicationRole.asInstanceOf[js.Any])
    if (!js.isUndefined(skipViewportMeasures)) __obj.updateDynamic("skipViewportMeasures")(skipViewportMeasures.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(usePageCache)) __obj.updateDynamic("usePageCache")(usePageCache.asInstanceOf[js.Any])
    if (!js.isUndefined(useReducedRowRenderer)) __obj.updateDynamic("useReducedRowRenderer")(useReducedRowRenderer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDetailsListProps
}

