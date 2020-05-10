package typingsSlinky.griddleReact.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeadingProps extends js.Object {
  var TableHeadingCell: js.Any = js.native
  var columnIds: js.UndefOr[js.Array[Double]] = js.native
  var columnTitles: js.UndefOr[js.Array[String]] = js.native
}

object TableHeadingProps {
  @scala.inline
  def apply(TableHeadingCell: js.Any): TableHeadingProps = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingProps]
  }
  @scala.inline
  implicit class TableHeadingPropsOps[Self <: TableHeadingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableHeadingCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableHeadingCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIds")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTitles")(js.undefined)
        ret
    }
  }
  
}

