package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableSizeGridProps extends GridProps {
  /**
    * Average (or estimated) column width for unrendered columns.
    *
    * This value is used to calculated the estimated total width of a Grid before its columns have all been measured.
    * The estimated width impacts user scrolling behavior. It is updated whenever new columns are measured.
    */
  var estimatedColumnWidth: js.UndefOr[Double] = js.native
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[Double] = js.native
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: Double): Double = js.native
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: Double): Double = js.native
}

object VariableSizeGridProps {
  @scala.inline
  def apply(
    children: ReactComponentClass[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double
  ): VariableSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableSizeGridProps]
  }
  @scala.inline
  implicit class VariableSizeGridPropsOps[Self <: VariableSizeGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeight(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEstimatedColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowHeight")(js.undefined)
        ret
    }
  }
  
}

