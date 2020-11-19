package typingsSlinky.fixedDataTable2.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.center
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.left
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.right
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps extends ClassAttributes[Column] {
  
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[left | center | right] = js.native
  
  /**
    * Whether cells in this column can be removed from document when outside
    * of viewport as a result of horizontal scrolling.
    * Setting this property to true allows the table to not render cells in
    * particular column that are outside of viewport for visible rows. This
    * allows to create table with many columns and not have vertical scrolling
    * performance drop.
    * Setting the property to false will keep previous behaviour and keep
    * cell rendered if the row it belongs to is visible.
    *
    * defaultValue: false
    */
  var allowCellsRecycling: js.UndefOr[Boolean] = js.native
  
  /**
    * This is the body cell that will be cloned for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   rowIndex; number // (the row index of the cell)
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var cell: js.UndefOr[ElementOrFunc[ColumnCellProps]] = js.native
  
  /**
    * This is used to uniquely identify the column, and is not required unless
    * you a resizing columns. This will be the key given in the
    * `onColumnResizeEndCallback` on the Table.
    */
  var columnKey: js.UndefOr[String | Double] = js.native
  
  /**
    * Controls if the column is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls if the column is fixed to the right side of the table
    * when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixedRight: js.UndefOr[Boolean] = js.native
  
  /**
    * The grow factor relative to other columns. Same as the flex-grow API
    * from http://www.w3.org/TR/css3-flexbox/. Basically, take any available
    * extra width and distribute it proportionally according to all columns'
    * flexGrow values. Defaults to zero (no-flexing).
    */
  var flexGrow: js.UndefOr[Double] = js.native
  
  /**
    * This is the footer cell for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var footer: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.native
  
  /**
    * The header cell for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var header: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.native
  
  /**
    * Whether the column can be dragged to reorder.
    */
  var isReorderable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the column can be resized with the
    * FixedDataTableColumnResizeHandle. Please note that if a column
    * has a flex grow, once you resize the column this will be set to 0.
    *
    * This property only provides the UI for the column resizing. If this
    * is set to true, you will need to set the onColumnResizeEndCallback table
    * property and render your columns appropriately.
    */
  var isResizable: js.UndefOr[Boolean] = js.native
  
  /**
    * If this is a resizable column this is its maximum pixel width.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * If this is a resizable column this is its minimum pixel width.
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Flag to enable performance check when rendering. Stops the component from
    * rendering if none of it's passed in props have changed
    */
  var pureRendering: js.UndefOr[Boolean] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAllowCellsRecycling(value: Boolean): Self = this.set("allowCellsRecycling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCellsRecycling: Self = this.set("allowCellsRecycling", js.undefined)
    
    @scala.inline
    def setCellReactElement(value: ReactElement): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFunction1(value: ColumnCellProps => String | ReactElement): Self = this.set("cell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCell(value: ElementOrFunc[ColumnCellProps]): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String | Double): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setFixedRight(value: Boolean): Self = this.set("fixedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedRight: Self = this.set("fixedRight", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction1(value: ColumnHeaderProps => String | ReactElement): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFooter(value: ElementOrFunc[ColumnHeaderProps]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunction1(value: ColumnHeaderProps => String | ReactElement): Self = this.set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeader(value: ElementOrFunc[ColumnHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIsReorderable(value: Boolean): Self = this.set("isReorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReorderable: Self = this.set("isReorderable", js.undefined)
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResizable: Self = this.set("isResizable", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPureRendering(value: Boolean): Self = this.set("pureRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePureRendering: Self = this.set("pureRendering", js.undefined)
  }
}
