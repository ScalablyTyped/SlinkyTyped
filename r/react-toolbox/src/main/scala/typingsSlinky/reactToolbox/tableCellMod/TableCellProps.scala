package typingsSlinky.reactToolbox.tableCellMod

import typingsSlinky.reactToolbox.componentsMod.ReactToolbox.Props
import typingsSlinky.reactToolbox.reactToolboxStrings.asc
import typingsSlinky.reactToolbox.reactToolboxStrings.desc
import typingsSlinky.reactToolbox.reactToolboxStrings.td
import typingsSlinky.reactToolbox.reactToolboxStrings.th
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProps extends Props {
  /**
    * The column number of this cell.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * If true the cell is considered as numeric and the content will be displayed aligned to right.
    * @default false
    */
  var numeric: js.UndefOr[Boolean] = js.native
  /**
    * The row number of the cell.
    */
  var row: js.UndefOr[Double] = js.native
  /**
    * If you provide a value the cell will show an arrow pointing down or up depending on the value to indicate it is a sorted element. Useful only for columns.
    */
  var sorted: js.UndefOr[asc | desc] = js.native
  /**
    * The element tag, either `td` or `th`.
    * @default 'td'
    */
  var tagName: js.UndefOr[td | th] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableCellTheme] = js.native
}

object TableCellProps {
  @scala.inline
  def apply(): TableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellProps]
  }
  @scala.inline
  implicit class TableCellPropsOps[Self <: TableCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: td | th): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: TableCellTheme): Self = {
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
  }
  
}

