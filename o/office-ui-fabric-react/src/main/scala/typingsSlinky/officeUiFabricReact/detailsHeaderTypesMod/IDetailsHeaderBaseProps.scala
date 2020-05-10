package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsSlinky.officeUiFabricReact.detailsHeaderBaseMod.DetailsHeaderBase
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeaderBaseProps
  extends ClassAttributes[DetailsHeaderBase]
     with IDetailsItemProps {
  /** ariaLabel for the entire header */
  var ariaLabel: js.UndefOr[String] = js.native
  /** ariaLabel for the header checkbox that selects or deselects everything */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.native
  /** ariaLabel for the selection column */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.native
  /** ariaLabel for expand/collapse group button */
  var ariaLabelForToggleAllGroupsButton: js.UndefOr[String] = js.native
  /** Overriding class name */
  var className: js.UndefOr[String] = js.native
  /** Whether to collapse for all visibility */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.native
  /** Column reordering options */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.native
  /** Column reordering options */
  var columnReorderProps: js.UndefOr[IColumnReorderHeaderProps] = js.native
  /** Ref to the component itself */
  var componentRef: js.UndefOr[IRefObject[IDetailsHeader]] = js.native
  /** Whether or not all is collapsed */
  var isAllCollapsed: js.UndefOr[Boolean] = js.native
  /** Layout mode - fixedColumns or justified */
  var layoutMode: DetailsListLayoutMode = js.native
  /** Minimum pixels to be moved before dragging is registered */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.native
  /** Callback for when column is automatically resized */
  var onColumnAutoResized: js.UndefOr[js.Function2[/* column */ IColumn, /* columnIndex */ Double, Unit]] = js.native
  /** Callback for when the column is clicked */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
  ] = js.native
  /** Callback for when the column needs to show a context menu */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement], Unit]
  ] = js.native
  /** Callback for when column sizing has changed */
  var onColumnIsSizingChanged: js.UndefOr[js.Function2[/* column */ IColumn, /* isSizing */ Boolean, Unit]] = js.native
  /** Callback for when column is resized */
  var onColumnResized: js.UndefOr[
    js.Function3[/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double, Unit]
  ] = js.native
  /** Callback to render a tooltip for the column header */
  var onRenderColumnHeaderTooltip: js.UndefOr[IRenderFunction[IDetailsColumnRenderTooltipProps]] = js.native
  /** If provided, can be used to render a custom checkbox */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.native
  /** Callback for when collapse all is toggled */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.native
  /** Select all button visibility */
  var selectAllVisibility: js.UndefOr[SelectAllVisibility] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]] = js.native
  /** Theme from the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
}

object IDetailsHeaderBaseProps {
  @scala.inline
  def apply(layoutMode: DetailsListLayoutMode): IDetailsHeaderBaseProps = {
    val __obj = js.Dynamic.literal(layoutMode = layoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsHeaderBaseProps]
  }
  @scala.inline
  implicit class IDetailsHeaderBasePropsOps[Self <: IDetailsHeaderBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutMode(value: DetailsListLayoutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelForSelectAllCheckbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForSelectAllCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForSelectAllCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForSelectAllCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelForSelectionColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForSelectionColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForSelectionColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForSelectionColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelForToggleAllGroupsButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForToggleAllGroupsButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForToggleAllGroupsButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForToggleAllGroupsButton")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAllVisibility(value: CollapseAllVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAllVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnReorderOptions(value: IColumnReorderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnReorderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorderOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnReorderProps(value: IColumnReorderHeaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnReorderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IDetailsHeader | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IDetailsHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IDetailsHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumPixelsForDrag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPixelsForDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPixelsForDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPixelsForDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnAutoResized(value: (/* column */ IColumn, /* columnIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnAutoResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnAutoResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnAutoResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnContextMenu(value: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnIsSizingChanged(value: (/* column */ IColumn, /* isSizing */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnIsSizingChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnIsSizingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnIsSizingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResized(value: (/* column */ IColumn, /* newWidth */ Double, /* columnIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResized")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderColumnHeaderTooltip(
      value: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderColumnHeaderTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderColumnHeaderTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDetailsCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggleCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllVisibility(value: SelectAllVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDetailsHeaderStyleProps => Partial[IDetailsHeaderStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDetailsHeaderStyleProps, IDetailsHeaderStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFastIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFastIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(js.undefined)
        ret
    }
  }
  
}

