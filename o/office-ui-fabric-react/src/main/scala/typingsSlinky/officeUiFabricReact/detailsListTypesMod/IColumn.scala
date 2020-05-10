package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends js.Object {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the arai-label attribute will contain the column name
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Internal only value.
    */
  var calculatedWidth: js.UndefOr[Double] = js.native
  /**
    * An optional class name to stick on the column cell within each row.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Defines how the column's header should render.
    * @defaultvalue ColumnActionsMode.clickable
    */
  var columnActionsMode: js.UndefOr[ColumnActionsMode] = js.native
  /**
    * Internal only value.
    * Remembers the actual witdh of the column on any case.
    * On the other hand, calculatedWidth is only saved when it's defined by user, not for justified calculations.
    */
  var currentWidth: js.UndefOr[Double] = js.native
  /**
    * Arbitrary data passthrough which can be used by the caller.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The field to pull the text value from for the column. This can be null if a custom
    * onRender method is provided.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * ARIA label for the status of this column when filtered.
    */
  var filterAriaLabel: js.UndefOr[String] = js.native
  /**
    * If set, parent getCellValueKey will return this value.
    */
  var getValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  /**
    * ARIA label for the status of this column when grouped.
    */
  var groupAriaLabel: js.UndefOr[String] = js.native
  /**
    * An optional class name to stick on the column cell within each header.
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * Class name to add to the Icon component.
    */
  var iconClassName: js.UndefOr[String] = js.native
  /**
    * Optional iconName to use for the column header.
    */
  var iconName: js.UndefOr[String] = js.native
  /**
    * If specified will allow the column to be collapsed when rendered in justified layout.
    * @deprecated Use `isCollapsible`
    */
  var isCollapsable: js.UndefOr[Boolean] = js.native
  /**
    * If specified will allow the column to be collapsed when rendered in justified layout.
    */
  var isCollapsible: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the column is filtered, and if so shows a filter icon.
    */
  var isFiltered: js.UndefOr[Boolean] = js.native
  /**
    * If set will show a grouped icon next to the column header name.
    */
  var isGrouped: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not only the icon is used in the column header.
    * Set this to true so the column name and dropdown chevron are not displayed.
    */
  var isIconOnly: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a dropdown menu is open so that the appropriate ARIA attributes are rendered.
    */
  var isMenuOpen: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the column can render multi-line text.
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * If set, will add additional LTR padding-right to column and cells.
    */
  var isPadded: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the column can be resized.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  /**
    * Optional flag on whether the column is a header for the given row. There should be only one column with
    * row header set to true.
    * @defaultvalue false
    */
  var isRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the column is currently sorted. Renders a sort arrow in the column header.
    */
  var isSorted: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the arrow is pointed down (descending) or up.
    */
  var isSortedDescending: js.UndefOr[Boolean] = js.native
  /**
    * A unique key for identifying the column.
    */
  var key: String = js.native
  /**
    * Maximum width for the column, if stretching is allowed in justified scenarios.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Minimum width for the column.
    */
  var minWidth: Double = js.native
  /**
    * Name to render on the column header.
    */
  var name: String = js.native
  /**
    * If provided, will be executed when the user clicks on the column header.
    */
  var onColumnClick: js.UndefOr[
    js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
  ] = js.native
  /**
    * If provided, will be executed when the user accesses the contextmenu on a column header.
    */
  var onColumnContextMenu: js.UndefOr[
    js.Function2[
      /* column */ js.UndefOr[IColumn], 
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, will be executed when the column is resized with the column's current width.
    * Prefer this callback over `DetailsList` `onColumnResize` if you require the `IColumn` to
    * report its width after every resize event. Consider debouncing the callback if resize events
    * occur frequently.
    */
  var onColumnResize: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
  /**
    * If provided uses this method to render custom cell content, rather than the default text rendering.
    */
  var onRender: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      _
    ]
  ] = js.native
  /**
    * If provider, can be used to render a custom column header divider
    */
  var onRenderDivider: js.UndefOr[IRenderFunction[IDetailsColumnProps]] = js.native
  /**
    * ARIA label for the sort order of this column when sorted ascending.
    */
  var sortAscendingAriaLabel: js.UndefOr[String] = js.native
  /**
    * ARIA label for the sort order of this column when sorted descending.
    */
  var sortDescendingAriaLabel: js.UndefOr[String] = js.native
  /**
    * Style function to be passed in to override the themed or default styles
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]] = js.native
}

object IColumn {
  @scala.inline
  def apply(key: String, minWidth: Double, name: String): IColumn = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withCalculatedWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculatedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculatedWidth")(js.undefined)
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
    def withColumnActionsMode(value: ColumnActionsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnActionsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnActionsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnActionsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollapsable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIconOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIconOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIconOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMenuOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenuOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPadded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPadded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortedDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortedDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortedDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortedDescending")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
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
    def withOnColumnContextMenu(
      value: (/* column */ js.UndefOr[IColumn], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): Self = {
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
    def withOnColumnResize(value: /* width */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDivider(
      value: (/* props */ js.UndefOr[IDetailsColumnProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsColumnProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDivider")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAscendingAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscendingAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscendingAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscendingAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDescendingAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescendingAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDescendingAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDescendingAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDetailsColumnStyleProps => Partial[IDetailsColumnStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles]): Self = {
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
  }
  
}

