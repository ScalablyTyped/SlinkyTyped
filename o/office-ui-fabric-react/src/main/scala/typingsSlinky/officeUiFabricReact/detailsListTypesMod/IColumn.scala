package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumn extends StObject {
  
  /**
    * Accessible label for the column. The column name will still be used as the primary label,
    * but this text (if specified) will be read after the column name.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /** Internal only value. */
  var calculatedWidth: js.UndefOr[Double] = js.native
  
  /** Class name to apply to the column cell within each row. */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Defines how the column's header should render.
    * @defaultvalue ColumnActionsMode.clickable
    */
  var columnActionsMode: js.UndefOr[ColumnActionsMode] = js.native
  
  /**
    * Internal only value.
    * Remembers the actual width of the column in any case.
    * `calculatedWidth` is only saved when it's defined by user, not for justified calculations.
    */
  var currentWidth: js.UndefOr[Double] = js.native
  
  /** Arbitrary data passthrough which can be used by the caller. */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * The field to pull the text value from for the column.
    * Can be unset if a custom `onRender` method is provided.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /** Accessible label for the status of this column when filtered. */
  var filterAriaLabel: js.UndefOr[String] = js.native
  
  /** Custom override for the parent list's `getCellValueKey`. */
  var getValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      String
    ]
  ] = js.native
  
  /** Accessible label for the status of this column when grouped. */
  var groupAriaLabel: js.UndefOr[String] = js.native
  
  /** Class name to apply to the column header cell. */
  var headerClassName: js.UndefOr[String] = js.native
  
  /** Class name for the icon within the header. */
  var iconClassName: js.UndefOr[String] = js.native
  
  /** Custom icon to use in the column header. */
  var iconName: js.UndefOr[String] = js.native
  
  /**
    * If true, allow the column to be collapsed when rendered in justified layout.
    * @deprecated Use `isCollapsible`
    */
  var isCollapsable: js.UndefOr[Boolean] = js.native
  
  /** If true, allow the column to be collapsed when rendered in justified layout. */
  var isCollapsible: js.UndefOr[Boolean] = js.native
  
  /** Whether the list is filtered by this column. If true, shows a filter icon next to this column's name. */
  var isFiltered: js.UndefOr[Boolean] = js.native
  
  /** Whether the list is grouped by this column. If true, shows a grouped icon next to this column's name. */
  var isGrouped: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether only the icon should be displayed in the column header.
    * If true, the column name and dropdown chevron will not be displayed.
    */
  var isIconOnly: js.UndefOr[Boolean] = js.native
  
  /** Whether a dropdown menu is open so that the appropriate ARIA attributes are rendered. */
  var isMenuOpen: js.UndefOr[Boolean] = js.native
  
  /** Determines if the column can render multi-line text. */
  var isMultiline: js.UndefOr[Boolean] = js.native
  
  /** If true, add additional LTR padding-right to column and cells. */
  var isPadded: js.UndefOr[Boolean] = js.native
  
  /** Determines if the column can be resized. */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /** Whether the column is a header for the given row. There should be only one column with this set to true. */
  var isRowHeader: js.UndefOr[Boolean] = js.native
  
  /** Determines if the column is currently sorted. Renders a sort arrow in the column header. */
  var isSorted: js.UndefOr[Boolean] = js.native
  
  /** Determines if the sort arrow is pointed down (descending) or up. */
  var isSortedDescending: js.UndefOr[Boolean] = js.native
  
  /** A unique key for identifying the column. */
  var key: String = js.native
  
  /** Maximum width for the column, if stretching is allowed in justified scenarios. */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** Minimum width for the column. */
  var minWidth: Double = js.native
  
  /** Name to render on the column header. */
  var name: String = js.native
  
  /** Callback for when the user clicks on the column header. */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ this.type, Unit]
  ] = js.native
  
  /** Callback for when the user opens the column header context menu. */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[this.type], 
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback for when the column is resized (`width` is the current width).
    *
    * Prefer this over `DetailsList`'s `onColumnResize` if you require the `IColumn` to report its width
    * after every resize event. Consider debouncing the callback if resize events occur frequently.
    */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
  
  /** Custom renderer for cell content, instead of the default text rendering. */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[this.type], 
      _
    ]
  ] = js.native
  
  /** Custom renderer for column header divider. */
  var onRenderDivider: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.native
  
  /**
    * Accessible label for indicating that the list is sorted by this column in ascending order.
    * This will be read after the main column header label.
    */
  var sortAscendingAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Accessible label for indicating that the list is sorted by this column in descending order.
    * This will be read after the main column header label.
    */
  var sortDescendingAriaLabel: js.UndefOr[String] = js.native
  
  /** Custom overrides to the themed or default styles. */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
}
object IColumn {
  
