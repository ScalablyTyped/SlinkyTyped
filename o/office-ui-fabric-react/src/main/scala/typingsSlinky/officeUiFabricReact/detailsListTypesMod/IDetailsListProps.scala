package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
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
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsListProps
  extends IBaseProps[IDetailsList]
     with IWithViewportProps {
  
  /** Accessible label describing or summarizing the list. */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /** Accessible label for the grid within the list. */
  var ariaLabelForGrid: js.UndefOr[String] = js.native
  
  /** Accessible label for the list header. */
  var ariaLabelForListHeader: js.UndefOr[String] = js.native
  
  /** Accessible label for the select all checkbox. */
  var ariaLabelForSelectAllCheckbox: js.UndefOr[String] = js.native
  
  /** Accessible label for the name of the selection column. */
  var ariaLabelForSelectionColumn: js.UndefOr[String] = js.native
  
  /**
    * Props impacting the render style of cells. Since these have an impact on calculated column widths, they are
    * handled separately from normal theme styling, but they are passed to the styling system.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /** Accessible label for the check button. */
  var checkButtonAriaLabel: js.UndefOr[String] = js.native
  
  /** Class name to add to the cell of a checkbox. */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  
  /**
    * Controls the visibility of selection check box.
    * @defaultvalue CheckboxVisibility.onHover
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  
  /** Class name to add to the root element. */
  var className: js.UndefOr[String] = js.native
  
  /** Options for column reordering using drag and drop. */
  var columnReorderOptions: js.UndefOr[IColumnReorderOptions] = js.native
  
  /** column defitions. If none are provided, default columns will be created based on the items' properties. */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  
  /**
    * Whether to render in compact mode.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Controls how the list contrains overflow. */
  var constrainMode: js.UndefOr[ConstrainMode] = js.native
  
  /** Whether to disable the built-in SelectionZone, so the host component can provide its own. */
  var disableSelectionZone: js.UndefOr[Boolean] = js.native
  
  /** Map of callback functions related to row drag and drop functionality. */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  
  /** Whether the selection zone should enter modal state on touch. */
  var enterModalSelectionOnTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, will be the "default" item column cell value return.
    * A column's `getValueKey` can override `getCellValueKey`.
    */
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  
  /** Callback to override default group height calculation used by list virtualization. */
  var getGroupHeight: js.UndefOr[js.Function2[/* group */ IGroup, /* groupIndex */ Double, Double]] = js.native
  
  /**
    * Callback to get the item key, to be used in the selection and on render.
    * Must be provided if sorting or filtering is enabled.
    */
  var getKey: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]] = js.native
  
  /** Callback to get the aria-describedby IDs (space-separated strings) of elements that describe the item. */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  
  /** Callback to get the aria-label string for a given item. */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  
  /** Override properties to render groups. */
  var groupProps: js.UndefOr[IDetailsGroupRenderProps] = js.native
  
  /** Grouping instructions. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  
  /** Override for the indent width used for group nesting. */
  var indentWidth: js.UndefOr[Double] = js.native
  
  /** Default index to set focus to once the items have rendered and the index exists. */
  var initialFocusedIndex: js.UndefOr[Double] = js.native
  
  /**
    * Controls the visibility of the header.
    * @defaultvalue true
    */
  var isHeaderVisible: js.UndefOr[Boolean] = js.native
  
  /** Set this to true to indicate that the items being displayed are placeholder data. */
  var isPlaceholderData: js.UndefOr[Boolean] = js.native
  
  /** The items to render. */
  var items: js.Array[_] = js.native
  
  /** Controls how the columns are adjusted. */
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.native
  
  /** Properties to pass through to the List components being rendered. */
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
  
  /** Callback for when the list has been updated. Useful for telemetry tracking externally. */
  var onDidUpdate: js.UndefOr[js.Function1[/* detailsList */ js.UndefOr[DetailsListBase], Unit]] = js.native
  
  /**
    * Callback for when the context menu of an item has been accessed.
    * If undefined or false is returned, `ev.preventDefault()` will be called.
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
  
  /**  If provided, can be used to render a custom checkbox. */
  var onRenderCheckbox: js.UndefOr[IRenderFunction[IDetailsListCheckboxProps]] = js.native
  
  /** An override to render the details footer. */
  var onRenderDetailsFooter: js.UndefOr[IRenderFunction[IDetailsFooterProps]] = js.native
  
  /** An override to render the details header. */
  var onRenderDetailsHeader: js.UndefOr[IRenderFunction[IDetailsHeaderProps]] = js.native
  
  /**
    * If provided, will be the "default" item column renderer method.
    * This affects cells within the rows, not the rows themselves.
    * If a column definition provides its own `onRender` method, that will be used instead of this.
    */
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactElement
    ]
  ] = js.native
  
  /** Callback for what to render when the item is missing. */
  var onRenderMissingItem: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[Double], 
      /* rowProps */ js.UndefOr[IDetailsRowProps], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Callback to override the default row rendering.
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
    * Callback to determine whether the list should be rendered in full, or virtualized.
    *
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance
    * for smaller lists.
    *
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[_], Boolean]] = js.native
  
  /** Event names and corresponding callbacks that will be registered to rendered row elements. */
  var rowElementEventMap: js.UndefOr[js.Array[Callback]] = js.native
  
  /** Selection model to track selection state.  */
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
    * Additional props to pass through to the SelectionZone created by default.
    */
  var selectionZoneProps: js.UndefOr[ISelectionZoneProps] = js.native
  
  /** A key that uniquely identifies the given items. If provided, the selection will be reset when the key changes. */
  var setKey: js.UndefOr[String] = js.native
  
  /**
    * Whether the role `application` should be applied to the list.
    * @defaultvalue false
    */
  var shouldApplyApplicationRole: js.UndefOr[Boolean] = js.native
  
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]] = js.native
  
  /** Theme provided by a higher-order component. */
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
    * Whether to re-render a row only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.native
  
  /** Viewport info, provided by the `withViewport` decorator. */
  var viewport: js.UndefOr[IViewport] = js.native
}
object IDetailsListProps {
  
