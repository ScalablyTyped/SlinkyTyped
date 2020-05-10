package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisGridOptions extends js.Object {
  /**
    * (Gantt) Set border color for the label grid lines.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Gantt) Set border width of the label grid lines.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set cell height for grid axis labels. By default this is
    * calculated from font size.
    */
  var cellHeight: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set specific options for each column (or row for horizontal axes)
    * in the grid. Each extra column/row is its own axis, and the axis options
    * can be set here.
    */
  var columns: js.UndefOr[js.Array[XAxisOptions]] = js.native
  /**
    * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
    * charts.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object ColorAxisGridOptions {
  @scala.inline
  def apply(): ColorAxisGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisGridOptions]
  }
  @scala.inline
  implicit class ColorAxisGridOptionsOps[Self <: ColorAxisGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[XAxisOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