  @scala.inline
  def apply(key: String, minWidth: Double, name: String): IColumn = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setCalculatedWidth(value: Double): Self = StObject.set(x, "calculatedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedWidthUndefined: Self = StObject.set(x, "calculatedWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColumnActionsMode(value: ColumnActionsMode): Self = StObject.set(x, "columnActionsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnActionsModeUndefined: Self = StObject.set(x, "columnActionsMode", js.undefined)
    
    @scala.inline
    def setCurrentWidth(value: Double): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidthUndefined: Self = StObject.set(x, "currentWidth", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setFilterAriaLabel(value: String): Self = StObject.set(x, "filterAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterAriaLabelUndefined: Self = StObject.set(x, "filterAriaLabel", js.undefined)
    
    @scala.inline
    def setGetValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = StObject.set(x, "getValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetValueKeyUndefined: Self = StObject.set(x, "getValueKey", js.undefined)
    
    @scala.inline
    def setGroupAriaLabel(value: String): Self = StObject.set(x, "groupAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupAriaLabelUndefined: Self = StObject.set(x, "groupAriaLabel", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    @scala.inline
    def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    @scala.inline
    def setIsCollapsable(value: Boolean): Self = StObject.set(x, "isCollapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollapsableUndefined: Self = StObject.set(x, "isCollapsable", js.undefined)
    
    @scala.inline
    def setIsCollapsible(value: Boolean): Self = StObject.set(x, "isCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollapsibleUndefined: Self = StObject.set(x, "isCollapsible", js.undefined)
    
    @scala.inline
    def setIsFiltered(value: Boolean): Self = StObject.set(x, "isFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFilteredUndefined: Self = StObject.set(x, "isFiltered", js.undefined)
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupedUndefined: Self = StObject.set(x, "isGrouped", js.undefined)
    
    @scala.inline
    def setIsIconOnly(value: Boolean): Self = StObject.set(x, "isIconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIconOnlyUndefined: Self = StObject.set(x, "isIconOnly", js.undefined)
    
    @scala.inline
    def setIsMenuOpen(value: Boolean): Self = StObject.set(x, "isMenuOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMenuOpenUndefined: Self = StObject.set(x, "isMenuOpen", js.undefined)
    
    @scala.inline
    def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
    
    @scala.inline
    def setIsPadded(value: Boolean): Self = StObject.set(x, "isPadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaddedUndefined: Self = StObject.set(x, "isPadded", js.undefined)
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizableUndefined: Self = StObject.set(x, "isResizable", js.undefined)
    
    @scala.inline
    def setIsRowHeader(value: Boolean): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowHeaderUndefined: Self = StObject.set(x, "isRowHeader", js.undefined)
    
    @scala.inline
    def setIsSorted(value: Boolean): Self = StObject.set(x, "isSorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortedDescending(value: Boolean): Self = StObject.set(x, "isSortedDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortedDescendingUndefined: Self = StObject.set(x, "isSortedDescending", js.undefined)
    
    @scala.inline
    def setIsSortedUndefined: Self = StObject.set(x, "isSorted", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColumnClick(value: (/* ev */ SyntheticMouseEvent[HTMLElement], IColumn) => Unit): Self = StObject.set(x, "onColumnClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnClickUndefined: Self = StObject.set(x, "onColumnClick", js.undefined)
    
    @scala.inline
    def setOnColumnContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): Self = StObject.set(x, "onColumnContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnContextMenuUndefined: Self = StObject.set(x, "onColumnContextMenu", js.undefined)
    
    @scala.inline
    def setOnColumnResize(value: /* width */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnColumnResizeUndefined: Self = StObject.set(x, "onColumnResize", js.undefined)
    
    @scala.inline
    def setOnRender(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => _
    ): Self = StObject.set(x, "onRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRenderDivider(
      value: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderDivider", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderDividerUndefined: Self = StObject.set(x, "onRenderDivider", js.undefined)
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setSortAscendingAriaLabel(value: String): Self = StObject.set(x, "sortAscendingAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscendingAriaLabelUndefined: Self = StObject.set(x, "sortAscendingAriaLabel", js.undefined)
    
    @scala.inline
    def setSortDescendingAriaLabel(value: String): Self = StObject.set(x, "sortDescendingAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDescendingAriaLabelUndefined: Self = StObject.set(x, "sortDescendingAriaLabel", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IDetailsColumnStyleProps => DeepPartial[IDetailsColumnStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