  @scala.inline
  def apply(items: js.Array[_]): IDetailsListProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListProps]
  }
  
  @scala.inline
  implicit class IDetailsListPropsMutableBuilder[Self <: IDetailsListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelForGrid(value: String): Self = StObject.set(x, "ariaLabelForGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelForGridUndefined: Self = StObject.set(x, "ariaLabelForGrid", js.undefined)
    
    @scala.inline
    def setAriaLabelForListHeader(value: String): Self = StObject.set(x, "ariaLabelForListHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelForListHeaderUndefined: Self = StObject.set(x, "ariaLabelForListHeader", js.undefined)
    
    @scala.inline
    def setAriaLabelForSelectAllCheckbox(value: String): Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelForSelectAllCheckboxUndefined: Self = StObject.set(x, "ariaLabelForSelectAllCheckbox", js.undefined)
    
    @scala.inline
    def setAriaLabelForSelectionColumn(value: String): Self = StObject.set(x, "ariaLabelForSelectionColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelForSelectionColumnUndefined: Self = StObject.set(x, "ariaLabelForSelectionColumn", js.undefined)
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    @scala.inline
    def setCheckButtonAriaLabel(value: String): Self = StObject.set(x, "checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckButtonAriaLabelUndefined: Self = StObject.set(x, "checkButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setCheckboxCellClassName(value: String): Self = StObject.set(x, "checkboxCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxCellClassNameUndefined: Self = StObject.set(x, "checkboxCellClassName", js.undefined)
    
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnReorderOptions(value: IColumnReorderOptions): Self = StObject.set(x, "columnReorderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnReorderOptionsUndefined: Self = StObject.set(x, "columnReorderOptions", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setConstrainMode(value: ConstrainMode): Self = StObject.set(x, "constrainMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainModeUndefined: Self = StObject.set(x, "constrainMode", js.undefined)
    
    @scala.inline
    def setDisableSelectionZone(value: Boolean): Self = StObject.set(x, "disableSelectionZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSelectionZoneUndefined: Self = StObject.set(x, "disableSelectionZone", js.undefined)
    
    @scala.inline
    def setDragDropEvents(value: IDragDropEvents): Self = StObject.set(x, "dragDropEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDropEventsUndefined: Self = StObject.set(x, "dragDropEvents", js.undefined)
    
    @scala.inline
    def setEnableUpdateAnimations(value: Boolean): Self = StObject.set(x, "enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUpdateAnimationsUndefined: Self = StObject.set(x, "enableUpdateAnimations", js.undefined)
    
    @scala.inline
    def setEnterModalSelectionOnTouch(value: Boolean): Self = StObject.set(x, "enterModalSelectionOnTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterModalSelectionOnTouchUndefined: Self = StObject.set(x, "enterModalSelectionOnTouch", js.undefined)
    
    @scala.inline
    def setGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = StObject.set(x, "getCellValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCellValueKeyUndefined: Self = StObject.set(x, "getCellValueKey", js.undefined)
    
    @scala.inline
    def setGetGroupHeight(value: (/* group */ IGroup, /* groupIndex */ Double) => Double): Self = StObject.set(x, "getGroupHeight", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetGroupHeightUndefined: Self = StObject.set(x, "getGroupHeight", js.undefined)
    
    @scala.inline
    def setGetKey(value: (/* item */ js.Any, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = StObject.set(x, "getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowAriaDescribedByUndefined: Self = StObject.set(x, "getRowAriaDescribedBy", js.undefined)
    
    @scala.inline
    def setGetRowAriaLabel(value: /* item */ js.Any => String): Self = StObject.set(x, "getRowAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowAriaLabelUndefined: Self = StObject.set(x, "getRowAriaLabel", js.undefined)
    
    @scala.inline
    def setGroupProps(value: IDetailsGroupRenderProps): Self = StObject.set(x, "groupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPropsUndefined: Self = StObject.set(x, "groupProps", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: IGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
    
    @scala.inline
    def setInitialFocusedIndex(value: Double): Self = StObject.set(x, "initialFocusedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFocusedIndexUndefined: Self = StObject.set(x, "initialFocusedIndex", js.undefined)
    
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderVisibleUndefined: Self = StObject.set(x, "isHeaderVisible", js.undefined)
    
    @scala.inline
    def setIsPlaceholderData(value: Boolean): Self = StObject.set(x, "isPlaceholderData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPlaceholderDataUndefined: Self = StObject.set(x, "isPlaceholderData", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLayoutMode(value: DetailsListLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
    
    @scala.inline
    def setListProps(value: IListProps[_]): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
    
    @scala.inline
    def setMinimumPixelsForDrag(value: Double): Self = StObject.set(x, "minimumPixelsForDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPixelsForDragUndefined: Self = StObject.set(x, "minimumPixelsForDrag", js.undefined)
    
    @scala.inline
    def setOnActiveItemChanged(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]]) => Unit
    ): Self = StObject.set(x, "onActiveItemChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnActiveItemChangedUndefined: Self = StObject.set(x, "onActiveItemChanged", js.undefined)
    
    @scala.inline
    def setOnColumnHeaderClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* column */ js.UndefOr[IColumn]) => Unit
    ): Self = StObject.set(x, "onColumnHeaderClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnHeaderClickUndefined: Self = StObject.set(x, "onColumnHeaderClick", js.undefined)
    
    @scala.inline
    def setOnColumnHeaderContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): Self = StObject.set(x, "onColumnHeaderContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnHeaderContextMenuUndefined: Self = StObject.set(x, "onColumnHeaderContextMenu", js.undefined)
    
    @scala.inline
    def setOnColumnResize(
      value: (/* column */ js.UndefOr[IColumn], /* newWidth */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
    
    @scala.inline
    def setOnDidUpdate(value: /* detailsList */ js.UndefOr[DetailsListBase] => Unit): Self = StObject.set(x, "onDidUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidUpdateUndefined: Self = StObject.set(x, "onDidUpdate", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemInvoked(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): Self = StObject.set(x, "onItemInvoked", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemInvokedUndefined: Self = StObject.set(x, "onItemInvoked", js.undefined)
    
    @scala.inline
    def setOnRenderCheckbox(
      value: (/* props */ js.UndefOr[IDetailsListCheckboxProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsListCheckboxProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderCheckbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderCheckboxUndefined: Self = StObject.set(x, "onRenderCheckbox", js.undefined)
    
    @scala.inline
    def setOnRenderDetailsFooter(
      value: (/* props */ js.UndefOr[IDetailsFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsFooterProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderDetailsFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderDetailsFooterUndefined: Self = StObject.set(x, "onRenderDetailsFooter", js.undefined)
    
    @scala.inline
    def setOnRenderDetailsHeader(
      value: (/* props */ js.UndefOr[IDetailsHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderDetailsHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderDetailsHeaderUndefined: Self = StObject.set(x, "onRenderDetailsHeader", js.undefined)
    
    @scala.inline
    def setOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactElement
    ): Self = StObject.set(x, "onRenderItemColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRenderItemColumnUndefined: Self = StObject.set(x, "onRenderItemColumn", js.undefined)
    
    @scala.inline
    def setOnRenderMissingItem(
      value: (/* index */ js.UndefOr[Double], /* rowProps */ js.UndefOr[IDetailsRowProps]) => ReactElement
    ): Self = StObject.set(x, "onRenderMissingItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderMissingItemUndefined: Self = StObject.set(x, "onRenderMissingItem", js.undefined)
    
    @scala.inline
    def setOnRenderRow(
      value: (/* props */ js.UndefOr[IDetailsRowProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsRowProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderRowUndefined: Self = StObject.set(x, "onRenderRow", js.undefined)
    
    @scala.inline
    def setOnRowDidMount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onRowDidMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowDidMountUndefined: Self = StObject.set(x, "onRowDidMount", js.undefined)
    
    @scala.inline
    def setOnRowWillUnmount(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onRowWillUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowWillUnmountUndefined: Self = StObject.set(x, "onRowWillUnmount", js.undefined)
    
    @scala.inline
    def setOnShouldVirtualize(value: /* props */ IListProps[_] => Boolean): Self = StObject.set(x, "onShouldVirtualize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShouldVirtualizeUndefined: Self = StObject.set(x, "onShouldVirtualize", js.undefined)
    
    @scala.inline
    def setRowElementEventMap(value: js.Array[Callback]): Self = StObject.set(x, "rowElementEventMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowElementEventMapUndefined: Self = StObject.set(x, "rowElementEventMap", js.undefined)
    
    @scala.inline
    def setRowElementEventMapVarargs(value: Callback*): Self = StObject.set(x, "rowElementEventMap", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionPreservedOnEmptyClick(value: Boolean): Self = StObject.set(x, "selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionPreservedOnEmptyClickUndefined: Self = StObject.set(x, "selectionPreservedOnEmptyClick", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionZoneProps(value: ISelectionZoneProps): Self = StObject.set(x, "selectionZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionZonePropsUndefined: Self = StObject.set(x, "selectionZoneProps", js.undefined)
    
    @scala.inline
    def setSetKey(value: String): Self = StObject.set(x, "setKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetKeyUndefined: Self = StObject.set(x, "setKey", js.undefined)
    
    @scala.inline
    def setShouldApplyApplicationRole(value: Boolean): Self = StObject.set(x, "shouldApplyApplicationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldApplyApplicationRoleUndefined: Self = StObject.set(x, "shouldApplyApplicationRole", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    
    @scala.inline
    def setUsePageCache(value: Boolean): Self = StObject.set(x, "usePageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePageCacheUndefined: Self = StObject.set(x, "usePageCache", js.undefined)
    
    @scala.inline
    def setUseReducedRowRenderer(value: Boolean): Self = StObject.set(x, "useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseReducedRowRendererUndefined: Self = StObject.set(x, "useReducedRowRenderer", js.undefined)
    
    @scala.inline
    def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
