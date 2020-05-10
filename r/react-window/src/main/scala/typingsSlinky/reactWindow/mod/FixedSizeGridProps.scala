package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedSizeGridProps extends GridProps {
  /**
    * Width of an individual column within the grid.
    */
  var columnWidth: Double = js.native
  /**
    * Height of an individual row within the grid.
    */
  var rowHeight: Double = js.native
}

object FixedSizeGridProps {
  @scala.inline
  def apply(
    children: ReactComponentClass[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double,
    width: Double
  ): FixedSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeGridProps]
  }
  @scala.inline
  implicit class FixedSizeGridPropsOps[Self <: FixedSizeGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

