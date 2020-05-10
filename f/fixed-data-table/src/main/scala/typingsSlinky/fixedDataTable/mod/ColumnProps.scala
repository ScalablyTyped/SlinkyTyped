package typingsSlinky.fixedDataTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component that defines the attributes of table column.
  */
@js.native
trait ColumnProps extends Props[Column] {
  /**
    * The horizontal alignment of the table cell content.
    *
    * 'left'|'center'|'right'
    */
  var align: js.UndefOr[String] = js.native
  /**
    * Whether cells in this column can be removed from document
    * when outside of viewport as a result of horizontal
    * scrolling. Setting this property to true allows the table
    * to not render cells in particular column that are outside
    * of viewport for visible rows. This allows to create table
    * with many columns and not have vertical scrolling
    * performance drop. Setting the property to false will keep
    * previous behaviour and keep cell rendered if the row it
    * belongs to is visible.
    *
    * defaultValue: false
    */
  var allowCellsRecycling: js.UndefOr[Boolean] = js.native
  /**
    * This is the body cell that will be cloned for this
    * column. This can either be a string a React element,
    * or a function that generates a React Element. Passing
    * in a string will render a default cell with that
    * string. By default, the React element passed in can
    * expect to receive the following props:
    *
    * props: {
    *   rowIndex; number // (the row index of the cell)
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    *
    * Because you are passing in your own React element, you
    * can feel free to pass in whatever props you may want or
    * need.
    *
    * If you pass in a function, you will receive the same
    * props object as the first argument.
    */
  var cell: js.UndefOr[
    String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
  ] = js.native
  /**
    * This is used to uniquely identify the column, and is not
    * required unless you a resizing columns. This will be the
    * key given in the onColumnResizeEndCallback on the Table.
    */
  var columnKey: js.UndefOr[String | Double] = js.native
  /**
    * Controls if the column is fixed when scrolling in the X
    * axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * The grow factor relative to other columns. Same as the
    * flex-grow API from http://www.w3.org/TR/css3-flexbox/.
    * Basically, take any available extra width and distribute
    * it proportionally according to all columns' flexGrow
    * values. Defaults to zero (no-flexing).
    */
  var flexGrow: js.UndefOr[Double] = js.native
  /**
    * The footer cell for this column. This can either be a
    * string. a React element, or a function that generates a
    * React Element. Passing in a string will render a default
    * header cell with that string. By default, the React
    * element passed in can expect to receive the following
    * props:
    *
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    *
    * Because you are passing in your own React element, you
    * can feel free to pass in whatever props you may want or
    * need.
    *
    * If you pass in a function, you will receive the same
    * props object as the first argument.
    */
  var footer: js.UndefOr[
    String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
  ] = js.native
  /**
    * The header cell for this column. This can either be a
    * string. a React element, or a function that generates a
    * React Element. Passing in a string will render a default
    * header cell with that string. By default, the React
    * element passed in can expect to receive the following
    * props:
    *
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    *
    * Because you are passing in your own React element, you
    * can feel free to pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the first argument.
    */
  var header: js.UndefOr[
    String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])
  ] = js.native
  /**
    * Whether the column can be resized with the
    * FixedDataTableColumnResizeHandle. Please note that if a
    * column has a flex grow, once you resize the column this
    * will be set to 0.
    *
    * This property only provides the UI for the column
    * resizing. If this is set to true, you will need to set the
    * onColumnResizeEndCallback table property and render your
    * columns appropriately.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  /**
    * If this is a resizable column this is its maximum pixel
    * width.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * If this is a resizable column this is its minimum pixel
    * width.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /**
    * The pixel width of the column.
    */
  var width: Double = js.native
}

object ColumnProps {
  @scala.inline
  def apply(width: Double): ColumnProps = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  @scala.inline
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCellsRecycling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellsRecycling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellsRecycling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellsRecycling")(js.undefined)
        ret
    }
    @scala.inline
    def withCellReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellFunction1(value: /* props */ CellProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCell(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterFunction1(value: /* props */ CellProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFooter(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFunction1(value: /* props */ CellProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeader(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
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
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
  }
  
}

