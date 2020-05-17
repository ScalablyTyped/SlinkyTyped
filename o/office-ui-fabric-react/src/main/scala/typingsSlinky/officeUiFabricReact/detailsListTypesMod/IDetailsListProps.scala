package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.Callback
import typingsSlinky.officeUiFabricReact.detailsFooterTypesMod.IDetailsFooterProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderProps
import typingsSlinky.officeUiFabricReact.detailsListBaseMod.DetailsListBase
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.officeUiFabricReact.withViewportMod.IWithViewportProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListProps
  extends IBaseProps[IDetailsList]
     with IWithViewportProps {
  /** A text summary of the table set via aria-label. */
  var ariaLabel: js.UndefOr[String] = js.native
  /** Aria label for grid in details list. */
  var ariaLabelForGrid: js.UndefOr[String] = js.native
  /** The aria-label attribute to stamp out on the list header */
  var ariaLabelForListHeader: js.UndefOr[String] = js.native
  /** The aria-label attribute to stamp out on select all checkbox for the list */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.native
  /**
    * An ARIA label for the name of the selection column, for localization.
    */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.native
  /**
    * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
    * handled separately from normal theme styling, but they are passed to the styling system.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /** Check button aria label for details list. */
  var checkButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Optional class name to add to the cell of a checkbox
    */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  /**
    * Controls the visibility of selection check box.
    * @defaultvalue CheckboxVisibility.onHover
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  /** Optional class name to add to the root element. */
  var className: js.UndefOr[String] = js.native
  /**
    * Options for column re-order using drag and drop
    */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.native
  /** Given column defitions. If none are provided, default columns will be created based on the item's properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  /** Whether the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.native
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.native
  /**
    * Whether or not to disable the built-in SelectionZone, so the host component can provide its own.
    */
  var disableSelectionZone: js.UndefOr[Boolean] = js.native
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  /**
    * Whether to animate updates
    */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the selection zone should enter modal state on touch.
    */
  var enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.native
  /**
    * If provided, will be the "default" item column cell value return. column getValueKey can override getCellValue.
    */
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  /**
    * Optional function to override default group height calculation used by list virtualization.
    */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
  /**
    * Callback to get the item key, to be used in the selection and on render.
    * Must be provided if sorting or filtering is enabled.
    */
  var getKey: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]] = js.native
  /** Callback to get the aria-describedby IDs (space separated strings) of the elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  /** Callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  /** Optional override properties to render groups. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.native
  /** Optional grouping instructions. The definition for IGroup can be found under the GroupedList component. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /** Optional override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Optional default focused index to set focus to once the items have rendered and the index exists.
    */
  var initialFocusedIndex: js.UndefOr[Double] = js.native
  /**
    * Controls the visibility of the details header.
    * @defaultvalue true
    */
  var isHeaderVisible: js.UndefOr[Boolean] = js.native
  /** Set this to true to indicate that the items being displayed is placeholder data. */
  var isPlaceholderData: js.UndefOr[Boolean] = js.native
  /** The items to render. */
  var items: js.Array[_] = js.native
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.native
  /** Optional properties to pass through to the list components being rendered. */
  var listProps: js.UndefOr[IListProps[_]] = js.native
  /**
    * The minimum mouse move distance to interpret the action as drag event.
    * @defaultvalue 5
    */
  var minimumPixelsForDrag: js.UndefOr[Double] = js.native
  /**
    * Callback for when an item in the list becomes active by clicking anywhere inside the row or navigating to it
    * with the keyboard.
    */
  var onActiveItemChanged: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /** Callback for when the user clicks on the column header. */
  var onColumnHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* column */ js.UndefOr[IColumn], 
      Unit
    ]
  ] = js.native
  /** Callback for when the user asks for a contextual menu (usually via right click) from a column header. */
  var onColumnHeaderContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /** Callback fired on column resize */
  var onColumnResize: js.UndefOr[
    js.Function3[
      /* column */ js.UndefOr[IColumn], 
      /* newWidth */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** Callback for when the details list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[js.Function1[/* detailsList */ js.UndefOr[DetailsListBase], Unit]] = js.native
  /**
    * Callback for when the context menu of an item has been accessed.
    * If undefined or false are returned, ev.preventDefault() will be called.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit | Boolean
    ]
  ] = js.native
  /** Callback for when a given row has been invoked (by pressing enter while it is selected.) */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderCheckbox: js.UndefOr[IRenderFunction[IDetailsListCheckboxProps]] = js.native
  /**
    * An override to render the details footer.
    */
  var onRenderDetailsFooter: js.UndefOr[IRenderFunction[IDetailsFooterProps]] = js.native
  /**
    * An override to render the details header.
    */
  var onRenderDetailsHeader: js.UndefOr[IRenderFunction[IDetailsHeaderProps]] = js.native
  /**
    * If provided, will be the "default" item column renderer method.
    * This affects cells within the rows, not the rows themselves.
    * If a column definition provides its own onRender method, that will be used instead of this.
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      TagMod[Any]
    ]
  ] = js.native
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[Double], 
      /* rowProps */ js.UndefOr[IDetailsRowProps], 
      TagMod[Any]
    ]
  ] = js.native
  /**
    *  If provided, will allow the caller to override the default row rendering.
    */
  var onRenderRow: js.UndefOr[IRenderFunction[IDetailsRowProps]] = js.native
  /**
    * Callback for when a given row has been mounted. Useful for identifying when a row has been rendered on the page.
    */
  var onRowDidMount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  /**
    * Callback for when a given row has been unmounted.
    * Useful for identifying when a row has been removed from the page.
    */
  var onRowWillUnmount: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], Unit]
  ] = js.native
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance
    * for smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[Callback]] = js.native
  /** Optional selection model to track selection state.  */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  /** Controls how/if the details list manages selection. Options include none, single, multiple */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * By default, selection is cleared when clicking on an empty (non-focusable) section of the screen.
    * Setting this value to true overrides that behavior and maintains selection.
    * @defaultvalue false
    **/
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.native
  /**
    * Addition props to pass through to the selection zone created by default.
    */
  var selectionZoneProps: js.UndefOr[ISelectionZoneProps] = js.native
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[String] = js.native
  /** Boolean value to indicate if the role application should be applied on details list. Set to false by default */
  var shouldApplyApplicationRole: js.UndefOr[Boolean] = js.native
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.native
  /**
    * Theme provided by the Higher Order Component
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable render page caching. This is an experimental performance optimization that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.native
  /** Viewport, provided by the withViewport decorator. */
  var viewport: js.UndefOr[IViewport] = js.native
}

