package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IColumnReorderHeaderProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeader
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyleProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderStyles
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
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

object DetailsHeader {
  @JSImport("office-ui-fabric-react", "DetailsHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForSelectAllCheckbox(value: String): this.type = set("ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForSelectionColumn(value: String): this.type = set("ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelForToggleAllGroupsButton(value: String): this.type = set("ariaLabelForToggleAllGroupsButton", value.asInstanceOf[js.Any])
    @scala.inline
    def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapseAllVisibility(value: CollapseAllVisibility): this.type = set("collapseAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def columnReorderOptions(value: IColumnReorderOptions): this.type = set("columnReorderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def columnReorderProps(value: IColumnReorderHeaderProps): this.type = set("columnReorderProps", value.asInstanceOf[js.Any])
    @scala.inline
    def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value :_*))
    @scala.inline
    def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDetailsHeader | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDetailsHeader]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDetailsHeader]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def isAllCollapsed(value: Boolean): this.type = set("isAllCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumPixelsForDrag(value: Double): this.type = set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def onColumnAutoResized(value: (/* column */ IColumn, /* columnIndex */ Double) => Unit): this.type = set("onColumnAutoResized", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit): this.type = set("onColumnClick", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnContextMenu(value: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onColumnContextMenu", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnIsSizingChanged(value: (/* column */ IColumn, /* isSizing */ Boolean) => Unit): this.type = set("onColumnIsSizingChanged", js.Any.fromFunction2(value))
    @scala.inline
    def onColumnResized(value: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit): this.type = set("onColumnResized", js.Any.fromFunction3(value))
    @scala.inline
    def onRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderColumnHeaderTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def onToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): this.type = set("onToggleCollapseAll", js.Any.fromFunction1(value))
    @scala.inline
    def rowWidth(value: Double): this.type = set("rowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def selectAllVisibility(value: SelectAllVisibility): this.type = set("selectAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDetailsHeaderStyleProps => DeepPartial[IDetailsHeaderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsHeaderBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(layoutMode: DetailsListLayoutMode): Builder = {
    val __props = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsHeaderBaseProps]))
  }
}

