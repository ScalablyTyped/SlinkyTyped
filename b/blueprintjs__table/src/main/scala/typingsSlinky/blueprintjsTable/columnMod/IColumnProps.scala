package typingsSlinky.blueprintjsTable.columnMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.cellMod.ICellRenderer
import typingsSlinky.blueprintjsTable.columnHeaderCellMod.IColumnNameProps
import typingsSlinky.blueprintjsTable.columnHeaderMod.IColumnHeaderRenderer
import typingsSlinky.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnProps
  extends IColumnNameProps
     with IProps {
  /**
    * An instance of `ICellRenderer`, a function that takes a row and column
    * index, and returns a `Cell` React element.
    */
  var cellRenderer: js.UndefOr[ICellRenderer] = js.native
  /**
    * An instance of `IColumnHeaderRenderer`, a function that takes a column
    * index and returns a `ColumnHeaderCell` React element.
    */
  var columnHeaderCellRenderer: js.UndefOr[IColumnHeaderRenderer] = js.native
  /**
    * A unique ID, similar to React's `key`. This is used, for example, to
    * maintain the width of a column between re-ordering and rendering. If no
    * IDs are provided, widths will be persisted across renders using a
    * column's index only. Columns widths can also be persisted outside the
    * `Table` component, then passed in with the `columnWidths` prop.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * Set this prop to specify whether to render the loading state of the
    * column header and cells in this column. Column-level `loadingOptions`
    * override `Table`-level `loadingOptions`. For example, if you set
    * `loadingOptions=[ TableLoadingOption.CELLS ]` on `Table` and
    * `loadingOptions=[ ColumnLoadingOption.HEADER ]` on a `Column`, the cells
    * in that column will _not_ show their loading state.
    */
  var loadingOptions: js.UndefOr[js.Array[ColumnLoadingOption]] = js.native
}

object IColumnProps {
  @scala.inline
  def apply(): IColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnProps]
  }
  @scala.inline
  implicit class IColumnPropsOps[Self <: IColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellRenderer(value: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderCellRenderer(value: /* columnIndex */ Double => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingOptions(value: js.Array[ColumnLoadingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(js.undefined)
        ret
    }
  }
  
}