object IDetailsListProps {
  @scala.inline
  def apply(items: js.Array[_]): IDetailsListProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListProps]
  }
  @scala.inline
  implicit class IDetailsListPropsOps[Self <: IDetailsListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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
    def withAriaLabelForGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelForListHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForListHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelForListHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelForListHeader")(js.undefined)
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
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxVisibility(value: CheckboxVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(js.undefined)
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
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainMode(value: ConstrainMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSelectionZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelectionZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelectionZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelectionZone")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDropEvents(value: IDragDropEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDropEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUpdateAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUpdateAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterModalSelectionOnTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterModalSelectionOnTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterModalSelectionOnTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterModalSelectionOnTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetCellValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetGroupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetKey(value: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowAriaLabel(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupProps(value: IDetailsGroupRenderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[IGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFocusedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocusedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocusedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocusedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeaderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlaceholderData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaceholderData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPlaceholderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaceholderData")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutMode(value: DetailsListLayoutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(js.undefined)
        ret
    }
    @scala.inline
    def withListProps(value: IListProps[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProps")(js.undefined)
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
    def withOnActiveItemChanged(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnActiveItemChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnHeaderClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnHeaderClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnHeaderClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnHeaderContextMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnHeaderContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnHeaderContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDidUpdate(value: /* detailsList */ js.UndefOr[DetailsListBase] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemInvoked(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInvoked")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemInvoked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInvoked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCheckbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDetailsFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDetailsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItemColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderMissingItem(
      value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMissingItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderMissingItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderMissingItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDidMount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDidMount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowWillUnmount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowWillUnmount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowWillUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowWillUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShouldVirtualize(value: /* props */ IListProps[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShouldVirtualize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldVirtualize")(js.undefined)
        ret
    }
    @scala.inline
    def withRowElementEventMap(value: js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowElementEventMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowElementEventMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowElementEventMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionPreservedOnEmptyClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPreservedOnEmptyClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPreservedOnEmptyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPreservedOnEmptyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionZoneProps(value: ISelectionZoneProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionZoneProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionZoneProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionZoneProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldApplyApplicationRole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldApplyApplicationRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldApplyApplicationRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldApplyApplicationRole")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDetailsListStyleProps => Partial[IDetailsListStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = {
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
    @scala.inline
    def withUsePageCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePageCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePageCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePageCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUseReducedRowRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useReducedRowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseReducedRowRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useReducedRowRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: IViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

