package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Key
import typingsSlinky.reactWindow.anon.ColumnIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends CommonProps {
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ReactComponentClass[GridChildComponentProps] = js.native
  /**
    * Number of columns in the grid. Note that only a few columns will be rendered and displayed at a time.
    */
  var columnCount: Double = js.native
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the grid component.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection] = js.native
  /**
    * Height of the grid. This affects the number of rows that will be rendered (and displayed) at any given time.
    */
  var height: Double = js.native
  /**
    * Horizontal scroll offset for initial render.
    */
  var initialScrollLeft: js.UndefOr[Double] = js.native
  /**
    * Vertical scroll offset for initial render.
    */
  var initialScrollTop: js.UndefOr[Double] = js.native
  /**
    * By default, grids will use an item's indices as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your grid does not satisfy the above constraints, use the itemKey property to specify your own keys for items.
    */
  var itemKey: js.UndefOr[GridItemKeySelector] = js.native
  /**
    * Called when the items rendered by the grid change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ GridOnItemsRenderedProps, _]] = js.native
  /**
    * Called when the grid scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ GridOnScrollProps, _]] = js.native
  /**
    * The number of columns to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.native
  /**
    * @deprecated since version 1.8.2, please use overscanColumnCount
    */
  var overscanColumnsCount: js.UndefOr[Double] = js.native
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    *
    * @deprecated since version 1.4.0
    */
  var overscanCount: js.UndefOr[Double] = js.native
  /**
    * The number of rows to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanRowCount: js.UndefOr[Double] = js.native
  /**
    * @deprecated since version 1.8.2, please use overscanRowCount
    */
  var overscanRowsCount: js.UndefOr[Double] = js.native
  /**
    * Number of rows in the grid. Note that only a few rows will be rendered and displayed at a time.
    */
  var rowCount: Double = js.native
  /**
    * Width of the grid. This affects the number of columns that will be rendered (and displayed) at any given time.
    */
  var width: Double = js.native
}

object GridProps {
  @scala.inline
  def apply(
    children: ReactComponentClass[GridChildComponentProps],
    columnCount: Double,
    height: Double,
    rowCount: Double,
    width: Double
  ): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReactComponentClass[GridChildComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: CSSDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemKey(value: /* params */ ColumnIndex => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemsRendered(value: /* props */ GridOnItemsRenderedProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* props */ GridOnScrollProps => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanColumnsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanColumnsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanRowsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanRowsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowsCount")(js.undefined)
        ret
    }
  }
  
}

