package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.Callback
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
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsList {
  @JSImport("office-ui-fabric-react", "DetailsList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForGrid(value: String): this.type = set("ariaLabelForGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForListHeader(value: String): this.type = set("ariaLabelForListHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForSelectAllCheckbox(value: String): this.type = set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForSelectionColumn(value: String): this.type = set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def checkButtonAriaLabel(value: String): this.type = set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def checkboxCellClassName(value: String): this.type = set("checkboxCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columnReorderOptions(value: IColumnReorderOptions): this.type = set("columnReorderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value :_*))
    @scala.inline
    def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDetailsList | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDetailsList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDetailsList]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def constrainMode(value: ConstrainMode): this.type = set("constrainMode", value.asInstanceOf[js.Any])
    @scala.inline
    def disableSelectionZone(value: Boolean): this.type = set("disableSelectionZone", value.asInstanceOf[js.Any])
    @scala.inline
    def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def enterModalSelectionOnTouch(value: Boolean): this.type = set("enterModalSelectionOnTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def getCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    @scala.inline
    def getGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): this.type = set("getGroupHeight", js.Any.fromFunction2(value))
    @scala.inline
    def getKey(value: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => String): this.type = set("getKey", js.Any.fromFunction2(value))
    @scala.inline
    def getRowAriaDescribedBy(value: /* item */ js.Any => String): this.type = set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    @scala.inline
    def getRowAriaLabel(value: /* item */ js.Any => String): this.type = set("getRowAriaLabel", js.Any.fromFunction1(value))
    @scala.inline
    def groupProps(value: IDetailsGroupRenderProps): this.type = set("groupProps", value.asInstanceOf[js.Any])
    @scala.inline
    def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value :_*))
    @scala.inline
    def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def initialFocusedIndex(value: Double): this.type = set("initialFocusedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def isHeaderVisible(value: Boolean): this.type = set("isHeaderVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isPlaceholderData(value: Boolean): this.type = set("isPlaceholderData", value.asInstanceOf[js.Any])
    @scala.inline
    def layoutMode(value: DetailsListLayoutMode): this.type = set("layoutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def listProps(value: IListProps[_]): this.type = set("listProps", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumPixelsForDrag(value: Double): this.type = set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def onActiveItemChanged(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]]) => Unit
    ): this.type = set("onActiveItemChanged", js.Any.fromFunction3(value))
    @scala.inline
    def onColumnHeaderClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Unit
    ): this.type = set("onColumnHeaderClick", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): this.type = set("onColumnHeaderContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): this.type = set("onColumnResize", js.Any.fromFunction3(value))
    @scala.inline
    def onDidUpdate(
      value: /* detailsList */ js.UndefOr[typingsSlinky.officeUiFabricReact.detailsListBaseMod.DetailsListBase] => Unit
    ): this.type = set("onDidUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): this.type = set("onItemContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def onItemInvoked(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): this.type = set("onItemInvoked", js.Any.fromFunction3(value))
    @scala.inline
    def onRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderDetailsFooter", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderDetailsHeader", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactElement
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
    @scala.inline
    def onRenderMissingItem(
      value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => ReactElement
    ): this.type = set("onRenderMissingItem", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderRow", js.Any.fromFunction2(value))
    @scala.inline
    def onRowDidMount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): this.type = set("onRowDidMount", js.Any.fromFunction2(value))
    @scala.inline
    def onRowWillUnmount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): this.type = set("onRowWillUnmount", js.Any.fromFunction2(value))
    @scala.inline
    def onShouldVirtualize(value: /* props */ IListProps[_] => Boolean): this.type = set("onShouldVirtualize", js.Any.fromFunction1(value))
    @scala.inline
    def rowElementEventMapVarargs(value: Callback*): this.type = set("rowElementEventMap", js.Array(value :_*))
    @scala.inline
    def rowElementEventMap(value: js.Array[Callback]): this.type = set("rowElementEventMap", value.asInstanceOf[js.Any])
    @scala.inline
    def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionPreservedOnEmptyClick(value: Boolean): this.type = set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionZoneProps(value: ISelectionZoneProps): this.type = set("selectionZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): this.type = set("setKey", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldApplyApplicationRole(value: Boolean): this.type = set("shouldApplyApplicationRole", value.asInstanceOf[js.Any])
    @scala.inline
    def skipViewportMeasures(value: Boolean): this.type = set("skipViewportMeasures", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def usePageCache(value: Boolean): this.type = set("usePageCache", value.asInstanceOf[js.Any])
    @scala.inline
    def useReducedRowRenderer(value: Boolean): this.type = set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsListProps]))
  }
}

